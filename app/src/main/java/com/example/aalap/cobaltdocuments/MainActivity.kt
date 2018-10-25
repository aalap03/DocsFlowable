package com.example.aalap.cobaltdocuments

import android.content.Context
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.telephony.TelephonyManager
import android.util.Log
import com.example.aalap.cobaltdocuments.model.File
import com.example.aalap.cobaltdocuments.model.FileOrFolder
import com.example.aalap.cobaltdocuments.model.Folder
import io.reactivex.Flowable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.functions.BiFunction
import io.reactivex.schedulers.Schedulers
import io.realm.Realm
import io.realm.RealmList
import io.realm.RealmResults
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject
import retrofit2.Retrofit
import java.security.AccessController.getContext
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var create: RetrofitAPIService
    private var TAG = "MainActivity:"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        create = RetrofitCreator().retrofit().create(RetrofitAPIService::class.java)

        val jsonObject = JSONObject()
        Log.d(TAG, "json: $jsonObject")

        load_docs.setOnClickListener { authenticated("") }

    }

    private fun login() {
        val subscribe = create.authenticate(
            "https://auth-dev.e-cobalt.com/authenticate",
            "aalap03",
            "C@balt2018",
            UUID.randomUUID().toString(),
            "Cobalt_Android",
            "Version 2.0.6",
            "Android",
            Build.VERSION.RELEASE
        ).map {
            val jsonObject = JSONObject(it.body()?.string())
            val token = jsonObject.getString("token")
            Log.d(TAG, token)
            token
        }?.observeOn(AndroidSchedulers.mainThread())
            ?.subscribeOn(Schedulers.io())
            ?.subscribe({ t -> authenticated(t) },
                { t ->
                    t.printStackTrace()
                    Log.d("TAG", t.localizedMessage)
                })
    }

    private fun authenticated(token: String) {
        App().setToken(token)
        Log.d(TAG, "App token: ${App().getToken()}")
        create = RetrofitCreator().retrofit().create(RetrofitAPIService::class.java)
        val subscribe = create.getMobileAccess("https://file-dev.e-cobalt.com/mobile/mobileplan")
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ t ->
                val jsonObject = JSONObject(t.body()?.string())
                Realm.getDefaultInstance().use {
                    val filesArray = jsonObject.getJSONArray("files")
                    val foldersArray = jsonObject.getJSONArray("folders")

                    it.executeTransaction { realm ->
                        realm.createOrUpdateAllFromJson(File::class.java, filesArray)
                        realm.createOrUpdateAllFromJson(Folder::class.java, foldersArray)
                    }
                    filesArray
                }
            }, { t ->
                t.printStackTrace()
                Log.d(TAG, "doc: er ${t.localizedMessage}")
            })
    }

    fun getRootDocs() {

        val filesFlowable = Realm.getDefaultInstance().where(File::class.java)
            .isNull("parent")
            .findAllAsync()
            .sort("name")
            .asFlowable()

        val foldersFlowable = Realm.getDefaultInstance().where(Folder::class.java)
            .isNull("parent")
            .findAllAsync()
            .sort("name")
            .asFlowable()
    }
}

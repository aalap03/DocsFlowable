package com.example.aalap.cobaltdocuments.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

class Folder: RealmObject(), FileOrFolder {

    override fun name(): String {
        return name
    }

    override fun get_Id(): String {
        return _id
    }

    override fun isFile(): Boolean {
        return false
    }

    @PrimaryKey
    lateinit var _id: String
    private lateinit var name: String
    private var parent: String? = null
    private var module: String? = null
    private var icon: String? = null
    private var color: String? = null
    private var modifiedDate: Date? = null
    private var createdDate: Date? = null

    override fun toString(): String {
        return "Folder(_id='$_id', name='$name', parent=$parent, module=$module, icon=$icon, color=$color, modifiedDate=$modifiedDate, createdDate=$createdDate)"
    }
}
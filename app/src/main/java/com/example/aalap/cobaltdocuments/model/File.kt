package com.example.aalap.cobaltdocuments.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

class File: RealmObject(), FileOrFolder {

    @PrimaryKey
    lateinit var _id: String

    private lateinit var name: String

    private var parent: String? = null
    private var allowPrint: Boolean? = null
    private var allowEmail: Boolean? = null
    private var status: String? = null
    private var module: String? = null
    private var provider: String? = null
    private var fileName: String? = null
    private var updatedDate: Date? = null
    private var mime: String? = null
    private var text: String? = null
    private var size: Int = 0
    private var modifiedDate: Date? = null
    private var createdDate: Date? = null



    override fun name(): String {
        return name
    }

    override fun get_Id(): String {
        return _id
    }

    override fun isFile(): Boolean {
        return true
    }

    override fun toString(): String {
        return "File(_id='$_id', name='$name', parent=$parent, allowPrint=$allowPrint, allowEmail=$allowEmail, status=$status, module=$module, provider=$provider, fileName=$fileName, updatedDate=$updatedDate, mime=$mime, text=$text, size=$size, modifiedDate=$modifiedDate, createdDate=$createdDate)"
    }


}
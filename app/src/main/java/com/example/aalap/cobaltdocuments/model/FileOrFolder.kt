package com.example.aalap.cobaltdocuments.model

import io.realm.RealmModel

interface FileOrFolder: RealmModel {

    fun name(): String

    fun get_Id(): String

    fun isFile(): Boolean
}
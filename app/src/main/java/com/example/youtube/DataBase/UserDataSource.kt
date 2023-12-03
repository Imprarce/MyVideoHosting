package com.example.youtube.DataBase

import com.google.gson.Gson
import okhttp3.OkHttpClient
import okhttp3.Request

class UserDataSource {
    private val client = OkHttpClient()

    fun getUsers(): List {
        val request = Request.Builder()
            .url("https://your-api-url.com/api/users&#8221😉
                .build()

                val response = client.newCall(request).execute()

        val json = response.body?.string()
        val users = Gson().fromJson>(json, object : TypeToken>() {}.type)
        return users
    }
}
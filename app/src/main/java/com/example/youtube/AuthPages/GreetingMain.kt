package com.example.youtube.AuthPages

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.youtube.DataBase.UserDataSource
import com.example.youtube.MainPage
import com.example.youtubeprod.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class GreetingMain : AppCompatActivity() {
    private var navController: NavController? = null
    private val userDataSource = UserDataSource()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment?

        navController = navHostFragment!!.navController

        GlobalScope.launch(Dispatchers.Main) {
            val users = withContext(Dispatchers.IO) {
                userDataSource.getUsers()
    }

    fun onAuthorizationSuccess() {
        val intent = Intent(this, MainPage::class.java)
        startActivity(intent)
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }
}
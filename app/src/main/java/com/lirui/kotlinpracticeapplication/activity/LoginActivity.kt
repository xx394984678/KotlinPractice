package com.lirui.kotlinpracticeapplication.activity

import android.os.Bundle
import androidx.navigation.findNavController
import com.lirui.kotlinpracticeapplication.R

class LoginActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        return findNavController(R.id.login_nav_host_fragment).navigateUp();
//    }
}
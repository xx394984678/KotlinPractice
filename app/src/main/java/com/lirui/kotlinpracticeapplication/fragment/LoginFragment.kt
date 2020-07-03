package com.lirui.kotlinpracticeapplication.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.lirui.kotlinpracticeapplication.R
import com.lirui.kotlinpracticeapplication.activity.MainActivity

class LoginFragment:BaseFragment() {
    private lateinit var mUserName:EditText
    private lateinit var mPassword:EditText
    private lateinit var mLoginBtn:Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mUserName = view.findViewById(R.id.fragment_login_user_name)
        mPassword = view.findViewById(R.id.fragment_login_user_password)
        mLoginBtn = view.findViewById(R.id.fragment_login_btn)

        val name = arguments?.getString("userName")
        val password = arguments?.getString("userPassword")

        mUserName.setText(name)
        mPassword.setText(password)
        mLoginBtn.setOnClickListener(this)
        Log.d(TAG, "get data ,str is ${arguments?.getString("strData")}")
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_login
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.fragment_login_btn -> {
                val intent = Intent(context, MainActivity::class.java)
                context?.startActivity(intent)
                finishParentActivity()
            }
        }
    }
}
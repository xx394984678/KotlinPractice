package com.lirui.kotlinpracticeapplication.fragment

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController
import com.lirui.kotlinpracticeapplication.R

class RegisterFragment : BaseFragment() {
    private lateinit var mUserName: EditText
    private lateinit var mPassword: EditText
    private lateinit var mRegisterBtn: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mUserName = view.findViewById(R.id.fragment_register_user_name)
        mPassword = view.findViewById(R.id.fragment_register_user_password)
        mRegisterBtn = view.findViewById(R.id.fragment_register_btn)

        mRegisterBtn.setOnClickListener(this)
        Log.d(TAG, "get data ,str is ${arguments?.getString("strData")}")
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_register
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.fragment_register_btn -> {
                val bundle = Bundle()
                bundle.putString("strData", "i'm from register fragment,to login fragment")
                bundle.putString("userName", mUserName.text.toString())
                bundle.putString("userPassword", mPassword.text.toString())
                findNavController().navigate(R.id.action_registerFragment_to_loginFragment, bundle)
            }
            else -> {
            }
        }
    }
}
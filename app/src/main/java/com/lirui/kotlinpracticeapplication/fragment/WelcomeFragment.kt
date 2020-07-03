package com.lirui.kotlinpracticeapplication.fragment

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.lirui.kotlinpracticeapplication.R

class WelcomeFragment : BaseFragment() {
    private lateinit var mLoginBtn: Button
    private lateinit var mRegisterBtn: Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mLoginBtn = view.findViewById(R.id.fragment_welcome_to_login)
        mRegisterBtn = view.findViewById(R.id.fragment_welcome_to_register)

        mLoginBtn.setOnClickListener(this)
        mRegisterBtn.setOnClickListener(this)
    }

    override fun getLayoutResourceId(): Int {
        return R.layout.fragment_welcome
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.fragment_welcome_to_login -> {
                val bundle = Bundle()
                bundle.putString("strData", "i'm from welcome fragment,to login fragment")
                findNavController().navigate(R.id.action_welcomeFragment_to_loginFragment, bundle)
            }
            R.id.fragment_welcome_to_register -> {
                val bundle = Bundle()
                bundle.putString("strData", "i'm from welcome fragment,to register fragment")
                findNavController().navigate(R.id.action_welcomeFragment_to_registerFragment, bundle)
            }
        }
    }
}
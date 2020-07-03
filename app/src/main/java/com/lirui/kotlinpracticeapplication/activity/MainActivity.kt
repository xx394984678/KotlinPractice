package com.lirui.kotlinpracticeapplication.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lirui.kotlinpracticeapplication.R

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}

fun main() {
    println(
        "some thing"
    )
}
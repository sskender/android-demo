package com.example.sskender.demoapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.sskender.demoapp.model.UserInfo.firstName
import com.example.sskender.demoapp.model.UserInfo.lastName
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNameTextView.text = firstName
        lastNameTextView.text = lastName

    }

}

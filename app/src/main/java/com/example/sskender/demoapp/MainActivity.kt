package com.example.sskender.demoapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.sskender.demoapp.model.UserInfo
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        updateTextView()

        editButton.setOnClickListener {
            editAction()
        }
    }


    /**
     * Set text views to values from UserInfo model
     */
    private fun updateTextView() {
        firstNameTextView.text = UserInfo.firstName
        lastNameTextView.text = UserInfo.lastName
    }


    /**
     * This method is called when Edit button is clicked
     */
    private fun editAction() {
        val intent = Intent(this, EditUserInfo::class.java)
        startActivity(intent)
    }


    override fun onResume() {
        super.onResume()

        updateTextView()
    }

}

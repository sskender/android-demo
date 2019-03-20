package com.example.sskender.demoapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.sskender.demoapp.model.UserInfo
import kotlinx.android.synthetic.main.activity_edituserinfo.*

class EditUserInfo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edituserinfo)

        updateTextView()

        saveButton.setOnClickListener {
            updateUserInfoModel()
            finish()
        }
    }


    /**
     * Update text views from UserInfo model
     */
    private fun updateTextView() {
        firstNameTextEdit.setText(UserInfo.firstName)
        lastNameTextEdit.setText(UserInfo.lastName)
    }


    /**
     * Update UserInfo model from text edits
     */
    private fun updateUserInfoModel() {
        UserInfo.firstName = firstNameTextEdit.text.toString()
        UserInfo.lastName = lastNameTextEdit.text.toString()
    }

}

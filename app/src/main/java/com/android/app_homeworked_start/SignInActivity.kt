package com.android.app_homeworked_start

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btn = findViewById<Button>(R.id.btn_sign_up)
        btn.setOnClickListener {
           val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}
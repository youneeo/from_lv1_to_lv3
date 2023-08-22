package com.android.app_homeworked_start

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val btn = findViewById<Button>(R.id.btn_finish)
        btn.setOnClickListener {
            finish()
        }
    }
}
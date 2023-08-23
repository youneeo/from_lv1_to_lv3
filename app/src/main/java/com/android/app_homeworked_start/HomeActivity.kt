package com.android.app_homeworked_start

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val home_id = findViewById<TextView>(R.id.home_id)

        if (intent.hasExtra("id")){
        home_id.text ="아이디: "+ intent.getStringExtra("id")
        }

        val btn_closed = findViewById<Button>(R.id.btn_finish)
        btn_closed.setOnClickListener {
            finish()
        }
    }
}
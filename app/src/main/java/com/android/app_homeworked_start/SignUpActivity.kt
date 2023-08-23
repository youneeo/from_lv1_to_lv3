package com.android.app_homeworked_start

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.android.app_homeworked_start.R.id.btn_sign_up_2

class SignUpActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)


        val et_name = findViewById<EditText>(R.id.et_name)
        val et_id = findViewById<EditText>(R.id.et_id_sign_up)
        val et_psw = findViewById<EditText>(R.id.et_psw_sign_up)
        val btn = findViewById<Button>(btn_sign_up_2)
        
        btn.setOnClickListener {
            if(et_name.toString().trim().isEmpty() or et_id.toString().trim().isEmpty() or et_psw.toString().trim().isEmpty()){
                Toast.makeText(this, "입력되지않은 정보가 있습니다", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }
}

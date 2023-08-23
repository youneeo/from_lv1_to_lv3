package com.android.app_homeworked_start

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignInActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        val btn_sign_in = findViewById<Button>(R.id.btn_sign_in)
        val btn_sign_up = findViewById<Button>(R.id.btn_sign_up)
        val et_id = findViewById<EditText>(R.id.et_sign_in_put_id)
        val et_psw = findViewById<EditText>(R.id.et_sign_in_put_psw)

        if (et_id.text.toString().trim().isEmpty() or et_psw.toString().trim().isEmpty()){

            Toast.makeText(this, getString(R.string.toast_msg_idpswerr), Toast.LENGTH_SHORT).show() //xml파일에서는 @로 string 을 꺼내지만 코틀린파일에선 getstirng 으로 꺼낸다

        }
        btn_sign_in.setOnClickListener {
            if (et_id.text.toString().trim().isEmpty() or et_psw.toString().trim().isEmpty()){

                Toast.makeText(this, getString(R.string.toast_msg_idpswerr), Toast.LENGTH_SHORT).show() //xml파일에서는 @로 string 을 꺼내지만 코틀린파일에선 getstirng 으로 꺼낸다
                return@setOnClickListener //여기서 끝나야 뒤에꺼가 실행이 안되서 여기서 return 해줌.
            }
            val intent = Intent(this,HomeActivity::class.java)
            intent.putExtra("id",et_id.text.toString())
        }
        btn_sign_up.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
    }

}

//private val textWatcher = object : TextWatcher {
//        override fun afterTextChanged(s: Editable?) {
//            val text1 = editText1.text.toString().trim()
//            val text2 = editText2.text.toString().trim()
//
//            // 두 EditText 모두 비어있지 않으면 버튼 활성화
//            button1.isEnabled = text1.isNotEmpty() && text2.isNotEmpty()
//        }
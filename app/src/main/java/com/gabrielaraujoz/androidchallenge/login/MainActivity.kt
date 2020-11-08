package com.gabrielaraujoz.androidchallenge.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.register.RegisterActivity
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonRegister = findViewById<MaterialButton>(R.id.btnRegister)
        val buttonLogin = findViewById<MaterialButton>(R.id.btnLogin)

        buttonRegister.setOnClickListener(){
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
}
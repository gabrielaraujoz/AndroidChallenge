package com.gabrielaraujoz.androidchallenge.register

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gabrielaraujoz.androidchallenge.R

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }
}
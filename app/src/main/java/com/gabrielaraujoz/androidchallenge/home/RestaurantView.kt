package com.gabrielaraujoz.androidchallenge.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gabrielaraujoz.androidchallenge.R

class RestaurantView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_view)

        val pratos = intent.getBundleExtra("Pratos")


    }
}
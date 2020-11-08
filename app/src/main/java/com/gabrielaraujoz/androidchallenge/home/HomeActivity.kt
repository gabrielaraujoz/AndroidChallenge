package com.gabrielaraujoz.androidchallenge.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.home.model.Restaurant
import com.gabrielaraujoz.androidchallenge.home.model.TestFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var viewManager: GridLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RestaurantAdapter
    private lateinit var listaRestaurantes: List<Restaurant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewManager = GridLayoutManager(this, 1)
        listaRestaurantes = TestFragment.restaurant

        recyclerView = findViewById<RecyclerView>(R.id.minhaLista)
        viewAdapter = RestaurantAdapter(listaRestaurantes) {

        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }


    }


}
package com.gabrielaraujoz.androidchallenge.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.home.model.Restaurant
import com.gabrielaraujoz.androidchallenge.home.data.RestaurantDatabaseFragment

class HomeActivity : AppCompatActivity() {

    private lateinit var viewManager: GridLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: HomeAdapter
    private lateinit var listaRestaurantes: List<Restaurant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewManager = GridLayoutManager(this, 1)
        listaRestaurantes = RestaurantDatabaseFragment.restaurant

        recyclerView = findViewById<RecyclerView>(R.id.minhaLista)
        viewAdapter = HomeAdapter(listaRestaurantes) {
            val intent = Intent(this, RestaurantView::class.java)
            intent.putExtra("Nome", it.nome)

            startActivity(intent)

        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }


    }


}
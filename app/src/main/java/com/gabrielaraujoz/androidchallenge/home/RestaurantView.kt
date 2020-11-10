package com.gabrielaraujoz.androidchallenge.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.home.data.RestaurantDatabaseFragment
import com.gabrielaraujoz.androidchallenge.home.model.Restaurant

class RestaurantView : AppCompatActivity() {

    private lateinit var restaurante: Restaurant
    private lateinit var nome: String
    private lateinit var viewManager: GridLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: HomeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_view)

        nome = intent.getStringExtra("Nome")!!

        encontrarRestaurante(nome)




    }

    fun encontrarRestaurante(nome: String) {
        RestaurantDatabaseFragment.restaurant.forEach() {
            if (nome == it.nome) {
                restaurante = it
            }
        }
    }
}
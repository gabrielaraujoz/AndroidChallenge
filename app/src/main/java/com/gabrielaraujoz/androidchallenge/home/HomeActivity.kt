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
    private lateinit var viewAdapter: RestaurantAdapter
    private lateinit var listaRestaurantes: List<Restaurant>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        viewManager = GridLayoutManager(this, 1)
        listaRestaurantes = RestaurantDatabaseFragment.restaurant

        recyclerView = findViewById<RecyclerView>(R.id.minhaLista)
        viewAdapter = RestaurantAdapter(listaRestaurantes) {
            val intent = Intent(this, RestaurantView::class.java)
            val index = listaRestaurantes.indexOf(it)
            val bundle = bundleOf(Pair("Prato", it.pratos))
            intent.putExtra("Nome", it.nome)
            intent.putExtra("Imagem", it.imagem)
            intent.putExtra("NomePratos", it.pratos[index].nomePrato)
            intent.putExtra("ImagemPratos", it.pratos[index].imagem)
            intent.putExtra("DescricaoPratos", it.pratos[index].descricao)
            intent.putExtra("Pratos", bundle)
            startActivity(intent)

        }

        recyclerView.apply {
            setHasFixedSize(true)

            layoutManager = viewManager
            adapter = viewAdapter
        }


    }


}
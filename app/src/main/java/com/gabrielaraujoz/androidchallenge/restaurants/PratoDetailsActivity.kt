package com.gabrielaraujoz.androidchallenge.restaurants

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.gabrielaraujoz.androidchallenge.R

class PratoDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prato_details)

        val nome = intent.getStringExtra("NomePrato")
        val descricao = intent.getStringExtra("DescricaoPrato")
        //val imagem = intent.getIntExtra("ImagemPrato")

        val nomePrato = findViewById<TextView>(R.id.txtNomePratoDetails)
        nomePrato.text = nome
        val descricaoPrato = findViewById<TextView>(R.id.txtDescricaoPratoDetails)
        descricaoPrato.text = descricao
        val imagemPrato = findViewById<ImageView>(R.id.imgPratoDetails)
        //imagemPrato.setImageResource(imagem)

    }
}
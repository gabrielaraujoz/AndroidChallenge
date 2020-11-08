package com.gabrielaraujoz.androidchallenge.home.model

import android.media.Image

data class Restaurant(val nome: String, val endereco: String, val horarioFechamento: String, val imagem: Image,val pratos: List<Prato>) {
}
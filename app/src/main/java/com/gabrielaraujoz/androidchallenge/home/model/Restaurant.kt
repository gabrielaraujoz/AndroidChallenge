package com.gabrielaraujoz.androidchallenge.home.model

import android.graphics.drawable.Drawable
import android.media.Image

data class Restaurant(val nome: String, val endereco: String, val horarioFechamento: String, val imagem: Int,val pratos: List<Prato>) {
}
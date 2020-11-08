package com.gabrielaraujoz.androidchallenge.home.model

data class Restaurant(private val nome: String, private val endereco: String, private val horarioFechamento: String, private val pratos: List<Prato>) {
}
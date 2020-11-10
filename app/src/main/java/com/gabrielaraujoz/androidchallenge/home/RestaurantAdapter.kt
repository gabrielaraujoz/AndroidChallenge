package com.gabrielaraujoz.androidchallenge.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.home.model.Restaurant

class RestaurantAdapter (private val restaurantes: List<Restaurant>, private val listener: (Restaurant) -> Unit): RecyclerView.Adapter<RestaurantAdapter.RestaurantViewHolder>() {

    class RestaurantViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val restaurantNome by lazy {view.findViewById<TextView>(R.id.txtCardNome)}
        private val restaurantEndereco by lazy {view.findViewById<TextView>(R.id.txtCardEndereco)}
        private val restaurantHorario by lazy {view.findViewById<TextView>(R.id.txtCardHorario)}
        private val restaurantImagem by lazy {view.findViewById<ImageView>(R.id.cardImage)}

        fun bind (restaurante: Restaurant) {
            restaurantNome.text = restaurante.nome
            restaurantEndereco.text = restaurante.endereco
            restaurantHorario.text = "Fecha às ${restaurante.horarioFechamento}."

            restaurantImagem.setImageResource(restaurante.imagem)
            val position = adapterPosition

        }




    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.restaurants_card_view, parent, false )

        return RestaurantViewHolder(view)    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        val item = restaurantes[position]
        holder.bind(restaurantes[position])
        holder.itemView.setOnClickListener { listener(item) }    }

    override fun getItemCount() = restaurantes.size
}
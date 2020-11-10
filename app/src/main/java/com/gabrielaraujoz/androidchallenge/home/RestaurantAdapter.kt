package com.gabrielaraujoz.androidchallenge.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.home.model.Prato
import com.gabrielaraujoz.androidchallenge.home.model.Restaurant

class RestaurantAdapter (private val pratos: List<Prato>, private val listener: (Prato) -> Unit): RecyclerView.Adapter<RestaurantAdapter.PratosViewHolder>() {
    class PratosViewHolder(view: View): RecyclerView.ViewHolder(view) {

        private val pratoNome by lazy {view.findViewById<TextView>(R.id.txtPratoCardView)}
        private val pratoImagem by lazy {view.findViewById<ImageView>(R.id.imgPratoCardView)}

        fun bind (prato: Prato) {

            pratoNome.text = prato.nomePrato
            pratoImagem.setImageResource(prato.imagem)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PratosViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.pratos_card_view, parent, false )

        return RestaurantAdapter.PratosViewHolder(view)
    }

    override fun onBindViewHolder(holder: PratosViewHolder, position: Int) {
        val item = pratos[position]
        holder.bind(pratos[position])
        holder.itemView.setOnClickListener { listener(item) }    }

    override fun getItemCount() = pratos.size

}
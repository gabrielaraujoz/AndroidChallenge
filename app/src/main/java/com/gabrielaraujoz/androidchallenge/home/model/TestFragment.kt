package com.gabrielaraujoz.androidchallenge.home.model

import android.content.res.Resources
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.gabrielaraujoz.androidchallenge.R

class TestFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false)
    }

    companion object {

        val imagem = Resources.getSystem().getIdentifier("restaurant_photo_1", "drawable", "android")

        val restaurant = listOf(Restaurant("Restaurante 1", "Teste 1", "22:00", imagem,listOf<Prato>()))
    }
}
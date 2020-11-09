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

        val imagemRestauranteUm = R.drawable.restaurant_photo_1
        val imagemRestauranteDois = R.drawable.restaurant2
        val imagemRestauranteTres = R.drawable.restaurant3
        val imagemRestauranteQuatro = R.drawable.restaurant4

        val restaurant = listOf(
            Restaurant("Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "22:00",
                imagemRestauranteUm,
                listOf<Prato>()),
            Restaurant("Ayoama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "00:00",
                imagemRestauranteDois,
                listOf<Prato>()),
            Restaurant("Outback - Moema",
                "Av. Moaci, 187, 187 - Moema - São Paulo",
                "00:00",
                imagemRestauranteTres,
                listOf<Prato>()),
            Restaurant("Sí Señor!",
                "Alameda Jauaperi, 626 - Moema",
                "01:00",
                imagemRestauranteQuatro,
                listOf<Prato>())
        )
    }
}
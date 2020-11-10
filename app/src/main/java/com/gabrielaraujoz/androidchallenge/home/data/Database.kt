package com.gabrielaraujoz.androidchallenge.home.data


import com.gabrielaraujoz.androidchallenge.R
import com.gabrielaraujoz.androidchallenge.home.model.Prato
import com.gabrielaraujoz.androidchallenge.home.model.Restaurant

class Database {



    companion object {

        val imagemRestauranteUm = R.drawable.restaurant1
        val imagemRestauranteDois = R.drawable.restaurant2
        val imagemRestauranteTres = R.drawable.restaurant3
        val imagemRestauranteQuatro = R.drawable.restaurant4
        val imagemPratoOutback = R.drawable.ribsonthebarbie
        val imagemPratoSiSenor = R.drawable.tex

        val restaurant = listOf(
            Restaurant("Tony Roma's",
                "Av. Lavandisca, 717 - Indianópolis, São Paulo",
                "22:00",
                imagemRestauranteUm,
                listOf<Prato>(
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteDois,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                )),
            Restaurant("Ayoama - Moema",
                "Alameda dos Arapanés, 532 - Moema",
                "00:00",
                imagemRestauranteDois,
                listOf<Prato>(
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Salada com molho Gengibre",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                    Prato("Camarão super especial",
                        imagemRestauranteUm,
                        "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis."),
                )),
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
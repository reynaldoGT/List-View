package com.example.lista

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var frutas:ArrayList<Fruta> = ArrayList()
        frutas.add(Fruta("manzana",R.drawable.manzana))
        frutas.add(Fruta("durazno",R.drawable.durazno))
        frutas.add(Fruta("Platano",R.drawable.platano))
        frutas.add(Fruta("Sandía",R.drawable.sandia))


        val lista = findViewById<ListView>(R.id.FruitsList) as ListView

        //val adaptador = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,frutas) as ListAdapter
        val adaptador = AdaptadorCustom(this,frutas)

        lista.adapter = adaptador

        lista.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            Toast.makeText(this,frutas.get(position).nombre,Toast.LENGTH_SHORT).show()
        }
    }
}



package com.example.palavrasword30

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.ScrollView
import androidx.core.util.rangeTo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


       val listaScrollView = findViewById<ListView>(R.id.scrollViewId)
      //val lista = arrayOf("A", "B" , "C")

       // val lista = (100).rangeTo(1001).toList()
        // val lista = (100).downTo(1).toList()
       val lista = ('A').rangeTo('Z').toList()


            val adapter = ArrayAdapter(this, R.layout.activity_text_view, lista)

            listaScrollView.setAdapter(adapter )

    }
}
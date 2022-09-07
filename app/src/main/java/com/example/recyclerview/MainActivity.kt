package com.example.recyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView= findViewById(R.id.recyclerView)

        val listOfFruits= getListOfFruits()
        val fruitAdaptor = FruitAdapter(listOfFruits)
        recyclerView.adapter= fruitAdaptor
        recyclerView.setHasFixedSize(true)
        fruitAdaptor.onItemClick={
            val intent= Intent(this,FruitDetails::class.java)
            intent.putExtra("FRUITS", it)
            startActivity(intent)

            }

    }
    private fun getListOfFruits(): List<Fruits>{
        val fruits= mutableListOf<Fruits>()
        fruits.add(Fruits("Mango", R.drawable.mango,"Packed with nutrients.\n" +
                "Low in calories.\n" +
                "May help prevent diabetes.\n" +
                "High in healthy plant compounds.\n" +
                "Contains immune-boosting nutrients.\n" +
                "Supports heart health.\n" +
                "May improve digestive health.\n" +
                "May support eye health."))
        fruits.add(Fruits("Apples", R.drawable.apple,""))
        fruits.add(Fruits("Pineapples", R.drawable.pineapple,""))
        fruits.add(Fruits("Plum", R.drawable.plum,""))
        fruits.add(Fruits("Dates", R.drawable.dates,""))
        fruits.add(Fruits("Grapes", R.drawable.grapes,""))
        fruits.add(Fruits("Tomatoes", R.drawable.tomatoes,""))
        fruits.add(Fruits("Blueberries", R.drawable.blueberries,""))
        fruits.add(Fruits("Bananas", R.drawable.bananas,""))
        fruits.add(Fruits("Cranberries", R.drawable.cranberries,""))
        fruits.add(Fruits("Strawberries", R.drawable.strawberries,""))
        fruits.add(Fruits("Cherries", R.drawable.cherries,""))
        return fruits
    }
}
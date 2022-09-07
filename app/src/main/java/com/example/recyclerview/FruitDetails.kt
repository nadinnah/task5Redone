package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitDetails : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)

        val fruits= intent.getParcelableExtra<Fruits>("FRUITS")
        if (fruits !=null){
            val textView:TextView= findViewById(R.id.detailedTextView)
            val imageView:ImageView= findViewById(R.id.detailedImageView)
            val textView2:TextView= findViewById(R.id.detailedTextView2)

            textView2.text= fruits.fruitsBenefits
            textView.text= fruits.fruitsName
            imageView.setImageResource(fruits.fruitsImage)
        }

    }
}
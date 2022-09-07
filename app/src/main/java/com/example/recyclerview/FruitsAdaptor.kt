package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitsList: List<Fruits>): RecyclerView.Adapter<FruitAdapter.FruitsViewHolder>() {
    var onItemClick: ((Fruits) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        val itemFruitsView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruits_item, parent, false)
        return FruitsViewHolder(itemFruitsView)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        val currentFruits = fruitsList[position]
        holder.bindFruits(currentFruits)

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentFruits) }
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }

    inner class FruitsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        private val fruitName: TextView
        private val fruitImage: ImageView


        init {
            fruitName= itemView.findViewById(R.id.fruitName)
            fruitImage= itemView.findViewById(R.id.fruitImage)

        }

        fun bindFruits(fruits: Fruits){
            fruitName.text= fruits.fruitsName

            fruitImage.setImageResource(fruits.fruitsImage)
        }

    }
}
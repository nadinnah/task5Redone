package com.example.recyclerview

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Fruits(
    val fruitsName: String,
    val fruitsImage: Int,
    val fruitsBenefits: String?
) : Parcelable {

}

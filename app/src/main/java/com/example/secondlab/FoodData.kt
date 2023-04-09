package com.example.secondlab

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FoodData(
    val name: String,
    val desc: String,
    val desc2: String,
    val imageURL: String
) : Parcelable
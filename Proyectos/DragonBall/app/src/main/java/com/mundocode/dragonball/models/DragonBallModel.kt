package com.mundocode.dragonball.models

import com.google.gson.annotations.SerializedName

data class DragonBallModel(
    @SerializedName("items")
    val ListItems: List<DragonBallLista>
)

data class DragonBallLista (
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("ki")
    val ki: String,
    @SerializedName("maxKi")
    val maxKi: String,
    @SerializedName("race")
    val race: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val image: String,
)
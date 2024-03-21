package com.mundocode.dragonball.network.service

import com.mundocode.dragonball.models.DragonBallModel
import retrofit2.Response
import retrofit2.http.GET

interface allCharactersModel {
    @GET("characters?page=1&limit=58")
    suspend fun obtenerPersonajes(): Response<DragonBallModel>
}
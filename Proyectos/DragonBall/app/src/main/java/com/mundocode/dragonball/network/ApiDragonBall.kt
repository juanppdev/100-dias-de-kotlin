package com.mundocode.dragonball.network

import com.mundocode.dragonball.models.DragonBallModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiDragonBall {

    @GET("characters")
    suspend fun obtenerPersonajes(): Response<DragonBallModel>

}
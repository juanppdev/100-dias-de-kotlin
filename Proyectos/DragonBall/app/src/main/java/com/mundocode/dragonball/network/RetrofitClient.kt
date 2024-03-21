package com.mundocode.dragonball.network

import com.mundocode.dragonball.network.service.allCharactersModel
import com.mundocode.dragonball.utils.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    val retrofit: allCharactersModel by lazy {
        Retrofit
            .Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(allCharactersModel::class.java)
    }
}
package com.mundocode.jetpackcomposeinstagram.login.data.network

import com.mundocode.jetpackcomposeinstagram.login.data.network.response.LoginResponse
import retrofit2.Response
import retrofit2.http.GET

interface LoginClient {
    @GET("/v3/f228484b-6284-4a13-965a-8fa5d08449c6")
    suspend fun doLogin(): Response<LoginResponse>
}
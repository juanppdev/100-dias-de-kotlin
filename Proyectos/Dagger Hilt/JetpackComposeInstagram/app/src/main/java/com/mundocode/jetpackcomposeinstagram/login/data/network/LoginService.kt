package com.mundocode.jetpackcomposeinstagram.login.data.network

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginService @Inject constructor(private val LoginClient: LoginClient) {
    //private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String): Boolean {
        return withContext(Dispatchers.IO) {
            val response = LoginClient.doLogin()
            response.body()?.success ?: false
        }
    }
}
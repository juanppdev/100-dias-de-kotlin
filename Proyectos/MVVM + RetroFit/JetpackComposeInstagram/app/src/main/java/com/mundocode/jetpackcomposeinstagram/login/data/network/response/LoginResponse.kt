package com.mundocode.jetpackcomposeinstagram.login.data.network.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(@SerializedName("success") val success: Boolean)
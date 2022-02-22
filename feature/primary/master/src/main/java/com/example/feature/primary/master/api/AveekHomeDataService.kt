package com.example.feature.primary.master.api

import com.example.feature.primary.master.model.login.LoginResponseRemote
import com.example.feature.primary.master.model.login.forgotPassword.ForgotPasswordResponseRemote
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AveekHomeDataService {
    @POST("api/login")
    suspend fun loginRequest(@Body user : Map<String , String>) : Response<LoginResponseRemote>

    @POST("api/forgot-password")
    suspend fun forgotPasswordRequest(@Body userName : Map<String, String>) : Response<ForgotPasswordResponseRemote>
}
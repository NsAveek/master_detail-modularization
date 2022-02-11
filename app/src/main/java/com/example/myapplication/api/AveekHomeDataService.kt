package com.example.myapplication.api

import nbl.feature.primary.login.data.model.LoginResponseRemote
import nbl.feature.primary.login.data.model.forgotPassword.ForgotPasswordResponseRemote
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface AveekHomeDataService {
    @POST("api/login")
    suspend fun loginRequest(@Body user : Map<String , String>) : Response<LoginResponseRemote>

    @POST("api/forgot-password")
    suspend fun forgotPasswordRequest(@Body userName : Map<String, String>) : Response<ForgotPasswordResponseRemote>
}
package com.example.feature.primary.master.api

import com.example.feature.primary.master.data.model.remote.ImageResponse
import com.example.feature.primary.master.model.login.LoginResponseRemote
import com.example.feature.primary.master.model.login.forgotPassword.ForgotPasswordResponseRemote
import com.example.uicomponents.conf.PrivateConf.API_KEY
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query
import javax.inject.Inject

interface PixabayHomeDataService {

    @GET("/api/")
    suspend fun searchForImage(
        @Query("q") searchQuery : String,
        @Query("key") apiKey : String = "25611757-fd1576c22394e7d3d4b94dc09",
        @Query("page") page: Int,
        @Query("per_page") itemsPerPage: Int
    ) : ImageResponse

    @POST("api/login")
    suspend fun loginRequest(@Body user : Map<String , String>) : Response<LoginResponseRemote>

    @POST("api/forgot-password")
    suspend fun forgotPasswordRequest(@Body userName : Map<String, String>) : Response<ForgotPasswordResponseRemote>
}
package com.example.feature.primary.master.data


import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.model.login.LoginResponseRemote
import com.example.feature.primary.master.model.login.forgotPassword.ForgotPasswordResponseRemote
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */

// TODO : Throw JSON Object from Network Module as response

class AveekHomeDataSource @Inject constructor(private val service: PixabayHomeDataService) {

/*

    suspend fun login(userMap: HashMap<String, String>): Flow<ApiResponseResult<LoginResponseRemote>> {
        return flow {
            emit(ApiResponseResult.loading())
            val result = service.loginRequest(userMap)
            if (result.isSuccessful) {
                emit(ApiResponseResult.success(data = result.body()))
            } else {
                val errorResponseRemote: ErrorResponseRemote =
                    Gson().fromJson(
                        result.errorBody()?.charStream(),
                        ErrorResponseRemote::class.java
                    )
                errorResponseRemote?.let {
                    it.message?.let { msg ->
                        emit(ApiResponseResult.error(msg, result.code().toString()))
                    }
                }
            }
        }
    }

    suspend fun forgotPassword(email: HashMap<String, String>): Flow<ApiResponseResult<ForgotPasswordResponseRemote>> {
        return flow {
            emit(ApiResponseResult.loading())
            val result = service.forgotPasswordRequest(email)
            if (result.isSuccessful) {
                emit(ApiResponseResult.success(data = result.body(), message = result.message()))
            } else {
                val errorResponseRemote: ErrorResponseRemote =
                    Gson().fromJson(
                        result.errorBody()?.charStream(),
                        ErrorResponseRemote::class.java
                    )
                errorResponseRemote?.let {
                    it.message?.let { msg ->
                        emit(ApiResponseResult.error(msg, result.code().toString()))
                    }
                }
            }
        }
    }
*/

}
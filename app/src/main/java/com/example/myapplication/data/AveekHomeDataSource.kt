package com.example.myapplication.data
import aveek.core.network.ApiResponseResult
import aveek.core.network.dummyModelPackage.error.ErrorResponseRemote
import com.example.myapplication.api.AveekHomeDataService
import com.google.gson.Gson
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import nbl.feature.primary.login.data.model.LoginResponseRemote
import nbl.feature.primary.login.data.model.forgotPassword.ForgotPasswordResponseRemote
import javax.inject.Inject


/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */

// TODO : Throw JSON Object from Network Module as response

class AveekHomeDataSource @Inject constructor(private val service: AveekHomeDataService) {

    /*fun login(username: String, password: String): Result<LoggedInUser> {
        try {
            // TODO: handle loggedInUser authentication
            val fakeUser = LoggedInUser(java.util.UUID.randomUUID().toString(), "Jane Doe")
            return Result.Success(fakeUser)
        } catch (e: Throwable) {
            return Result.Error(IOException("Error logging in", e))
        }
    }*/
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

    fun logout() {
        // TODO: revoke authentication
    }
}
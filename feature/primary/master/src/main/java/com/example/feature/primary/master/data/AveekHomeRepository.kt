package com.example.feature.primary.master.data

import aveek.core.network.ApiResponseResult
import com.example.feature.primary.master.model.login.LoginResponseRemote
import com.example.feature.primary.master.model.login.forgotPassword.ForgotPasswordResponseRemote
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class AveekHomeRepository @Inject constructor (private val loginDataSource: AveekHomeDataSource) {

    suspend fun login(userMap : HashMap<String, String>): Flow<ApiResponseResult<LoginResponseRemote>> {
        return loginDataSource.login(userMap)
    }
    suspend fun forgotPassword(email : HashMap<String, String>): Flow<ApiResponseResult<ForgotPasswordResponseRemote>> {
        return loginDataSource.forgotPassword(email)
    }

}
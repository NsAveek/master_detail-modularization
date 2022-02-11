package nbl.feature.primary.login.data

import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.Flow
import nbl.core.network.ApiResponseResult
import nbl.feature.primary.login.data.model.LoggedInUser
import nbl.feature.primary.login.data.model.LoginResponseRemote
import nbl.feature.primary.login.data.model.forgotPassword.ForgotPasswordResponseRemote
import javax.inject.Inject


/**
 * Class that requests authentication and user information from the remote data source and
 * maintains an in-memory cache of login status and user credentials information.
 */

class AveekHomeRepository @Inject constructor (val loginDataSource: LoginDataSource) {

    // in-memory cache of the loggedInUser object
    var user: LoggedInUser? = null
        private set

    val isLoggedIn: Boolean
        get() = user != null

    init {
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
        user = null
    }

    fun logout() {
        user = null
        loginDataSource.logout()
    }

    suspend fun login(userMap : HashMap<String, String>): Flow<ApiResponseResult<LoginResponseRemote>> {
        return loginDataSource.login(userMap)
    }
    suspend fun forgotPassword(email : HashMap<String, String>): Flow<ApiResponseResult<ForgotPasswordResponseRemote>> {
        return loginDataSource.forgotPassword(email)
    }

    private fun setLoggedInUser(loggedInUser: LoggedInUser) {
        this.user = loggedInUser
        // If user credentials will be cached in local storage, it is recommended it be encrypted
        // @see https://developer.android.com/training/articles/keystore
    }
}
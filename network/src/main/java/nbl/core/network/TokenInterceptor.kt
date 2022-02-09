package nbl.core.network

import android.content.SharedPreferences
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class TokenInterceptor @Inject constructor(val sharedPreferences: SharedPreferences): Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {

        val sessionManager = sharedPreferences.getString(ConstantsClass.Constants.AUTH_TOKEN.name, null)

        val requestBuilder = chain.request().newBuilder()

        // If token has been saved, add it to the request
        sessionManager?.let {
            requestBuilder.addHeader("Authorization", "Bearer $it")
        }

        return chain.proceed(requestBuilder.build())
    }
}
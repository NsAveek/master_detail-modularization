package aveek.core.network

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface AveekCoreDataService {

    companion object {
        const val BASE_URL = "https://pixabay.com"
        const val NETWORK_PAGE_SIZE = 20
    }
}
package com.example.myapplication.api

import com.example.myapplication.data.NSDataRepository.Companion.NETWORK_PAGE_SIZE
import retrofit2.http.GET
import retrofit2.http.Query

// We can try Binds annotation to implement and inject CatsDataService using Hilt.
// Can have a look at https://svvashishtha.medium.com/using-room-with-hilt-cb57a1bc32f
interface NSDataService {

    companion object {
        const val BASE_URL = "https://api.thecatapi.com/v1/images/"
//
//        fun create(): CatsDataService {
//            val logger = HttpLoggingInterceptor()
//            logger.level = HttpLoggingInterceptor.Level.BASIC
//
//            val client = OkHttpClient.Builder()
//                .addInterceptor(logger)
//                .build()
//            return Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .client(client)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
//                .build()
//                .create(CatsDataService::class.java)
//        }
    }

    @GET("search")
    //@Query("has_breeds") hasBreeds : Boolean = true,
    suspend fun getCats(@Query("limit") pageSize: Int = NETWORK_PAGE_SIZE,
                        @Query("page") pageNumber: Int,
                        @Query("include_categories") includeCategories : Boolean = true,
                        @Query("mime_types") mimeType: String = "png",) : CatsDataResponse


}
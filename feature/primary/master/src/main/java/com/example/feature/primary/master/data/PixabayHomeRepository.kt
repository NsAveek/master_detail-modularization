package com.example.feature.primary.master.data

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.data.model.remote.ImageResult
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PixabayHomeRepository @Inject constructor
    (private val service: PixabayHomeDataService,
     private val imageSearchDataSource: AveekHomeDataSource) {

    suspend fun searchImageRepo(queryString : String) : Flow<PagingData<ImageResult>>{
        return Pager(
            config = PagingConfig(pageSize = NETWORK_PAGE_SIZE, enablePlaceholders = false),
            pagingSourceFactory = { PixabayPagingSource(service, queryString) }
        ).flow
    }
//    suspend fun login(userMap : HashMap<String, String>): Flow<ApiResponseResult<LoginResponseRemote>> {
//        return imageSearchDataSource.login(userMap)
//    }
//    suspend fun forgotPassword(email : HashMap<String, String>): Flow<ApiResponseResult<ForgotPasswordResponseRemote>> {
//        return imageSearchDataSource.forgotPassword(email)
//    }

    companion object {
        private const val NETWORK_PAGE_SIZE = 50
    }

}
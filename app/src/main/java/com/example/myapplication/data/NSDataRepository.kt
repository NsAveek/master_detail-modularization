package com.example.myapplication.data

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import aveek.core.network.AveekDataService

class NSDataRepository (private val service : AveekDataService, private val database : CatsDatabase){

    fun getCatsStreamPagingSource() : Flow<PagingData<CatsDataResponseItem>>{
        return Pager(config = PagingConfig(NETWORK_PAGE_SIZE,enablePlaceholders = false),
            pagingSourceFactory = {CatsPagingSource(service)}).flow
    }

    fun getCatsStream() : Flow<PagingData<CatsDataResponseItem>>{
        @OptIn(ExperimentalPagingApi::class)
        return Pager(
            config = PagingConfig(NETWORK_PAGE_SIZE,
            prefetchDistance = 5 ,
            enablePlaceholders = false,
            initialLoadSize = NETWORK_PAGE_SIZE),
            remoteMediator = CatsRemoteMediator(service,database),
            pagingSourceFactory = {database.catsDao().getAllCatsDataFromDb()}).flow
    }
    // JumpThreshold
    // MAX_BOUND

    companion object {
        const val NETWORK_PAGE_SIZE = 20
    }
}
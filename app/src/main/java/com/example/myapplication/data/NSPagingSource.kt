package com.example.myapplication.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.myapplication.api.AveekHomeDataService
import com.example.myapplication.data.NSDataRepository.Companion.NETWORK_PAGE_SIZE
import retrofit2.HttpException
import java.io.IOException

private const val NS_STARTING_PAGE_INDEX = 1
class CatsPagingSource (private val service: AveekHomeDataService) : PagingSource<Int, CatsDataResponseItem> () {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, CatsDataResponseItem> {
        val nextPage = params.key?: NS_STARTING_PAGE_INDEX
        return try {

            val response = service.getCats(NETWORK_PAGE_SIZE,nextPage)
            val nextKey = if (response.isEmpty()){ // Next Key will be null if there is no other com.example.myapplication.data to load
                null
            }else{
//                nextPage+(params.loadSize/NETWORK_PAGE_SIZE)
                nextPage+1 // Else pass the next page number
            }
            LoadResult.Page(
                data = response as List<CatsDataResponseItem>,
                prevKey = if (nextPage == NS_STARTING_PAGE_INDEX) null else nextPage-1,
                nextKey = nextKey
            )
        }catch (exception : IOException){
            return LoadResult.Error(exception)
        }catch (exception : HttpException){
            return LoadResult.Error(exception)
        }

    }
    override fun getRefreshKey(state: PagingState<Int, CatsDataResponseItem>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)?:
            state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }
}
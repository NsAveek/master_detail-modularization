package com.example.feature.primary.master.data

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.feature.primary.master.api.PixabayHomeDataService
import com.example.feature.primary.master.data.AveekCoreDataService.Companion.NETWORK_PAGE_SIZE
import com.example.feature.primary.master.data.model.remote.ImageResult
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

private const val PIXABAY_STARTING_INDEX = 1

class PixabayPagingSource @Inject constructor(
    private val service: PixabayHomeDataService,
    private val query: String
) : PagingSource<Int, ImageResult>() {

    override fun getRefreshKey(state: PagingState<Int, ImageResult>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(anchorPosition)?.nextKey?.minus(1)
        }
    }

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ImageResult> {
        val position = params.key ?: PIXABAY_STARTING_INDEX
        val apiQuery = query
        return try {
            val response =
                service.searchForImage(query, page = position, itemsPerPage = params.loadSize)
            response?.let {
                val images = it.hits
                val nextKey = if (images.isEmpty()) {
                    null
                } else {
                    position + (params.loadSize / NETWORK_PAGE_SIZE)
                }
                LoadResult.Page(
                    data = images,
                    prevKey = if (position == PIXABAY_STARTING_INDEX) null else position - 1,
                    nextKey = nextKey
                )
            }
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}

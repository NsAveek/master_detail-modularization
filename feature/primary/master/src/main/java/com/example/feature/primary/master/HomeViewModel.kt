package com.example.feature.primary.master

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.insertSeparators
import androidx.paging.map
import com.example.feature.primary.master.data.PixabayHomeRepository
import com.example.feature.primary.master.data.model.local.UiModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor
    ( private val repository: PixabayHomeRepository): ViewModel() {

    suspend fun fetchImagesFromServer() : Flow<PagingData<UiModel>>{

            return repository.searchImageRepo("yellow+flower")
                .map {pagingData ->
                         pagingData.map {
                            UiModel.Response(it)
                        }
                }
                .map {
                    it.insertSeparators<UiModel.Response,UiModel>{
                            before, after ->
                        if(after == null){
                            return@insertSeparators null
                        }
                        if (before == null){
                            return@insertSeparators UiModel.ItemSeparator("Hi Aveek")
                        }
                        else{
                            null
                        }
                    }
                }
                .cachedIn(viewModelScope)
    }
}
package com.example.feature.primary.master

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import com.example.feature.primary.master.data.PixabayHomeRepository
import com.example.feature.primary.master.data.model.remote.ImageResponse
import com.example.feature.primary.master.data.model.remote.ImageResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor
    ( private val repository: PixabayHomeRepository,
      private val savedStateHandle: SavedStateHandle): ViewModel() {

    private val _dataList = MutableStateFlow(mutableListOf<Object>())
    val data = _dataList

    fun fetchImagesFromServer() : Flow<PagingData<ImageResult>>{
        viewModelScope.launch {
            repository.searchImageRepo("")
        }
    }

}
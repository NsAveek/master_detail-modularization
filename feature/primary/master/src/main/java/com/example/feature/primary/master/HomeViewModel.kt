package com.example.feature.primary.master

import androidx.lifecycle.ViewModel
import com.example.feature.primary.master.data.PixabayHomeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor( private val repository: PixabayHomeRepository): ViewModel() {
    // TODO: Implement the ViewModel

    private val _dataList = MutableStateFlow(mutableListOf<Object>())
    val data = _dataList

    fun fetchImagesFromServer(){

    }

}
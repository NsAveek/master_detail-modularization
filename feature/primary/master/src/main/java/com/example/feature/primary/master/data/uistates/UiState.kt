package com.example.feature.primary.master.data.uistates

import com.example.feature.primary.master.data.model.remote.ImageResponse

data class UiState(
    val query : String,
    val searchResult : ImageResponse
)

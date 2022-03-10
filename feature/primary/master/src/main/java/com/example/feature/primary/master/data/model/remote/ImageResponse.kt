package com.example.feature.primary.master.data.model.remote

data class ImageResponse(
    val hits : List<ImageResult>,
    val total : Int,
    val totalHits : Int
)

package com.example.feature.primary.master.data.model.local

import com.example.feature.primary.master.data.model.remote.ImageResult

sealed class UiModel{
    data class Response (val imageResult : ImageResult) : UiModel ()
    data class ItemSeparator (val description : String) : UiModel ()
}

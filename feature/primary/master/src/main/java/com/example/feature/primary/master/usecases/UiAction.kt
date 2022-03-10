package com.example.feature.primary.master.usecases

sealed class UiAction{
    data class Scroll(
        val visibleItemCount: Int,
        val lastVisibleItemPosition: Int,
        val totalItemCount: Int
    ) : UiAction()
}

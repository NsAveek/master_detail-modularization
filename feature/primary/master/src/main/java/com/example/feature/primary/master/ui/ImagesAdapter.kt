package com.example.feature.primary.master.ui

import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.feature.primary.master.R
import com.example.feature.primary.master.data.model.local.UiModel
import com.example.feature.primary.master.data.model.remote.ImageResult
import java.lang.UnsupportedOperationException

class ImagesAdapter : PagingDataAdapter<UiModel, RecyclerView.ViewHolder> (IMAGE_COMPARATOR) {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val uiModel = getItem(position)
        uiModel.let {
            when (uiModel){
                is UiModel.Response -> (holder as ImageViewHolder).bind(uiModel.imageResult)
                is UiModel.ItemSeparator -> (holder as SeparatorViewHolder).bind(uiModel.description)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return if (viewType == R.layout.layout_flower_single){
            ImageViewHolder.create(parent)
        }else{
            SeparatorViewHolder.create(parent)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)){
            is UiModel.Response -> R.layout.layout_flower_single
            is UiModel.ItemSeparator -> R.layout.home_fragment
            null -> throw UnsupportedOperationException("Unknown View")
        }
    }

    companion object{
        private val IMAGE_COMPARATOR = object : DiffUtil.ItemCallback<UiModel>(){
            override fun areItemsTheSame(oldItem: UiModel, newItem: UiModel): Boolean {
                return (oldItem is UiModel.Response && newItem is UiModel.Response &&
                        oldItem.imageResult.id == newItem.imageResult.id)
                        || (oldItem is UiModel.ItemSeparator && newItem is UiModel.ItemSeparator &&
                        oldItem.description == newItem.description)
            }

            override fun areContentsTheSame(oldItem: UiModel, newItem: UiModel): Boolean =
                oldItem == newItem

        }
    }
}
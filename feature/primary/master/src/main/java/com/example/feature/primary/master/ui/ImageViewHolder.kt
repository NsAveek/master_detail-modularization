package com.example.feature.primary.master.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.feature.primary.master.R
import com.example.feature.primary.master.data.model.remote.ImageResult

class ImageViewHolder (private val view : View): RecyclerView.ViewHolder(view) {

    private val productImage : ImageView = view.findViewById(R.id.prod_image)

    init {
        view.setOnClickListener{
            // TODO : Load the Details Screen
            // view.context..startActivity
        }
    }

    fun bind(imageResult: ImageResult){
        if (imageResult == null){
            // TODO : Do Something with the Null value. i.e : Show Loading Error
        }else{
            showImageData(imageResult)
        }
    }

    private fun showImageData(imageResult: ImageResult) {
        Glide.with(view.context).load(imageResult.previewURL)
            .placeholder(R.drawable.cam)
            .error(R.drawable.ic_launcher_background)
            .into(productImage);
    }

    companion object{
        fun create( parent : ViewGroup) : ImageViewHolder{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_image_single,parent, false)
            return ImageViewHolder(view)
        }
    }


}
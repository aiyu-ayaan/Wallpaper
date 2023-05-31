package com.atech.wallpaper.ui.fragments.wallpaper.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.RoundedCornersTransformation
import com.atech.wallpaper.R
import com.atech.wallpaper.data.model.DiffUtilCallback
import com.atech.wallpaper.data.model.PhotoModel
import com.atech.wallpaper.databinding.RowImageBinding

class PhotoAdapter : ListAdapter<PhotoModel, PhotoAdapter.PhotoViewHolder>(DiffUtilCallback()) {

    inner class PhotoViewHolder(private val binding: RowImageBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(photoModel: PhotoModel) {
            binding.apply {
                imageView.load(photoModel.url) {
                    placeholder(R.drawable.loading_svgrepo_com)
                    crossfade(true)
                    crossfade(200)
                    transformations(RoundedCornersTransformation(16f))
                    scale(coil.size.Scale.FILL)
                    error(R.drawable.loading_svgrepo_com)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder =
        PhotoViewHolder(RowImageBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
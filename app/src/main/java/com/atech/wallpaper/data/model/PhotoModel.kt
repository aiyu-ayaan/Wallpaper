package com.atech.wallpaper.data.model

import androidx.annotation.Keep

@Keep
data class PhotoModel(
    val albumId: Int,
    val id: Int,
    val title: String,
    val url: String,
    val thumbnailUrl: String
)
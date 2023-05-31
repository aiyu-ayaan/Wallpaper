package com.atech.wallpaper.data.api

import com.atech.wallpaper.data.model.PhotoModel
import retrofit2.http.GET

interface PhotoApi {

    @GET("photos")
    suspend fun getPhotos(): List<PhotoModel>

    companion object {
        const val BASE_URL = "https://jsonplaceholder.typicode.com/"
    }
}
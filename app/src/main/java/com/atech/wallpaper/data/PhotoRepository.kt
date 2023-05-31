package com.atech.wallpaper.data

import com.atech.wallpaper.data.api.PhotoApi
import com.atech.wallpaper.data.model.PhotoModel
import com.atech.wallpaper.util.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class PhotoRepository @Inject constructor(
    private val api: PhotoApi
) {
    suspend fun getPhotos(): Flow<DataState<List<PhotoModel>>> {
        return flow {
            emit(DataState.Loading)
            try {
                val photos = api.getPhotos()
                emit(DataState.Success(photos))
            } catch (e: Exception) {
                emit(DataState.Error(e))
            }
        }
    }
}
package com.atech.wallpaper.ui.main_activity

import androidx.lifecycle.ViewModel
import com.atech.wallpaper.data.PhotoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: PhotoRepository
) : ViewModel() {

    val photos = repository.getPhotos()
}
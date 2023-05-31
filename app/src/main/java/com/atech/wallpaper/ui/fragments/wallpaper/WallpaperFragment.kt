package com.atech.wallpaper.ui.fragments.wallpaper

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.atech.wallpaper.R
import com.atech.wallpaper.databinding.FragmentWallpaperBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WallpaperFragment : Fragment(R.layout.fragment_wallpaper) {
    private val binding: FragmentWallpaperBinding by lazy {
        FragmentWallpaperBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

        }
    }
}
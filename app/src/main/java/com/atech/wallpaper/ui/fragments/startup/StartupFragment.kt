package com.atech.wallpaper.ui.fragments.startup

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.atech.wallpaper.R
import com.atech.wallpaper.databinding.FragmentStartupBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartupFragment : Fragment(R.layout.fragment_startup) {
    private val binding: FragmentStartupBinding by lazy {
        FragmentStartupBinding.inflate(layoutInflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {

        }
    }
}
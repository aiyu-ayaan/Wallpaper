package com.atech.wallpaper.ui.fragments.startup

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.atech.wallpaper.R
import com.atech.wallpaper.databinding.FragmentStartupBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StartupFragment : Fragment(R.layout.fragment_startup) {
    private val binding: FragmentStartupBinding by lazy {
        FragmentStartupBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button.setOnClickListener {
            Toast.makeText(requireContext(), "Click", Toast.LENGTH_SHORT).show()
            findNavController().navigate(
                StartupFragmentDirections.actionStartupFragmentToWallpaperFragment()
            )
        }
    }
}
package com.atech.wallpaper.ui.fragments.wallpaper

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import com.atech.wallpaper.R
import com.atech.wallpaper.databinding.FragmentWallpaperBinding
import com.atech.wallpaper.ui.fragments.wallpaper.adapter.PhotoAdapter
import com.atech.wallpaper.ui.main_activity.MainViewModel
import com.atech.wallpaper.util.DataState
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class WallpaperFragment : Fragment(R.layout.fragment_wallpaper) {
    private val binding: FragmentWallpaperBinding by lazy {
        FragmentWallpaperBinding.inflate(layoutInflater)
    }
    private val viewModel: MainViewModel by activityViewModels()
    private lateinit var photoAdapter: PhotoAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.wallpaperRecyclerView.apply {
            adapter = PhotoAdapter().also { photoAdapter = it }
            layoutManager = LinearLayoutManager(requireContext())
            setHasFixedSize(true)
        }
        observeData()
    }

    private fun observeData() {
        lifecycleScope.launch {
            viewModel.photos.collect {
                when (it) {
                    is DataState.Error -> {
                        Toast.makeText(requireContext(), "${it.exception}", Toast.LENGTH_SHORT)
                            .show()
                    }

                    DataState.Loading -> {}
                    is DataState.Success -> {
                        photoAdapter.submitList(it.data)
                    }
                }
            }
        }
    }
}
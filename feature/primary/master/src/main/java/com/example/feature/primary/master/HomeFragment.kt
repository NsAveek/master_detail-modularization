package com.example.feature.primary.master

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.viewModels
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import com.example.feature.primary.master.databinding.HomeFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    private val viewModel: HomeViewModel by viewModels<HomeViewModel>()
    private lateinit var _binding : HomeFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = HomeFragmentBinding.inflate(inflater, container, false)
        with(_binding){
            viewmodel = viewModel

            btnDetailsFragment.setOnClickListener {
                val request = NavDeepLinkRequest.Builder
                    .fromUri("myApp://DetailFragment".toUri())
                    .build()
                findNavController().navigate(request)
            }

            btnLoadDataDetailsFragment.setOnClickListener {
                viewmodel.fetchImagesFromServer()
            }
        }



        return _binding?.let {
            it.root
        }
    }
}
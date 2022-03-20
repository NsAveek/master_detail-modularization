package com.example.feature.primary.master

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.net.toUri
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.viewModelScope
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.fragment.findNavController
import androidx.paging.LoadState
import androidx.paging.cachedIn
import androidx.paging.insertSeparators
import androidx.paging.map
import androidx.recyclerview.widget.RecyclerView
import com.example.feature.primary.master.data.PixabayHomeRepository
import com.example.feature.primary.master.data.model.local.UiModel
import com.example.feature.primary.master.databinding.HomeFragmentBinding
import com.example.feature.primary.master.ui.ImagesAdapter
import com.example.feature.primary.master.ui.ImagesLoadStateAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment() {

    @Inject
    lateinit var repository: PixabayHomeRepository
    @Inject
    lateinit var adapter : ImagesAdapter

    private val homeFragmentViewModel: HomeViewModel by viewModels()
    private lateinit var _binding : HomeFragmentBinding

    private lateinit var recyclerView : RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        homeFragmentViewModel = ViewModelProvider(this, ViewModelFactory).get(HomeViewModel::class.java)
        _binding = HomeFragmentBinding.inflate(inflater)
        with(_binding){

            btnDetailsFragment.setOnClickListener {
                val request = NavDeepLinkRequest.Builder
                    .fromUri("myApp://DetailFragment".toUri())
                    .build()
                findNavController().navigate(request)
            }

            initAdapter()

            viewLifecycleOwner.lifecycleScope.launch {
                homeFragmentViewModel.fetchImagesFromServer().collectLatest {
                    adapter.submitData(it)
                }
            }
        }
        return _binding?.let {
            it.root
        }
    }

    private fun initAdapter() {
        _binding.list.adapter = adapter.withLoadStateFooter(
            footer = ImagesLoadStateAdapter{adapter.retry()}
        )
        adapter.addLoadStateListener {
            // show empty list
                loadState -> val isListEmpty = loadState.refresh is LoadState.NotLoading && adapter.itemCount == 0
            showEmptyList(isListEmpty)
            _binding.list.isVisible = loadState.source.refresh is LoadState.NotLoading || loadState.mediator?.refresh is LoadState.NotLoading
            _binding.progressBar.isVisible = loadState.mediator?.refresh is LoadState.Loading
            _binding.retryButton.isVisible = loadState.mediator?.refresh is LoadState.Error && adapter.itemCount == 0


            val errorState = loadState.source.append as? LoadState.Error
                ?: loadState.source.prepend as? LoadState.Error
                ?: loadState.source.refresh as? LoadState.Error
            errorState?.let {
                Toast.makeText(
                    requireContext(),
                    "\uD83D\uDE28 Wooops ${it.error}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }
    private fun showEmptyList(show: Boolean) {
        if (show) {
            _binding.emptyList.visibility = View.VISIBLE
            _binding.list.visibility = View.GONE
        } else {
            _binding.emptyList.visibility = View.GONE
            _binding.list.visibility = View.VISIBLE
        }
    }
}
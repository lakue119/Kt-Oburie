package com.lakue.oburie.ui.bottomnavigation.home

import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentHome : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {

    companion object {
        @JvmStatic
        fun newInstance() = 
            FragmentHome()
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    override fun init() {
        binding.apply {
            vm = viewModel
        }
    }
}
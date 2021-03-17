package com.lakue.oburie.ui.bottomnavigation.joboffer

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentJobOfferBinding
import kotlinx.android.synthetic.main.fragment_job_offer.*

class FragmentJobOffer : BaseFragment<FragmentJobOfferBinding, JobOfferViewModel>(R.layout.fragment_job_offer) {

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentJobOffer()
    }

    override fun init() {
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
        binding.apply {
            vm = viewModel
        }
    }


}
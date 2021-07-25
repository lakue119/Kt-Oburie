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
import com.lakue.oburie.ui.joboffer.detail.JobOfferDetailActivity
import com.lakue.oburie.ui.joboffer.detail.JobOfferDetailActivity.Companion.startJobOfferDetailActivity
import com.lakue.oburie.ui.joboffer.upload.JobOfferUploadActivity.Companion.startJobOfferUploadActivity
import com.lakue.oburie.ui.search.SearchActivity
import com.lakue.oburie.ui.search.SearchActivity.Companion.startSearchActivity
import com.lakue.oburie.ui.userprofile.info.UserInfoActivity.Companion.startUserInfoActivity
import com.lakue.oburie.utils.BaseUtils
import kotlinx.android.synthetic.main.fragment_job_offer.*

class FragmentJobOffer :
    BaseFragment<FragmentJobOfferBinding, JobOfferViewModel>(R.layout.fragment_job_offer) {

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentJobOffer()
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            fragment = this@FragmentJobOffer
        }

        viewModel.apply {
            jobOfferDetailEvent eventObserve { showJobOfferDetail() }
            userProfileDetailEvent eventObserve { showUserProfileDetail() }
        }
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

    fun showSearchList() {
        startSearchActivity(mContext, "jobOffer")
    }

    fun showUploadJobOffer() {
        startJobOfferUploadActivity(mContext)
    }

    private fun showJobOfferDetail() {
        startJobOfferDetailActivity(mContext)
    }

    private fun showUserProfileDetail() {
        startUserInfoActivity(mContext)
    }

}
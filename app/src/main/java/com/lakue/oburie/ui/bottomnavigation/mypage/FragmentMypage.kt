package com.lakue.oburie.ui.bottomnavigation.mypage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentJobOfferBinding
import com.lakue.oburie.databinding.FragmentMypageBinding
import com.lakue.oburie.ui.bottomnavigation.joboffer.JobOfferViewModel
import com.lakue.oburie.ui.history.OburieHistoryActivity.Companion.startOburieHistoryActivity
import com.lakue.oburie.ui.myresume.MyResumeActivity.Companion.startMyResumeActivity

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentMypage  : BaseFragment<FragmentMypageBinding, MypageViewModel>(R.layout.fragment_mypage) {

    companion object {
        @JvmStatic
        fun newInstance() =
            FragmentMypage()
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            fragment = this@FragmentMypage
        }
    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

    fun showMyResume(){
        startMyResumeActivity(mContext)
    }

    fun showHistory(){
        startOburieHistoryActivity(mContext)
    }
}
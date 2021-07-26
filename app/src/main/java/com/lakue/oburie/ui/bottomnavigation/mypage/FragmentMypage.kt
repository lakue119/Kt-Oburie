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
import com.lakue.oburie.ui.app.setting.AppSettingActivity.Companion.startAppSettingActivity
import com.lakue.oburie.ui.bottomnavigation.joboffer.JobOfferViewModel
import com.lakue.oburie.ui.expert.like.LikeExpertActivity.Companion.startLikeExpertActivity
import com.lakue.oburie.ui.history.OburieHistoryActivity.Companion.startOburieHistoryActivity
import com.lakue.oburie.ui.joboffer.mine.MyJobOfferActivity.Companion.startMyJobOfferActivity
import com.lakue.oburie.ui.myresume.MyResumeActivity.Companion.startMyResumeActivity
import com.lakue.oburie.ui.review.list.ReviewListActivity.Companion.startReviewListActivity
import com.lakue.oburie.ui.userinfo.UserInfoSettingActivity.Companion.startUserInfoSettingActivity
import dagger.hilt.android.AndroidEntryPoint

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

@AndroidEntryPoint
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

    fun showLikeExpert(){
        startLikeExpertActivity(mContext)
    }

    fun showMyJobOffer(){
        startMyJobOfferActivity(mContext)
    }

    fun showMyReview(){
        startReviewListActivity(mContext)
    }

    fun showNotice(){

    }

    fun showFAQ(){

    }

    fun showShare(){

    }

    fun showProfileSetting(){
        startUserInfoSettingActivity(mContext)
    }

    fun showAppSetting(){
        startAppSettingActivity(mContext)
    }

    fun showGuide(){

    }

    fun showOburieCenter(){

    }

    fun historyDetail(){

    }

}
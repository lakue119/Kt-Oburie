package com.lakue.oburie.ui.bottomnavigation.home

import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentHomeBinding
import com.lakue.oburie.ui.jobhunter.list.JobhunterActivity.Companion.startCategoryResultActivity
import com.lakue.oburie.ui.main.MainActivity
import com.lakue.oburie.ui.myresume.upload.ResumeUploadActivity.Companion.startResumeUploadActivity
import com.lakue.oburie.ui.search.SearchActivity.Companion.startSearchActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import com.lakue.oburie.utils.loading.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FragmentHome : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {

    lateinit var homeAdapter: HomeAdapter

    companion object {
        @JvmStatic
        fun newInstance() = 
            FragmentHome()
    }

    override fun setUI() {
        homeAdapter = HomeAdapter(viewModel)
        binding.apply {
            vm = viewModel
            fragment = this@FragmentHome
        }

        viewModel.fetchHomeMain()
    }

    override fun setEvent() {
    }

    override fun setObserve() {
        viewModel.apply{
            homeProfile.observe(this@FragmentHome, {
                when(it.status){
                    Status.ERROR -> {
                        showToast("${it.data.toString()}")
                    }
                    Status.LOADING -> {
                        showToast("${it.data.toString()}")
                    }
                    Status.NETWORK_ERROR -> {
                        showToast("NETWORK_ERROR")
                    }
                    Status.SUCCESS -> {
                        if(it.data!!.result){
                            val homeList = arrayListOf<Any>(
                                    it.data.data.banner,
                                    "search",
                                    it.data.data.category,
                                    it.data.data.userProfileExists,
                                    it.data.data.popularityRrankList,
                                    it.data.data.newface,
                                    it.data.data.teamProfileList
                            )
                            homeAdapter.addItems(homeList)
                        } else {
                            showToast("${it.data.fail.message}")
                        }
                    }
                    Status.TIMEOUT_ERROR -> {
                        showToast("TIMEOUT_ERROR")
                    }
                }
            })
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
        }

        viewModel.apply{
            categoryEvent eventObserve {showCategoryResult()}
            userProfileEvent eventObserve {showUserDetail()}
            bannerEvent eventObserve {showBannerDetail()}
            searchEvent eventObserve {showSearchList()}
            firstProfileSettingEvent eventObserve {showSettingProfile()}
            monthPopularPeopleEvent eventObserve {showMonthPopularPeople()}
            newPeopleEvent eventObserve {showNewPeople()}
            groupPeopleEvent eventObserve {showGroupPeople()}
        }
    }

    fun showCategoryResult() {
        startCategoryResultActivity(mContext)
    }

    fun showUserDetail(){
        startUserProfileActivity(mContext)
    }

    fun showBannerDetail(){

    }

    fun showSearchList(){
        startSearchActivity(mContext,"jobhunter")
    }

    fun showSettingProfile(){
        startResumeUploadActivity(mContext)
    }

    fun showMonthPopularPeople(){
        startCategoryResultActivity(mContext)
    }

    fun showNewPeople(){
        startCategoryResultActivity(mContext)
    }

    fun showGroupPeople(){
        startCategoryResultActivity(mContext)
    }
}
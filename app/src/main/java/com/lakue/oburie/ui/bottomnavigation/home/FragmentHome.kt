package com.lakue.oburie.ui.bottomnavigation.home

import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentHomeBinding
import com.lakue.oburie.ui.jobhunter.list.JobhunterActivity.Companion.startCategoryResultActivity
import com.lakue.oburie.ui.myresume.upload.ResumeUploadActivity.Companion.startResumeUploadActivity
import com.lakue.oburie.ui.search.SearchActivity.Companion.startSearchActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
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
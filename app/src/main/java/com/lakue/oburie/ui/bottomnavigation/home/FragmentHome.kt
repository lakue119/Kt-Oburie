package com.lakue.oburie.ui.bottomnavigation.home

import com.lakue.oburie.R
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.FragmentHomeBinding
import com.lakue.oburie.ui.categoryresult.CategoryResultActivity
import com.lakue.oburie.ui.categoryresult.CategoryResultActivity.Companion.startCategoryResultActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import com.lakue.oburie.utils.BaseUtils
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

    }

    fun showSettingProfile(){

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
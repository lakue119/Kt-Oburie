package com.lakue.oburie.ui.bottomnavigation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Category
import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.UserInfo
import com.lakue.oburie.test.testCategory
import com.lakue.oburie.test.testGroupProfile
import com.lakue.oburie.test.testNewProfile
import com.lakue.oburie.test.testPopularProfile
import com.lakue.oburie.ui.categoryresult.CategoryResultActivity.Companion.startCategoryResultActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import com.lakue.oburie.utils.BaseUtils.context
//import com.lakue.oburie.repository.ProfileRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _homeData = MutableLiveData<ArrayList<Any>>()
    val homeData: LiveData<ArrayList<Any>> = _homeData

    var homeAdapter: HomeAdapter = HomeAdapter(this)

    init {
        sampleHomeData()
    }


    /**
     * 샘플데이터
     */
    fun sampleHomeData() {
        var sampleList = ArrayList<Any>()
        sampleList.add("https://wifiexpress.co.kr/wp/wp-content/uploads/2013/05/2018-%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A5%E1%86%AF-%E1%84%8B%E1%85%B5%E1%84%87%E1%85%A6%E1%86%AB%E1%84%90%E1%85%B3-%E1%84%87%E1%85%A2%E1%84%82%E1%85%A5-9%E1%84%8B%E1%85%AF%E1%86%AF.jpg")
        sampleList.add(1)
        sampleList.add(testCategory)
        sampleList.add(false)
        sampleList.add(testPopularProfile)
        sampleList.add(testNewProfile)
        sampleList.add(testGroupProfile)

        _homeData.value = sampleList
        homeAdapter.setCount(_homeData.value!!.size)

    }

    /**
     * Click Event
     */
    fun setData() {
//        sampleHomeData2()
    }

    fun showCategoryResult() {
        startCategoryResultActivity(context)
    }

    fun showUserDetail(){
        startUserProfileActivity(context)
    }

}
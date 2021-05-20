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
import com.lakue.oburie.utils.Event
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


    private val _categoryEvent = MutableLiveData<Event<String>>()
    val categoryEvent: LiveData<Event<String>> = _categoryEvent

    private val _userProfileEvent = MutableLiveData<Event<String>>()
    val userProfileEvent: LiveData<Event<String>> = _userProfileEvent

    private val _bannerEvent = MutableLiveData<Event<String>>()
    val bannerEvent: LiveData<Event<String>> = _bannerEvent

    private val _searchEvent = MutableLiveData<Event<String>>()
    val searchEvent: LiveData<Event<String>> = _searchEvent

    private val _firstProfileSettingEvent = MutableLiveData<Event<String>>()
    val firstProfileSettingEvent: LiveData<Event<String>> = _firstProfileSettingEvent

    private val _monthPopularPeopleEvent = MutableLiveData<Event<String>>()
    val monthPopularPeopleEvent: LiveData<Event<String>> = _monthPopularPeopleEvent

    private val _newPeopleEvent = MutableLiveData<Event<String>>()
    val newPeopleEvent: LiveData<Event<String>> = _newPeopleEvent

    private val _groupPeopleEvent = MutableLiveData<Event<String>>()
    val groupPeopleEvent: LiveData<Event<String>> = _groupPeopleEvent

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
    fun onCategoryResult() {
        _categoryEvent.value = Event("category")
    }

    fun onUserDetail(){
        _userProfileEvent.value = Event("profile")
    }

    fun onBannerDetail(){
        _bannerEvent.value = Event("banner")
    }

    fun onSearchList(){
        _searchEvent.value = Event("search")
    }

    fun onSettingProfile(){
        _firstProfileSettingEvent.value = Event("settingProfile")
    }

    fun onMonthPopularPeople(){
        _monthPopularPeopleEvent.value = Event("monthPopular")
    }

    fun onNewPeople() {
        _newPeopleEvent.value = Event("newPopular")
    }

    fun onGroupPeople(){
        _groupPeopleEvent.value = Event("group")
    }

}
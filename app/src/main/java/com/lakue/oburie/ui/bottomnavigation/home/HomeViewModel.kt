package com.lakue.oburie.ui.bottomnavigation.home

//import com.lakue.oburie.repository.ProfileRepository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.retrofit.home.ResponseHomeMain
import com.lakue.oburie.repository.RetrofitRepository
import com.lakue.oburie.test.testCategory
import com.lakue.oburie.test.testGroupProfile
import com.lakue.oburie.test.testNewProfile
import com.lakue.oburie.test.testPopularProfile
import com.lakue.oburie.utils.Event
import com.lakue.oburie.utils.NetworkHelper
import com.lakue.oburie.utils.loading.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch
import java.net.SocketTimeoutException
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle,
        private val repository: RetrofitRepository
) : BaseViewModel() {

//    private val _homeData = MutableLiveData<ArrayList<Any>>()
//    val homeData: LiveData<ArrayList<Any>> = _homeData


    private val _homeProfile = MutableLiveData<Resource<ResponseHomeMain>>()
    val homeProfile: LiveData<Resource<ResponseHomeMain>> = _homeProfile

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

    fun fetchHomeMain(){
        viewModelScope.launch {
            if(NetworkHelper.isNetworkConnected()){
                try{
                    repository.getHomeMain().let { response ->
                        if(response.isSuccessful){
                            val data = Resource.success(response.body()).data
                            _homeProfile.postValue(Resource.success(response.body()))
                        } else {
                            _homeProfile.postValue(Resource.error("ERROR CODE: ${response.code()}\n${response.message()}", null))
                        }
                    }
                } catch (e: SocketTimeoutException){
                    _homeProfile.postValue(Resource.timeoutError())
                }
            } else {
                _homeProfile.postValue(Resource.networtError())
            }
        }
    }

    /**
     * 샘플데이터
     */
//    fun sampleHomeData() {
//        var sampleList = ArrayList<Any>()
//        sampleList.add("https://wifiexpress.co.kr/wp/wp-content/uploads/2013/05/2018-%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A5%E1%86%AF-%E1%84%8B%E1%85%B5%E1%84%87%E1%85%A6%E1%86%AB%E1%84%90%E1%85%B3-%E1%84%87%E1%85%A2%E1%84%82%E1%85%A5-9%E1%84%8B%E1%85%AF%E1%86%AF.jpg")
//        sampleList.add(1)
//        sampleList.add(testCategory)
//        sampleList.add(false)
//        sampleList.add(testPopularProfile)
//        sampleList.add(testNewProfile)
//        sampleList.add(testGroupProfile)
//
//        _homeData.value = sampleList
//        homeAdapter.setCount(_homeData.value!!.size)
//
//    }

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
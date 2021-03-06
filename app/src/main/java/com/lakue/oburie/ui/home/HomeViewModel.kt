package com.lakue.oburie.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Category
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
    fun setData(){
        sampleHomeData()
    }

    /**
     * 샘플데이터
     */
    fun sampleHomeData() {
        var sampleList = ArrayList<Any>()
        sampleList.add("https://img.fleapop.co.kr/banner/3D22B546041FA1B1614936603.jpg")
        sampleList.add(arrayListOf(Category(0, "", "", R.drawable.ic_violin), Category(0, "", "", R.drawable.ic_sexophone), Category(0, "", "", R.drawable.ic_piano)
                , Category(0, "", "", R.drawable.ic_vacalist), Category(0, "", "", R.drawable.ic_lyre), Category(0, "", "", R.drawable.ic_taepyeongso),
                Category(0, "", "", R.drawable.ic_drum), Category(0, "", "", R.drawable.ic_sing)))
        sampleList.add(false)
//        sampleList.add(arrayListOf(Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락"),
//                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락"),
//                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락"),
//                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락"),
//                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락"),
//                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락"),
//                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTYw/MDAxNTgxMDg1NzUxMTUy.eV1iEw2gk2wt_YqPWe5F7SroOCkXJy2KFwmTDNzM0GQg.Z3Kd5MrDh07j86Vlb2OhAtcw0oVmGCMXtTDjoHyem9og.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7117.jpg?type=w800","성악 최명락")))
//        sampleList.add(arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
//                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
//                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
//                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
//                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
//                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
//                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준"))
//        sampleList.add(arrayListOf("https://www.namdongarts.kr/UpFiles/Fboard_1/IMG_7905.JPG","보컬 이재준",
//                "https://www.namdongarts.kr/UpFiles/Fboard_1/IMG_7905.JPG","보컬 이재준"))

        _homeData.value = sampleList
        homeAdapter.setCount(_homeData.value!!.size)
//        homeAdapter.addItem(sampleList)

    }


}
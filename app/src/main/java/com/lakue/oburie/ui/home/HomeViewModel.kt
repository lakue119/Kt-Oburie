package com.lakue.oburie.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Category
import com.lakue.oburie.model.Profile
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
        sampleList.add(arrayListOf(Profile("https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07","성악 최명락"),
                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800","성악 최명락"),
                Profile("https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100","성악 최명락"),
                Profile("https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png","성악 최명락"),
                Profile("https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D","성악 최명락"),
                Profile("https://cdn.imweb.me/upload/S20170720597014723fac6/193c177bb2a60.jpg","성악 최명락"),
                Profile("https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg","성악 최명락")))
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
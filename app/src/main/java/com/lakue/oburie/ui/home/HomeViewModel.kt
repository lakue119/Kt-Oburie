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
        sampleHomeData2()
    }

    /**
     * 샘플데이터
     */
    fun sampleHomeData() {
        var sampleList = ArrayList<Any>()
        sampleList.add("https://wifiexpress.co.kr/wp/wp-content/uploads/2013/05/2018-%E1%84%89%E1%85%A1%E1%86%BC%E1%84%89%E1%85%A5%E1%86%AF-%E1%84%8B%E1%85%B5%E1%84%87%E1%85%A6%E1%86%AB%E1%84%90%E1%85%B3-%E1%84%87%E1%85%A2%E1%84%82%E1%85%A5-9%E1%84%8B%E1%85%AF%E1%86%AF.jpg")
        sampleList.add(1)
        sampleList.add(arrayListOf(Category(0, "서양・현악기", "", R.drawable.ic_violin), Category(0, "서양・관악기", "", R.drawable.ic_sexophone), Category(0, "서양・건반,타악기", "", R.drawable.ic_piano)
                , Category(0, "성악", "", R.drawable.ic_vacalist), Category(0, "국악・현악기", "", R.drawable.ic_lyre), Category(0, "국악・관악기", "", R.drawable.ic_taepyeongso),
                Category(0, "국악・타악기", "", R.drawable.ic_drum), Category(0, "실용음악", "", R.drawable.ic_sing)))
        sampleList.add(false)
        sampleList.add(arrayListOf(Profile("https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07","성악 최명락"),
                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800","성악 최명락"),
                Profile("https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100","성악 최명락"),
                Profile("https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png","성악 최명락"),
                Profile("https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D","성악 최명락"),
                Profile("https://cdn.imweb.me/upload/S20170720597014723fac6/193c177bb2a60.jpg","성악 최명락"),
                Profile("https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg","성악 최명락")))
        sampleList.add(arrayListOf(Profile("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준"),
                Profile("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준"),
                Profile("https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100","성악 최명락"),
                Profile("https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png","성악 최명락")))
        sampleList.add(arrayListOf(Profile("https://lh3.googleusercontent.com/proxy/CJyIAETW_5CaxFuVgKqk2aoFE-V9EUFf1-9LmFvjnHFsBHuYymgnH9q0NB82yGmBxe--I2NaRDDfZ1Bh5EIWydgASP8JqlTq7NDai_UFW1LSA1ze_lnShEXMKzvXHHqd","보컬 이재준"),
                Profile("https://lh3.googleusercontent.com/proxy/snYToLMR5_qhWZU3SyJQMpeT-PlcyEUz6q50AlW3gTpJnT5KSwA0-7OOn_CCs9Jf7jEB8hJZ5dxsN2h43OiDQZXPIBceT0bK_z_3vHXZevN2","성악 최명락")))

        _homeData.value = sampleList
        homeAdapter.setCount(_homeData.value!!.size)
//        homeAdapter.addItem(sampleList)

    }

    fun sampleHomeData2() {
        var sampleList = ArrayList<Any>()
        sampleList.add("https://img.fleapop.co.kr/banner/4CF38305FF411DB1609830875jpg")
        sampleList.add(arrayListOf(Category(0, "", "", R.drawable.ic_violin), Category(0, "", "", R.drawable.ic_sexophone), Category(0, "", "", R.drawable.ic_piano)
                , Category(0, "", "", R.drawable.ic_vacalist), Category(0, "", "", R.drawable.ic_lyre), Category(0, "", "", R.drawable.ic_taepyeongso),
                Category(0, "", "", R.drawable.ic_drum), Category(0, "", "", R.drawable.ic_sing)))
        sampleList.add(false)
        sampleList.add(arrayListOf(Profile("http://t1.daumcdn.net/liveboard/tab/2e4651d01811444fa9cf72343458849a.jpeg","성악 최명락"),
                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfMTY4/MDAxNTgxMDg1NzcwOTg4.m3xj3JTiaXavQVzbL3sIiYBW-STOfU2BsldN8DZ8Ynkg.1rgQ_zP0-8b1kevjVR1Sgq5jN0atVzrLYEh5HNfIrpsg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7120.jpg?type=w800","성악 최명락"),
                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfNTEg/MDAxNTgxMDg1ODYyMjc5.nbkCfRoTfo15xgsGlv82ZmN0wBiTGhdJCxIqC5bOCpog.3hhxLTquJPHdN_Qc5PFyFyiqpLfsNORaKAuIB2rfDfgg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7131.jpg?type=w800","성악 최명락"),
                Profile("https://www.nemopan.com/files/attach/images/6294/245/206/014/32d3eb8c0d1b1ff88ccc6f15e0935ce3.jpeg","성악 최명락"),
                Profile("http://t1.daumcdn.net/liveboard/tab/8de689dff7a246888358f152718dbc5b.JPG","성악 최명락"),
                Profile("https://t1.daumcdn.net/cfile/tistory/250688445881D87E03","성악 최명락"),
                Profile("https://i.pinimg.com/originals/f6/3f/02/f63f02d0dc754f10339ac3ad3db2e172.jpg","성악 최명락")))
        sampleList.add(arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준",
                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg","보컬 이재준"))
//        sampleList.add(arrayListOf("https://www.namdongarts.kr/UpFiles/Fboard_1/IMG_7905.JPG","보컬 이재준",
//                "https://www.namdongarts.kr/UpFiles/Fboard_1/IMG_7905.JPG","보컬 이재준"))

        _homeData.value = sampleList
        homeAdapter.setCount(_homeData.value!!.size)
//        homeAdapter.addItem(sampleList)

    }


}
package com.lakue.oburie.ui.categoryresult

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CategoryResultViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _profileData = MutableLiveData<ArrayList<Profile>>()
    val profileData: LiveData<ArrayList<Profile>> = _profileData

    var profileAdapter: CategoryResultAdapter = CategoryResultAdapter(this)

    init {
        sampleProfileData()
    }

    fun sampleProfileData(){
        var sampleList = arrayListOf(Profile("https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07", "라꾸",
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://dt40dm21pj8em.cloudfront.net/uploads/froala/file/6819/1569215127116.png"),
                "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"),
                Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
                        "라꾸",
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://img.seoul.co.kr/img/upload/2018/07/13/SSI_20180713180319.jpg"),
                        "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"),
                Profile("https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100", "라꾸",
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"),
                Profile("https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png", "라꾸",
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"),
                Profile("https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D", "라꾸",
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"),
                Profile("https://cdn.imweb.me/upload/S20170720597014723fac6/193c177bb2a60.jpg", "라꾸",
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"),
                Profile("https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg", "라꾸",
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "", "", "", 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"))

        _profileData.value = sampleList
        profileAdapter.setCount(_profileData.value!!.size)
    }

}
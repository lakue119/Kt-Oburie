package com.lakue.oburie.ui.userprofile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Profile
import com.lakue.oburie.model.UserInfo
import com.lakue.oburie.ui.categoryresult.CategoryResultAdapter
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class UserProfileViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {


    private val _profileData = MutableLiveData<Profile>( Profile(
            "https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07", "라꾸",
            "PLATINUM",
            "가야금",
            "대전,서울,천안",
            5.3F, 3.2F, 4.8F, 4.3F, 38,
            arrayListOf("https://dt40dm21pj8em.cloudfront.net/uploads/froala/file/6819/1569215127116.png"),
            UserInfo(), 100, "안녕하세요 웨딩 전문 사회자\n" +
            "쇼호스트 윤익입니다 ^-^\n" +
            "\n" +
            "결혼식 700회 진행\n" +
            "돌잔치 및 기업행사 300회 진행 경력으로 소중한날 더 멋지고\n" +
            "특별한 날로 아낌없이 꾸며드립니다.\n" +
            "\n" +
            "\n" +
            "❤️❤️❤️  이것만은 약속드립니다.  ❤️❤️❤️\n" +
            "\n" +
            "‼️ 첫째. [가족]\n" +
            "신랑,신부의 형/동생/오빠/친구가 되어 나의 가족의 결혼식이라고\n" +
            "생각하고 성심성의껏 예식을 진행하겠습니다.\n" +
            "\n" +
            "‼️ 둘째. [소통]\n" +
            "끊임 없는 소통으로 맞춤형 식순과 대본을 만들고, 직접 전화미팅\n" +
            "으로 식순에 대해 하나하나 디테일하게 예식 컨설팅을\n" +
            "약속합니다.\n" +
            "\n" +
            "‼️ 셋째. [T.P.O]\n" +
            "분위기를 잘 이해하는 예식을 약속합니다.\n" +
            "결혼식은 개인이 아닌 양가 집안과 집안이 하는 예를 갖춘\n" +
            "행사입니다.\n" +
            "도를 지나치지 않은 깔끔하고 고급스러운 예식을 지향하며,\n" +
            "다함께 즐길 수 있는 결혼식을 약속합니다.\n" +
            "   ", "경력 \n" +
            "- 5년\n" +
            "\n" +
            "세부장르\n" +
            "✅ 결혼식\n" +
            "✅ 돌잔치\n" +
            "✅ 어린이행사\n" +
            "✅ 각종 축제 등 모든행사 \n" +
            "\n" +
            "❗️진행스타일 \n" +
            "  -밝음\n" +
            " -차분함\n" +
            " -센스있다\n" +
            " -재미있다\n" +
            " -차분하다\n" +
            "\n" +
            "출연 경력\n" +
            "\uD83C\uDFF4\u200D☠️ W홈쇼핑 쇼호스트 출연\n" +
            "\uD83C\uDFF4\u200D☠️ 티몬 라이브 쇼호스트 출여", "- 쇼핑 쇼호스트\n" +
            "\n" +
            "- 경희대 언론정보대학원 석사 과정\n" +
            "\n" +
            "- 티몬 라이브쇼호스트\n" +
            "\n" +
            "- 2019패럴스마트폰 영화제 시상식. mc\n" +
            "\n" +
            "- 2019쥴리스발레 페스티벌 mc\n" +
            "\n" +
            "- ksp add 기업행사 mc\n" +
            "\n" +
            "- 몬스터이벤트 mc팀장\n" +
            "\n" +
            "- GD컨벤션 예식 전속 사회자\n" +
            "\n" +
            "- 구리 스칼라티움 예식 전속 사회자\n" +
            "\n" +
            "- 파티움하우스 전속 사회자\n" +
            "\n" +
            "- 엔젤스데이 돌잔치 전속 사회자\n" +
            "\n" +
            "- 시각장애인 협회 도전골든벨 mc\n" +
            "\n" +
            "- 더존pn 기업행사 mc 등등..",
            arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
            "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                    "잘생김에 보컬까지~"
    ))
    val profileData: LiveData<Profile> = _profileData

    var profileVideoAdapter: UserProfileVideoAdapter = UserProfileVideoAdapter(this)
    var profileCoverAdapter: UserProfileCoverImgAdapter = UserProfileCoverImgAdapter(this)

    init {
        profileVideoAdapter.dataCount = profileData.value!!.videos.size
        profileCoverAdapter.dataCount = profileData.value!!.coverImgs.size
    }
}
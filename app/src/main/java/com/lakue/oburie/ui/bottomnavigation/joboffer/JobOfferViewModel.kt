package com.lakue.oburie.ui.bottomnavigation.joboffer

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.UserInfo
import com.lakue.oburie.model.joboffer.JobOffer
import com.lakue.oburie.model.joboffer.JobOfferBadge
import com.lakue.oburie.ui.bottomnavigation.home.HomeAdapter
import com.lakue.oburie.ui.jobofferdetail.ActivityJobOfferDetail.Companion.startJobOfferDetailActivity
import com.lakue.oburie.utils.BaseUtils.context
import javax.inject.Inject

class JobOfferViewModel  @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _jobOffer = MutableLiveData<ArrayList<JobOffer>>()
    val jobOffer: LiveData<ArrayList<JobOffer>> = _jobOffer

    var jobOfferAdapter: JobOfferAdapter = JobOfferAdapter(this)

    init {
        sampleHomeData()
    }

    fun sampleHomeData() {
        var sampleList = ArrayList<JobOffer>()
        sampleList.add(JobOffer(UserInfo(),
                arrayListOf(),
                "oo웨딩홀 축가 급구해요!!",
                "안녕하세요! 서울아카데믹윈드앙상블입니다!서울아카데믹윈드앙상블 2차 단원 모집을 3월 1일부터  3월 16일 토요일까지 진행할려고 합니다!서울아카데믹윈드앙상블은!윈드앙상블에 뜻과 열정 있는 서울 및 수도권 청년예술가들이 모인 연주 단체로, 트럼페터 유재우 선생\n" +
                        "님을 예술감독 겸 상임지휘자로 모시고 창단 연주회를 \n" +
                        "계획하고 있습니다.\n" +
                        "\n" +
                        "윈드앙상블의 예술성을 널리 알리고 나아가 대한민국 \n" +
                        "윈드앙상블 발전에 기여하고 그 위상을 드높이며 나아가\n" +
                        " 한국 관악의 전통과 명맥을 잇고자 합니다.\n" +
                        "\n" +
                        "대한민국 관악계를 이끌어 갈 참신하고 열정있는 청년\n" +
                        "예술인 여러분들의 많은 관심을 부탁드리며\n" +
                        "악기 오디션은 따로 보고 있지 않습니다!\n" +
                        "\n" +
                        "창단연주의 감동과 열정을 함께할 청년 예술가 분들의 많은\n" +
                        " 참여와 지원 부탁드리겠습니다!\n" +
                        "\n" +
                        "아래 입단 원서와 카카오톡플러스 친구 링크를 올려드\n" +
                        "립니다 문의는 카카오톡으로 해주세요!",
                "2020.01.17",
                "오전 09시 00분",
                "서울 영등포구 당산동 6가 323-1",
                0,
                100000,
                100,
                20,
                1,
                false,
                "5시간",
                37.51596,
                126.90730
        ))
        for(i in 0..10){
            sampleList.add(JobOffer(UserInfo(),
                    arrayListOf(JobOfferBadge(0,"NEW",""),JobOfferBadge(0,"급구","")),
                    "oo웨딩홀 축가 급구해요!!",
                    "안녕하세요! 서울아카데믹윈드앙상블입니다!\n" +
                            "\n" +
                            "서울아카데믹윈드앙상블 2차 단원 모집을 3월 1일 \n" +
                            "부터  3월 16일 토요일까지 진행할려고 합니다!\n" +
                            "\n" +
                            "서울아카데믹윈드앙상블은!\n" +
                            "\n" +
                            "윈드앙상블에 뜻과 열정 있는 서울 및 수도권 청년 \n" +
                            "예술가들이 모인 연주 단체로, 트럼페터 유재우 선생\n" +
                            "님을 예술감독 겸 상임지휘자로 모시고 창단 연주회를 \n" +
                            "계획하고 있습니다.\n" +
                            "\n" +
                            "윈드앙상블의 예술성을 널리 알리고 나아가 대한민국 \n" +
                            "윈드앙상블 발전에 기여하고 그 위상을 드높이며 나아가\n" +
                            " 한국 관악의 전통과 명맥을 잇고자 합니다.\n" +
                            "\n" +
                            "대한민국 관악계를 이끌어 갈 참신하고 열정있는 청년\n" +
                            "예술인 여러분들의 많은 관심을 부탁드리며\n" +
                            "악기 오디션은 따로 보고 있지 않습니다!\n" +
                            "\n" +
                            "창단연주의 감동과 열정을 함께할 청년 예술가 분들의 많은\n" +
                            " 참여와 지원 부탁드리겠습니다!\n" +
                            "\n" +
                            "아래 입단 원서와 카카오톡플러스 친구 링크를 올려드\n" +
                            "립니다 문의는 카카오톡으로 해주세요!",
                    "2020.01.17",
                    "오전 09시 00분",
                    "서울 영등포구 당산동 6가 323-1",
                    0,
                    100000,
                    100,
                    20,
                    1,
                    false,
                    "5시간",
                    37.51596,
                    126.90730
            ))
        }
        _jobOffer.value = sampleList
        jobOfferAdapter.setCount(_jobOffer.value!!.size)
    }

    fun onDetail(){
        startJobOfferDetailActivity(context)
    }

}
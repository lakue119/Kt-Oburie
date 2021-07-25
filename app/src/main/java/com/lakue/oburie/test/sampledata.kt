package com.lakue.oburie.test

import com.lakue.oburie.R
import com.lakue.oburie.model.*
import com.lakue.oburie.model.chat.Chatting
import com.lakue.oburie.model.chat.Conversation
import com.lakue.oburie.model.history.History
import com.lakue.oburie.model.joboffer.JobOffer
import com.lakue.oburie.model.joboffer.JobOfferBadge
import com.lakue.oburie.model.profile.UserProfile

val testJobOffer1 = JobOffer(
        UserInfo(),
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
)
val testCategory = arrayListOf(
        Category(0, "서양・현악기", "", R.drawable.ic_violin),
        Category(0, "서양・관악기", "", R.drawable.ic_sexophone),
        Category(0, "서양・건반,타악기", "", R.drawable.ic_piano),
        Category(0, "성악", "", R.drawable.ic_vacalist),
        Category(0, "국악・현악기", "", R.drawable.ic_lyre),
        Category(0, "국악・관악기", "", R.drawable.ic_taepyeongso),
        Category(0, "국악・타악기", "", R.drawable.ic_drum),
        Category(0, "실용음악", "", R.drawable.ic_sing)
)

val testJobOffer2 = JobOffer(
        UserInfo(),
        arrayListOf(JobOfferBadge(0, "NEW", ""), JobOfferBadge(0, "급구", "")),
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
)


val testPopularProfile = arrayListOf(
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.khan.co.kr/news/2021/02/09/l_2021021001001183200096551.webp"),
                UserInfo(
                        "최명락",
                        "https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://mblogthumb-phinf.pstatic.net/MjAxNzA0MDFfMTUg/MDAxNDkwOTc1NzA2NDQ0.dKScmu_4CHhPyKPHNWhiyy22fextMBWcuX4AXKeKgZgg.bu4S7Xdtb2n8HIpwZeCJ4KkQ91BHtyf7XOj_Y_QGEHUg.JPEG.uforme/JKS_6343_1500.jpg?type=w800"),
                UserInfo(
                        "최명락",
                        "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSbc5fAm8KKWhtfuUowwE-X8laMVrJhs4uY5A&usqp=CAU"),
                UserInfo(
                        "최명락",
                        "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://i.pinimg.com/736x/41/51/a8/4151a8467540eab6836c674a058967cf.jpg"),
                UserInfo(
                        "최명락",
                        "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRqkzInbr7rFS94Ut8cb_jnsvpJtBri-vgF-w&usqp=CAU"),
                UserInfo(), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                UserInfo(
                        "최명락",
                        "https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://blog.kakaocdn.net/dn/bn9vo0/btqX6fZ0weN/tdJ4bJXtxpy6EoaWKDpa91/img.jpg"),
                UserInfo(
                        "최명락",
                        "https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        )
)


val testNewProfile = arrayListOf(
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                UserInfo(
                        "최명락",
                        "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.insight.co.kr/static/2017/11/08/700/7cd9stx7vs3b29d3o5t5.jpg"),
                UserInfo(
                        "최명락",
                        "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://thumb.mtstarnews.com/06/2019/09/2019090309160510586_1.jpg"),
                UserInfo(
                        "재준",
                        "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://photo.jtbc.joins.com/news/2021/01/11/202101110956085818.jpg"),
                UserInfo(
                        "저돌적인피망",
                        "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://newsimg.hankookilbo.com/cms/articlerelease/2021/03/01/7e075db3-5887-428d-9fc5-a53c82d707f0.jpg"),
                UserInfo(
                        "저돌적인피망",
                        "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.seoul.co.kr/img/upload/2020/12/03/SSI_20201203094748_O2.jpg"),
                UserInfo(
                        "저돌적인피망",
                        "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        )
)

val testGroupProfile = arrayListOf(
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://news.kbs.co.kr/data/news/2019/03/05/4150710_fVk.jpg"),
                UserInfo(
                        "노래잘해영",
                        "https://lh3.googleusercontent.com/proxy/KL2aY40A_yYcL81Ng2CXwgt_fxu5Z07Db-SRBN_KW1X6qB7h43hMtuz69RpriNRDE6Bcg9ruzq16Y-rNUICSftJBNNUU4CKECah2n97qz-mc4gMa",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://image.lawtimes.co.kr/images/54(5).jpg"),
                UserInfo(
                        "쿠팡",
                        "https://image.lawtimes.co.kr/images/54(5).jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        )
)


val testCategoryResultProfile = arrayListOf(
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://image.lawtimes.co.kr/images/54(5).jpg"),
                UserInfo(
                        "최명락",
                        "https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.marieclairekorea.com/2021/06/mck_60d028ab0cb56.jpg"),
                UserInfo(
                        "최명락",
                        "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.insight.co.kr/static/2018/07/11/700/v509w24yv8eoq6506695.jpg"),
                UserInfo(
                        "최명락",
                        "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://sccdn.chosun.com/news/html/2021/02/27/2021022701001973000129201.jpg"),
                UserInfo(
                        "최명락",
                        "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://lh3.googleusercontent.com/proxy/yziJUCU_uDsV912iXB5e_YRxNXxRV344F_wINyqE7lRErBzl3Ax6QyuFhNldE2MvM4hBHIhkZvECvdgbma81-BgfQdgBPxF4aKABwkTs0lzmnJtpQ5XBU7_MI371lyGKr35D_pqB_xr1Pw"),
                UserInfo(), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://cdn.ilyoseoul.co.kr/news/photo/202104/448340_365468_1412.jpg"),
                UserInfo(
                        "최명락",
                        "https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://cdn.mhns.co.kr/news/photo/201910/312704_419008_3014.jpg"),
                UserInfo(
                        "최명락",
                        "https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://image.musinsa.com/mfile_s01/2021/05/17/796e5a8934b0e96b48d44d0972fdc561113916.jpg"),
                UserInfo(
                        "최명락",
                        "https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.hiphople.com/files/attach/images/6005854/858/749/017/b6e6b6848622d15d37e416d25a6c03b7.jpg"),
                UserInfo(
                        "최명락",
                        "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img1.daumcdn.net/thumb/R800x0/?scode=mtistory2&fname=https%3A%2F%2Ft1.daumcdn.net%2Fcfile%2Ftistory%2F020D5F5050AE50DA2A"),
                UserInfo(
                        "최명락",
                        "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf(
                        "data:image/jpeg;base64,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"
                ),
                UserInfo(
                        "최명락",
                        "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://t1.daumcdn.net/thumb/R720x0/?fname=http://t1.daumcdn.net/brunch/service/user/4cme/image/uisxqJBb7mVh09mOINkMlYCZw8U.jpg"),
                UserInfo(), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://pds.joins.com/news/component/htmlphoto_mmdata/201701/09/htm_2017010917316745861.jpg"),
                UserInfo(
                        "최명락",
                        "https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://img.wowtv.co.kr/wowtv_news/dnrs/20210305/2021030510085707329d3244b4fed182172186127.jpg"),
                UserInfo(
                        "최명락",
                        "https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        )
)


val testuserProfileDetail = Profile(
        "PLATINUM",
        "가야금",
        "대전,서울,천안",
        5.3F, 3.2F, 4.8F, 4.3F, 38,
        arrayListOf("https://dt40dm21pj8em.cloudfront.net/uploads/froala/file/6819/1569215127116.png"),
        UserInfo(
                "라꾸",
                "https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07",
                "",
                "",
                "m_lakue119",
                "https://www.youtube.com/channel/UCc31zhnmSwJB8czlaXlFSSg",
                "",
                "100001686914696"
        ), 100, "안녕하세요 웨딩 전문 사회자\n" +
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
        arrayListOf(
                Videos(
                        0,
                        "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                        "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                )
        ),
        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                "잘생김에 보컬까지~"
)

val testReview1 = Review(
        "https://lh3.googleusercontent.com/proxy/6mf-djVcFdvjBBopolXSe4bnKrPnaq7DKiw8AnUX6fgU9mUspk6HVpb41RfTZsA2MCKF7V1JkeQXabaeJpQvZh6-Gnej5BIjWJxjYuM5JmhQunzQ4T6sx4wU",
        "라꾸", 5, "시간 잘지키구 좋아요!!~", "gusrua", "2021.01.03 11:11:16", "잘맞아요~", true, "2021.01.15"
)

val testReview2 = Review(
        "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTA0MTZfMzUg%2FMDAxNjE4NTM1MzAzNDE2.JnDf4-6yRoH1J0MrkeLRymStBcJ32N6lhqMeXNZicR4g.IZCo3ArjX-viIgqluJsmIcHRx3NTjbFPFc81_herHEsg.JPEG.cksl1105%2F20210416%25A3%25DF024357.jpg&type=a340",
        "민호", 1, "시간 드릅게안지킴 ㅡ~", "gusrua", "2021.01.03 11:11:16", "잘맞아요~", false, "2021.01.15"
)

val testReview3 = Review(
        "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMDEyMjRfMjk5%2FMDAxNjA4Nzc3ODkyMjI2.iSjShJQxiU0U8FeEO7fV_2uYtCiRB37EP-6TmQ70CIUg.NG60vsuIFuvSZiXY1TKFLeb8YIp2CDKjp7jh0kcLJI8g.PNG.oscr10002%2FK-001.png&type=a340",
        "호현", 4, "매너좋아요~~", "gusrua", "2021.01.03 11:11:16", "잘맞아요~", true, "2021.01.15"
)

val testSearchRecomment =
    arrayListOf("가야금", "현악기", "국악기", "해금", "바이올린", "축가", "드럼", "첼로", "드럼펫", "결혼")

val testChatting1 = Chatting(
        idx = 0,
        text = "안녕하세요",
        date = "2021-01-01",
        type = "SEND"
)
val testChatting2 = Chatting(
        idx = 0,
        text = "안녕하세요",
        date = "2021-01-01",
        type = "ANSWER",
        profileImg = "https://spnimage.edaily.co.kr/images/Photo/files/NP/S/2017/03/PS17032000004.jpg",
        profileName = "라꾸"
)
val testChatting21 = Chatting(
        idx = 1,
        text = "ㅎ",
        date = "2021-01-01",
        type = "ANSWER",
        profileImg = "https://spnimage.edaily.co.kr/images/Photo/files/NP/S/2017/03/PS17032000004.jpg",
        profileName = "라꾸"
)
val testChatting22 = Chatting(
        idx = 2,
        text = "ㅇ",
        date = "2021-01-01",
        type = "ANSWER",
        profileImg = "https://spnimage.edaily.co.kr/images/Photo/files/NP/S/2017/03/PS17032000004.jpg",
        profileName = "라꾸"
)
val testChatting23 = Chatting(
        idx = 3,
        text = "ㅃ",
        date = "2021-01-01",
        type = "ANSWER",
        profileImg = "https://spnimage.edaily.co.kr/images/Photo/files/NP/S/2017/03/PS17032000004.jpg",
        profileName = "라꾸"
)
val testChatting24 = Chatting(
        idx = 4,
        text = "ㅉㅇ",
        date = "2021-01-01",
        type = "ANSWER",
        profileImg = "https://spnimage.edaily.co.kr/images/Photo/files/NP/S/2017/03/PS17032000004.jpg",
        profileName = "라꾸"
)
val testChatting221 = Chatting(
        idx = 0,
        text = "안녕하세요",
        date = "2021-01-05",
        type = "ANSWER",
        profileImg = "https://spnimage.edaily.co.kr/images/Photo/files/NP/S/2017/03/PS17032000004.jpg",
        profileName = "라꾸"
)
val testChatting3 = Chatting(
        idx = 0,
        text = "안녕하세요",
        date = "2021-01-01",
        type = "SEND_MAP",
        locationTitle = "서울특별시 신대방동 632-10",
        meetingDate = "2021년 02월 13일",
        meetingNeedTime = "2시간 30분",
        meetingStartTime = "13시 30분",
        state = "NORMAL"
)
val testChatting4 = Chatting(
        idx = 0,
        text = "안녕하세요",
        date = "2021-01-01",
        type = "ANSWER_MAP",
        locationTitle = "서울특별시 신대방동 632-10",
        meetingDate = "2021년 02월 13일",
        meetingNeedTime = "2시간 30분",
        meetingStartTime = "13시 30분",
        state = "NORMAL"
)
val testChatting5 = Chatting(
        idx = 0,
        text = "라꾸님이 확인하였습니다.",
        date = "2021-01-01",
        type = "MESSAGE"
)
val testConversation1 = Conversation(
        profileImg = "https://i.pinimg.com/474x/59/ff/5d/59ff5df692c4cd4eb2cc33d54a2f28ff.jpg",
        profileName = "현진",
        profileLocation = "서울",
        profileMajor = "보컬",
        lastChatContent = "안녕하세요~",
        lastChatDate = "2021.01.12"
)


val testResume = arrayListOf(
        "개인프로필",
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("http://d7p29s5ird9zx.cloudfront.net/upFiles/StageTalkV2/Editor/2020/5/31/20200531084934f961390885464ab6a3741bf77042ecd7.jpg"),
                UserInfo(
                        "노래잘해영",
                        "https://lh3.googleusercontent.com/proxy/KL2aY40A_yYcL81Ng2CXwgt_fxu5Z07Db-SRBN_KW1X6qB7h43hMtuz69RpriNRDE6Bcg9ruzq16Y-rNUICSftJBNNUU4CKECah2n97qz-mc4gMa",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://image.lawtimes.co.kr/images/54(5).jpg"),
                UserInfo(
                        "쿠팡",
                        "https://image.lawtimes.co.kr/images/54(5).jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        "팀프로필",
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                UserInfo(
                        "최명락",
                        "https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        ),
        Profile(
                "PLATINUM",
                "가야금",
                "대전,서울,천안",
                4.0f, 4.0f, 4.0f, 4.0f, 38,
                arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                UserInfo(
                        "최명락",
                        "https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg",
                        "",
                        "",
                        "",
                        "",
                        "",
                        ""
                ), 100, "안녕하세용~~", "경력", "수상내역",
                arrayListOf(
                        Videos(
                                0,
                                "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                        )
                ),
                "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                        "잘생김에 보컬까지~"
        )
)

val testUserProfileDetail = UserProfile(
        arrayListOf(
                Profile(
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
                        UserInfo(
                                "최명락",
                                "https://lh3.googleusercontent.com/proxy/K843mrA6eXZ7wGbziFoSvYmIiLYumwrv9OY-9RuVWiUlrz0daolZgPoxdq-AxF07gWd7JUD_4cp1GLmT6yshGGxfBZALso-JG7_1P-2yYMLv_P2E0AhQ15YZ89dKIfJ_NQQbwasjIt-6WDT9zhHSCzCwuAcLGKtexg9D",
                                "",
                                "",
                                "",
                                "",
                                "",
                                ""
                        ), 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf(
                                Videos(
                                        0,
                                        "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                        "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                                )
                        ),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"
                ), Profile(
                        "PLATINUM",
                        "가야금",
                        "대전,서울,천안",
                        4.0f, 4.0f, 4.0f, 4.0f, 38,
                        arrayListOf("https://img.wowtv.co.kr/wowtv_news/dnrs/20210305/2021030510085707329d3244b4fed182172186127.jpg"),
                        UserInfo(
                                "최명락",
                                "https://i.pinimg.com/736x/60/e9/85/60e9857c0a7c30f253de03eedc248879.jpg",
                                "",
                                "",
                                "",
                                "",
                                "",
                                ""
                        ), 100, "안녕하세용~~", "경력", "수상내역",
                        arrayListOf(
                                Videos(
                                        0,
                                        "https://www.youtube.com/watch?v=HUeLK-RQBjU",
                                        "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"
                                )
                        ),
                        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                                "잘생김에 보컬까지~"
                )
        ),
        UserInfo(
                "최명락",
                "https://pbs.twimg.com/profile_images/522969357756809217/qMc48ViZ_400x400.jpeg",
                "게시글 수정은 글 작성일로부터 일주일 이내로 수정이 가능합니다.\\n \\n 게시글 삭제는 현재 거래 진행중인 상태일 경우 수정, 삭제가 불가능합니다.",
                "",
                "m_lakue119",
                "https://www.youtube.com/channel/UCc31zhnmSwJB8czlaXlFSSg",
                "",
                "100001686914696"
        )
)

val testHistory = arrayListOf(
        History(
                "거래중",
                JobOffer(
                        UserInfo(),
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
                        126.90730,
                        "라꾸",
                        "fkRn",
                        "20.03.11 17:35"
                )
        ),
        History(
                "거래 완료",
                JobOffer(
                        UserInfo(),
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
                        126.90730,
                        "라꾸",
                        "",
                        "20.03.11 17:35"
                )
        ),
        History(
                "거래 취소",
                JobOffer(
                        UserInfo(),
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
                        126.90730,
                        "라꾸",
                        "fkRn",
                        "20.03.11 17:35"
                )
        )
)

val testMyJobOfferSample = arrayListOf(
        History(
                "게시중",
                JobOffer(
                        UserInfo(),
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
                        126.90730,
                        "라꾸",
                        "fkRn",
                        "20.03.11 17:35"
                )
        ),
        History(
                "게시만료",
                JobOffer(
                        UserInfo(),
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
                        126.90730,
                        "라꾸",
                        "",
                        "20.03.11 17:35"
                )
        ),
        History(
                "게시중",
                JobOffer(
                        UserInfo(),
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
                        126.90730,
                        "라꾸",
                        "fkRn",
                        "20.03.11 17:35"
                )
        )
)
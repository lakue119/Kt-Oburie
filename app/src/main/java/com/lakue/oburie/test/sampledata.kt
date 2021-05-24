package com.lakue.oburie.test

import com.lakue.oburie.R
import com.lakue.oburie.model.*
import com.lakue.oburie.model.joboffer.JobOffer
import com.lakue.oburie.model.joboffer.JobOfferBadge

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
    Category(0, "서양・건반,타악기", "", R.drawable.ic_piano)
    ,
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
        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                "잘생김에 보컬까지~"
    ),
    Profile(
        "PLATINUM",
        "가야금",
        "대전,서울,천안",
        4.0f, 4.0f, 4.0f, 4.0f, 38,
        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
        UserInfo(), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
        arrayListOf("https://lh3.googleusercontent.com/proxy/CJyIAETW_5CaxFuVgKqk2aoFE-V9EUFf1-9LmFvjnHFsBHuYymgnH9q0NB82yGmBxe--I2NaRDDfZ1Bh5EIWydgASP8JqlTq7NDai_UFW1LSA1ze_lnShEXMKzvXHHqd"),
        UserInfo(
            "노래잘해영",
            "https://lh3.googleusercontent.com/proxy/CJyIAETW_5CaxFuVgKqk2aoFE-V9EUFf1-9LmFvjnHFsBHuYymgnH9q0NB82yGmBxe--I2NaRDDfZ1Bh5EIWydgASP8JqlTq7NDai_UFW1LSA1ze_lnShEXMKzvXHHqd",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                "잘생김에 보컬까지~"
    ),
    Profile(
        "PLATINUM",
        "가야금",
        "대전,서울,천안",
        4.0f, 4.0f, 4.0f, 4.0f, 38,
        arrayListOf("https://lh3.googleusercontent.com/proxy/snYToLMR5_qhWZU3SyJQMpeT-PlcyEUz6q50AlW3gTpJnT5KSwA0-7OOn_CCs9Jf7jEB8hJZ5dxsN2h43OiDQZXPIBceT0bK_z_3vHXZevN2"),
        UserInfo(
            "쿠팡",
            "https://lh3.googleusercontent.com/proxy/snYToLMR5_qhWZU3SyJQMpeT-PlcyEUz6q50AlW3gTpJnT5KSwA0-7OOn_CCs9Jf7jEB8hJZ5dxsN2h43OiDQZXPIBceT0bK_z_3vHXZevN2",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                "잘생김에 보컬까지~"
    ),
    Profile(
        "PLATINUM",
        "가야금",
        "대전,서울,천안",
        4.0f, 4.0f, 4.0f, 4.0f, 38,
        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
        UserInfo(), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://t1.daumcdn.net/cfile/tistory/99DBC7425DDD362E07",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfOTgg/MDAxNTgxMDg1NzM0MzM4.zAEKMOTJiC1kziihr5HgN7IXe-r0VH8lniiqyG-Ds-cg.fDeO2lfE7ndU2T95t3OmEyOuQBN3mBQ28yZ6RYWdAVMg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7116.jpg?type=w800",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://modo-phinf.pstatic.net/20160506_20/1462514893413GcmEE_JPEG/mosahvIFOQ.jpeg?type=w1100",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            "https://img1.daumcdn.net/thumb/S272x320/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FqaGuY%2FbtqD9NO22oT%2FzufXfuCiVc9M0X7bf9xDCK%2Fimg.png",
            "",
            "",
            "",
            "",
            "",
            ""
        ), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
        "보컬/축가,교회, 모든행사 다뜁니다!!\n" +
                "잘생김에 보컬까지~"
    ),
    Profile(
        "PLATINUM",
        "가야금",
        "대전,서울,천안",
        4.0f, 4.0f, 4.0f, 4.0f, 38,
        arrayListOf("https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg"),
        UserInfo(), 100, "안녕하세용~~", "경력", "수상내역",
        arrayListOf(
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
            Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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
        Videos(0,"https://www.youtube.com/watch?v=HUeLK-RQBjU","https://cdn.imweb.me/upload/S20170720597014723fac6/5989c7725e109.jpg")),
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

val testSearchRecomment = arrayListOf("가야금","현악기","국악기","해금","바이올린","축가","드럼","첼로","드럼펫","결혼")
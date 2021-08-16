package com.lakue.oburie.utils

object PaymentScheme {
    const val ISP = "ispmobile" //	ISP모바일 : ispmobile://TID=nictest00m01011606281506341724
    const val BANKPAY = "kftc-bankpay"
    const val LOTTE_APPCARD =
        "lotteappcard" //	롯데앱카드 : intent://lottecard/data?acctid=120160628150229605882165497397&apptid=964241&IOS_RETURN_APP=#Intent;scheme=lotteappcard;package=com.lcacApp;end
    const val HYUNDAI_APPCARD =
        "hdcardappcardansimclick" //		현대앱카드 : intent:hdcardappcardansimclick://appcard?acctid=201606281503270019917080296121#Intent;package=com.hyundaicard.appcard;end;
    const val SAMSUNG_APPCARD =
        "mpocket.online.ansimclick" //	삼성앱카드 : intent://xid=4752902#Intent;scheme=mpocket.online.ansimclick;package=kr.co.samsungcard.mpocket;end;
    const val NH_APPCARD =
        "nhappcardansimclick" //	NH 앱카드 : intent://appcard?ACCTID=201606281507175365309074630161&P1=1532151#Intent;scheme=nhappcardansimclick;package=nh.smart.mobilecard;end;
    const val KB_APPCARD =
        "kb-acp" //	KB 앱카드 : intent://pay?srCode=0613325&kb-acp://#Intent;scheme=kb-acp;package=com.kbcard.cxh.appcard;end;
    const val MOBIPAY =
        "cloudpay" //	하나(모비페이) : intent://?tid=2238606309025172#Intent;scheme=cloudpay;package=com.hanaskcard.paycla;end;
    const val PACKAGE_ISP = "kvp.jjy.MispAndroid320"
    const val PACKAGE_BANKPAY = "com.kftc.bankpay.android"
    const val PACKAGE_LOTTE = "com.lcacApp"
    const val PACKAGE_HYUNDAI = "com.hyundaicard.appcard"
    const val PACKAGE_SAMSUNG = "kr.co.samsungcard.mpocket"
}

package com.lakue.oburie.extension

import android.view.View
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.lakue.oburie.utils.converter.ConvertNumberFormat
import java.lang.StringBuilder

/**
 * Text Format
 */
@BindingAdapter("revierCount")
fun TextView.setReviewCount(
    count: Int
){
    var sCount = count.toString()
    var countLength = sCount.length-1
    var reviewCount = StringBuilder(sCount.substring(0,1))
    for(i in 0 until countLength){
        reviewCount.append("0")
    }

    this.text = "(${ConvertNumberFormat.numberFormat(reviewCount.toString().toInt(),"+")})"
}

@BindingAdapter("minAmount","maxAmount")
fun TextView.setAmount(
    minAmount: Int,
    maxAmount: Int
){
    if(minAmount == maxAmount){
        this.text = "${ConvertNumberFormat.numberFormat(minAmount,"원")}"
    } else {
        this.text = "${ConvertNumberFormat.numberFormat(minAmount,"원")} ~ ${ConvertNumberFormat.numberFormat(maxAmount,"원")}"
    }
}

@BindingAdapter("reviewCount")
fun TextView.setAmount(
    reviewCount: Int
){
    this.text = "${reviewCount}개의 평가"
}

/**
 * ViewCount
 */
@BindingAdapter("viewCount")
fun TextView.setViewCount(count: Int){
    this.text = "조회수 : ${ConvertNumberFormat.numberFormat(count,"")}"
}

@BindingAdapter("userReviewCount")
fun TextView.setUserReviewCount(count: Int){
    this.text = "리뷰(${ConvertNumberFormat.numberFormat(count,"명")})"
}

@BindingAdapter("jobOfferViewCount", "jobOfferApplyCount")
fun TextView.setJobOfferView(viewCount: Int, applyCount: Int){
    this.text = "View ${ConvertNumberFormat.numberFormat(viewCount,"")}   지원 ${ConvertNumberFormat.numberFormat(applyCount,"")}"
}


@BindingAdapter("reviewName")
fun TextView.setReviewName(reviewName: String){
    this.text = "${reviewName}님의 리뷰"
}

@BindingAdapter("chatMapCancel")
fun TextView.setChatMapCancel(state: String){
    this.isVisible = state == "NORMAL"
}

@BindingAdapter("chatState","chatType")
fun View.setChatState(state: String,type: Int){
    when(type){
//        "SEND" -> {
//            this.isVisible = state == "END"
//        }
//        "ANSWER_DATE" -> {
//            this.isVisible = state == "END"
//        }
        50 -> {
            this.isVisible = state == "START"|| state == "ALL"
        }
        51 -> {
            if(state != "START"){
                if(state == "ALL"){
                    this.visibility = View.VISIBLE
                } else {
                    this.visibility = View.INVISIBLE
                }
            }
        }
        else -> {
            this.isVisible = state == "END" || state == "ALL"
        }
    }
}

@BindingAdapter("checkSelect")
fun TextView.checkSelect(gender: String){
    this.isSelected = gender == this.text.toString()
}


@BindingAdapter("stateVisible")
fun TextView.stateVisible(state: String){
    when(state){
        "거래중" -> {
            visibility = if(text == "거래 취소" || text == "거래 확정" || text == "상세보기"){
                View.VISIBLE
            } else {
                View.GONE
            }
        }
        "거래 취소" -> {
            visibility = if(text == "상대페이지" || text == "상세보기"){
                View.VISIBLE
            } else {
                View.GONE
            }
        }
        "거래 완료" -> {
            visibility = if(text == "리뷰남기기" || text == "상대페이지" || text == "상세보기"){
                View.VISIBLE
            } else {
                View.GONE
            }
        }
    }
}

@BindingAdapter("stateText")
fun TextView.stateText(state: String){
    when(state){
        "거래중" -> {
            text = "거래 취소는 최소 공연 3일전에 취소하실 수 있습니다."
        }
        "거래 취소" -> {
            visibility = View.GONE
        }
        "거래 완료" -> {
            text = "리뷴는 공연 종료 후 7일 이내 작성하실 수 있습니다."
        }
    }
}

@BindingAdapter("toMin", "fromMax")
fun TextView.convertMinMax(min: Int, max: Int){
    text = "${ConvertNumberFormat.numberFormat(min, "원")} ~ ${ConvertNumberFormat.numberFormat(max, "원")}"
}

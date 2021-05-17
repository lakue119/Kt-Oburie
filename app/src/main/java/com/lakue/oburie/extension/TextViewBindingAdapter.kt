package com.lakue.oburie.extension

import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.lakue.oburie.utils.ConvertNumberFormat
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



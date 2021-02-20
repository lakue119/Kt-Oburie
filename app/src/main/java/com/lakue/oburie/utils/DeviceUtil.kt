package com.lakue.oburie.utils

import com.lakue.oburie.utils.BaseUtils.context

object DeviceUtil {
    val deviceWidth: Int
        get() = context.resources.displayMetrics.widthPixels

    val deviceHeight: Int
        get() = context.resources.displayMetrics.heightPixels
}
package com.lakue.oburie.model.joboffer

import com.lakue.oburie.model.UserInfo

data class JobOffer(
        var user: UserInfo = UserInfo(),
        val badge: ArrayList<JobOfferBadge> = arrayListOf(JobOfferBadge()),
        val title: String = "",
        val content: String = "",
        val startDate: String = "",
        val startTime: String = "",
        val location: String = "",
        val minAmount: Int = 0,
        val maxAmount: Int = 0,
        val viewCount: Int = 0,
        val supportCount: Int = 0,
        val gender: Int = 0,
        val isSupportTransportation: Boolean = false,
        val needTime: String = "",
        val lat: Double = 0.0,
        val lnt: Double = 0.0
)
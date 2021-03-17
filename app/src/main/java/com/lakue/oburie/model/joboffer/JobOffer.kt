package com.lakue.oburie.model.joboffer

data class JobOffer(
        val badge: ArrayList<JobOfferBadge>,
        val title: String,
        val content: String,
        val startDate: String,
        val startTime: String,
        val location: String,
        val minAmount: Int,
        val maxAmount: Int,
        val viewCount: Int,
        val supportCount: Int,
        val gender: Int,
        val isSupportTransportation: Boolean,
        val needTime: String,
        val lat: Double,
        val lnt: Double
)
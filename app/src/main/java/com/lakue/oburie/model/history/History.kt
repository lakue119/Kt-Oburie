package com.lakue.oburie.model.history

import com.lakue.oburie.model.UserInfo
import com.lakue.oburie.model.joboffer.JobOffer

data class History(
    val state: String = "",
    val jobOffer: JobOffer = JobOffer()
)

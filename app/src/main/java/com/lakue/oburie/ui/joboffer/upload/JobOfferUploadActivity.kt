package com.lakue.oburie.ui.joboffer.upload

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityJobOfferDetailBinding
import com.lakue.oburie.databinding.ActivityJobOfferUploadBinding
import com.lakue.oburie.ui.joboffer.detail.JobOfferDetailViewModel
import com.lakue.oburie.ui.joboffer.searchlist.JobOfferSearchActivity

class JobOfferUploadActivity: BaseActivity<ActivityJobOfferUploadBinding, JobOfferUploadViewModel>(R.layout.activity_job_offer_upload){

    companion object {
        fun startJobOfferUploadActivity(
            context: Context
        ) {
            val intent = Intent(context, JobOfferUploadActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply{
            vm = viewModel
            activity = this@JobOfferUploadActivity
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

}

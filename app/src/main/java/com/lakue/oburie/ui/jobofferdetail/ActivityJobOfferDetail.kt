package com.lakue.oburie.ui.jobofferdetail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import com.lakue.oburie.databinding.ActivityJobOfferDetailBinding
import com.lakue.oburie.ui.categoryresult.CategoryResultActivity
import com.lakue.oburie.ui.categoryresult.CategoryResultViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ActivityJobOfferDetail  : BaseActivity<ActivityJobOfferDetailBinding, JobOfferDetailViewModel>(R.layout.activity_job_offer_detail) {
    companion object {
        fun startJobOfferDetailActivity(
                context: Context
        ) {
            val intent = Intent(context, ActivityJobOfferDetail::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
        }
    }


    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }
}
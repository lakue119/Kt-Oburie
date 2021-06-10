package com.lakue.oburie.ui.joboffer.searchlist

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.base.BaseFragment
import com.lakue.oburie.databinding.ActivityJobOfferSearchBinding
import com.lakue.oburie.databinding.FragmentJobOfferBinding
import com.lakue.oburie.ui.bottomnavigation.joboffer.JobOfferViewModel
import com.lakue.oburie.ui.jobhunter.searchlist.JobHunterSearchActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JobOfferSearchActivity : BaseActivity<ActivityJobOfferSearchBinding, JobOfferViewModel>(R.layout.activity_job_offer_search) {

    val keyword by lazy { "'${intent.getStringExtra("keyword")}'에 대한 검색결과" }

    companion object {
        fun startJobOfferSearchActivity(
            context: Context,
            keyword: String
        ) {
            val intent = Intent(context, JobOfferSearchActivity::class.java)
            intent.putExtra("keyword",keyword)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply{
            vm = viewModel
            activity = this@JobOfferSearchActivity
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

}
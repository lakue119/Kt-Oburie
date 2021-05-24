package com.lakue.oburie.ui.jobhunter.searchlist

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import com.lakue.oburie.databinding.ActivityJobHunterSearchBinding
import com.lakue.oburie.ui.jobhunter.list.JobHunterViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JobHunterSearchActivity : BaseActivity<ActivityJobHunterSearchBinding, JobHunterViewModel>(R.layout.activity_job_hunter_search) {

    val keyword by lazy { "'${intent.getStringExtra("keyword")}'에 대한 검색결과" }

    companion object {
        fun startJobHunterSearchActivity(
                context: Context,
                keyword: String
        ) {
            val intent = Intent(context, JobHunterSearchActivity::class.java)
            intent.putExtra("keyword",keyword)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@JobHunterSearchActivity
        }
    }


    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }
}
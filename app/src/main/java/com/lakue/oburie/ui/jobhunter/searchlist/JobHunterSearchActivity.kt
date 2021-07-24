package com.lakue.oburie.ui.jobhunter.searchlist

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityJobHunterSearchBinding
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.ui.expert.ExpertViewModel
import com.lakue.oburie.ui.jobhunter.list.JobHunterAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JobHunterSearchActivity : BaseActivity<ActivityJobHunterSearchBinding, ExpertViewModel>(R.layout.activity_job_hunter_search) {

    val keyword by lazy { "'${intent.getStringExtra("keyword")}'에 대한 검색결과" }

    lateinit var profileAdapter: JobHunterSearchAdapter

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
        profileAdapter = JobHunterSearchAdapter(viewModel)
        binding.apply {
            vm = viewModel
            activity = this@JobHunterSearchActivity
        }
        setData()
    }

    fun setData(){
        var sampleList = testCategoryResultProfile

        profileAdapter.addItem(sampleList)
    }


    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }
}
package com.lakue.oburie.ui.jobhunter.list

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import com.lakue.oburie.test.testCategoryResultProfile
import com.lakue.oburie.ui.expert.ExpertViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JobhunterActivity : BaseActivity<ActivityCategoryResultBinding, ExpertViewModel>(R.layout.activity_category_result) {

    lateinit var profileAdapter: JobHunterAdapter

    companion object {
        fun startCategoryResultActivity(
                context: Context
        ) {
            val intent = Intent(context, JobhunterActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        profileAdapter = JobHunterAdapter(viewModel)
        binding.apply {
            vm = viewModel
            activity = this@JobhunterActivity
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
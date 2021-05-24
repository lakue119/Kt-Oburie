package com.lakue.oburie.ui.jobhunter.list

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class JobhunterActivity : BaseActivity<ActivityCategoryResultBinding, JobHunterViewModel>(R.layout.activity_category_result) {

    companion object {
        fun startCategoryResultActivity(
                context: Context
        ) {
            val intent = Intent(context, JobhunterActivity::class.java)
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
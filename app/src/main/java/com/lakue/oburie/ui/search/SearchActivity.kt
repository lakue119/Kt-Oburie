package com.lakue.oburie.ui.search

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivitySearchBinding
import com.lakue.oburie.ui.jobhunter.searchlist.JobHunterSearchActivity.Companion.startJobHunterSearchActivity

class SearchActivity : BaseActivity<ActivitySearchBinding, SearchViewModel>(R.layout.activity_search) {

    companion object {
        fun startSearchActivity(
                context: Context
        ) {
            val intent = Intent(context, SearchActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply {
            vm = viewModel
            activity = this@SearchActivity
        }

        viewModel.apply {
            searchEvent eventObserve {showJobHunterSearchDetail(it)}
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    fun showJobHunterSearchDetail(keyword: String){
        startJobHunterSearchActivity(this@SearchActivity, keyword)
    }
}
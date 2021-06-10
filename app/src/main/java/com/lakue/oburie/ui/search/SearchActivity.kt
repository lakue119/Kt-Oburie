package com.lakue.oburie.ui.search

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivitySearchBinding
import com.lakue.oburie.ui.jobhunter.searchlist.JobHunterSearchActivity.Companion.startJobHunterSearchActivity
import com.lakue.oburie.ui.joboffer.searchlist.JobOfferSearchActivity.Companion.startJobOfferSearchActivity

class SearchActivity : BaseActivity<ActivitySearchBinding, SearchViewModel>(R.layout.activity_search) {

    val type by lazy { intent.getStringExtra("type") }

    companion object {
        fun startSearchActivity(
                context: Context,
                type: String
        ) {
            val intent = Intent(context, SearchActivity::class.java)
            intent.putExtra("type",type)
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
        if(type == "jobhunter"){
            startJobHunterSearchActivity(this@SearchActivity, keyword)
        } else {
            startJobOfferSearchActivity(this@SearchActivity, keyword)
        }
    }
}
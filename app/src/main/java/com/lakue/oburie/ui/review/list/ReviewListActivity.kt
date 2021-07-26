package com.lakue.oburie.ui.review.list

import android.content.Context
import android.content.Intent
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityReviewListBinding
import com.lakue.oburie.ui.review.answer.ReviewAnswerActivity.Companion.startReviewAnswerActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ReviewListActivity : BaseActivity<ActivityReviewListBinding, ReviewListViewModel>(R.layout.activity_review_list) {

    companion object {
        fun startReviewListActivity(
                context: Context
        ) {
            val intent = Intent(context, ReviewListActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply{
            vm = viewModel
        }

        viewModel.apply{
            reviewAnswerEvent eventObserve {showReviewAnswer()}
            userProfileEvent eventObserve {showUserProfile()}
        }
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    fun showReviewAnswer(){
        startReviewAnswerActivity(this@ReviewListActivity)
    }

    fun showUserProfile(){
        startUserProfileActivity(this@ReviewListActivity)
    }
}
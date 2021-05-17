package com.lakue.oburie.ui.review.answer

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityReviewAnswerBinding
import com.lakue.oburie.databinding.ActivityReviewListBinding
import com.lakue.oburie.ui.review.list.ReviewListActivity
import com.lakue.oburie.ui.review.list.ReviewListViewModel

class ReviewAnswerActivity : BaseActivity<ActivityReviewAnswerBinding, ReviewAnswerViewModel>(R.layout.activity_review_answer) {

    companion object {
        fun startReviewAnswerActivity(
            context: Context
        ) {
            val intent = Intent(context, ReviewAnswerActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {
        binding.apply{
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
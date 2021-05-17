package com.lakue.oburie.ui.review

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityReviewListBinding
import com.lakue.oburie.databinding.ActivityUserProfileBinding
import com.lakue.oburie.ui.userprofile.UserProfileActivity
import com.lakue.oburie.ui.userprofile.UserProfileViewModel

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
    }

    override fun setUI() {
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }
}
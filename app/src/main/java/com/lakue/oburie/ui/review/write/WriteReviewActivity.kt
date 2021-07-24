package com.lakue.oburie.ui.review.write

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityOburieHistoryDetailBinding
import com.lakue.oburie.databinding.ActivityWriteReviewBinding
import com.lakue.oburie.ui.history.detail.OburieHistoryDetailActivity
import com.lakue.oburie.ui.history.detail.OburieHistoryDetailViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WriteReviewActivity : BaseActivity<ActivityWriteReviewBinding, WriteReviewViewModel>(R.layout.activity_write_review) {

    companion object {
        fun startWriteReviewActivity(
                context: Context
        ) {
            val intent = Intent(context, WriteReviewActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {

    }

    override fun setUI() {

    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }
}
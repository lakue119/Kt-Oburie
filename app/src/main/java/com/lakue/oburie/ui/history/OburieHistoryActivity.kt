package com.lakue.oburie.ui.history

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityOburieHistoryBinding
import com.lakue.oburie.model.history.History
import com.lakue.oburie.test.testHistory
import com.lakue.oburie.ui.history.detail.OburieHistoryDetailActivity.Companion.startOburieHistoryDetailActivity
import com.lakue.oburie.ui.jobhunter.location.SelectLocationActivity
import com.lakue.oburie.ui.review.write.WriteReviewActivity.Companion.startWriteReviewActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity
import com.lakue.oburie.ui.userprofile.UserProfileActivity.Companion.startUserProfileActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OburieHistoryActivity : BaseActivity<ActivityOburieHistoryBinding, OburieHistoryViewModel>(R.layout.activity_oburie_history) {

    lateinit var historyAdapter: OburieHistoryAdapter

    val testHis = testHistory

    companion object {
        fun startOburieHistoryActivity(
                context: Context
        ) {
            val intent = Intent(context, OburieHistoryActivity::class.java)
            context.startActivity(intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        }
    }

    override fun init() {

        historyAdapter = OburieHistoryAdapter(viewModel)

        binding.apply {
            vm = viewModel
            activity = this@OburieHistoryActivity
            rvHistory.adapter = historyAdapter
        }

        viewModel.apply {
            cancelEvent eventObserve { showToast(it) }
            confiemEvent eventObserve { showToast(it) }
            editReviewEvent eventObserve { startWriteReviewActivity(this@OburieHistoryActivity) }
            showUserPageEvent eventObserve { startUserProfileActivity(this@OburieHistoryActivity) }
            showDetail eventObserve { startOburieHistoryDetailActivity(this@OburieHistoryActivity) }
        }

    }

    override fun setUI() {
        historyAdapter.addItem(testHis)
    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}
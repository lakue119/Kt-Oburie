package com.lakue.oburie.ui.history

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityOburieHistoryBinding
import com.lakue.oburie.ui.jobhunter.location.SelectLocationActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class OburieHistoryActivity : BaseActivity<ActivityOburieHistoryBinding, OburieHistoryViewModel>(R.layout.activity_oburie_history) {

    lateinit var historyAdapter: OburieHistoryAdapter

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

        viewModel.apply{
            showMyProfileEvent eventObserve {showToast(it)}
            cancelEvent eventObserve {showToast(it)}
            confiemEvent eventObserve {showToast(it)}
            editReviewEvent eventObserve {showToast(it)}
            showUserPageEvent eventObserve {showToast(it)}
            showDetail eventObserve {showToast(it)}
        }

    }

    override fun setUI() {
        historyAdapter.addItem(1)
        historyAdapter.addItem(1)
        historyAdapter.addItem(1)
        historyAdapter.addItem(1)
        historyAdapter.addItem(1)
        historyAdapter.addItem(1)
    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

}
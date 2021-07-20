package com.lakue.oburie.ui.history.detail

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityOburieHistoryDetailBinding
import com.lakue.oburie.ui.history.OburieHistoryActivity

class OburieHistoryDetailActivity: BaseActivity<ActivityOburieHistoryDetailBinding, OburieHistoryDetailViewModel>(R.layout.activity_oburie_history_detail) {

    companion object {
        fun startOburieHistoryDetailActivity(
            context: Context
        ) {
            val intent = Intent(context, OburieHistoryDetailActivity::class.java)
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
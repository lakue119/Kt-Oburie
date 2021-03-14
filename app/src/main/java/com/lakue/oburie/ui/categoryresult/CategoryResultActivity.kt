package com.lakue.oburie.ui.categoryresult

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import com.lakue.oburie.databinding.ActivityMainBinding
import com.lakue.oburie.ui.main.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CategoryResultActivity : BaseActivity<ActivityCategoryResultBinding, CategoryResultViewModel>(R.layout.activity_category_result) {

    companion object {
        fun startCategoryResultActivity(
                context: Context
        ) {
            val intent = Intent(context, CategoryResultActivity::class.java)
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
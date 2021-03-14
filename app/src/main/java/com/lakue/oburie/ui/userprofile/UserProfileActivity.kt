package com.lakue.oburie.ui.userprofile

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityCategoryResultBinding
import com.lakue.oburie.databinding.ActivityUserProfileBinding
import com.lakue.oburie.ui.categoryresult.CategoryResultActivity
import com.lakue.oburie.ui.categoryresult.CategoryResultViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class UserProfileActivity : BaseActivity<ActivityUserProfileBinding, UserProfileViewModel>(R.layout.activity_user_profile) {

    companion object {
        fun startUserProfileActivity(
                context: Context
        ) {
            val intent = Intent(context, UserProfileActivity::class.java)
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
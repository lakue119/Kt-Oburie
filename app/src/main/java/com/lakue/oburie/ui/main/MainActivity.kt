package com.lakue.oburie.ui.main

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatDialog
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityMainBinding
import com.lakue.oburie.databinding.DialogReviewBinding
import com.lakue.oburie.model.Profile
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_main.*


@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(R.layout.activity_main) {

    override fun init() {
        NavigationUI.setupWithNavController(bottomNavigationView, findNavController(R.id.nav_host_fragment))
        bottomNavigationView.itemIconTintList = null
    }

    override fun setUI() {
        showSuccessDialog(Profile("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMDdfNTEg/MDAxNTgxMDg1ODYyMjc5.nbkCfRoTfo15xgsGlv82ZmN0wBiTGhdJCxIqC5bOCpog.3hhxLTquJPHdN_Qc5PFyFyiqpLfsNORaKAuIB2rfDfgg.JPEG.7wayjeju/%EB%B0%B0%EC%9A%B0%ED%94%84%EB%A1%9C%ED%95%84%EC%82%AC%EC%A7%84_IMG7131.jpg?type=w800","최명락"))
    }

    override fun setEvent() {
    }

    override fun setObserve() {
    }

    var progressDialog: AppCompatDialog? = null

    fun showSuccessDialog(profile: Profile){
        if (progressDialog != null && progressDialog!!.isShowing) {
            return
        } else {
            progressDialog = AppCompatDialog(this@MainActivity)
            progressDialog!!.setCancelable(false)
            progressDialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            progressDialog!!.setContentView(R.layout.dialog_review)
            val reviewBinding: DialogReviewBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(progressDialog!!.context),
                    R.layout.dialog_review,
                    progressDialog!!.findViewById<RelativeLayout>(R.id.dialog_rl_review) as ViewGroup,
                    false)
            reviewBinding.profile = profile
            progressDialog!!.show()
        }

        val tv_close = progressDialog!!.findViewById<TextView>(R.id.tv_close)
        val tv_show = progressDialog!!.findViewById<TextView>(R.id.tv_show)


        tv_close?.onThrottleClick {
            if (progressDialog != null) {
                progressDialog!!.dismiss()
            }
        }
        tv_show?.onThrottleClick {
            if (progressDialog != null) {
                progressDialog!!.dismiss()
            }
        }
    }
}
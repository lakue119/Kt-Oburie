package com.lakue.oburie

import android.app.Activity
import android.app.Application
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatDialog
import com.lakue.oburie.utils.BaseUtils.init
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class OburieApplication : Application() {

    var progressDialog: AppCompatDialog? = null

    override fun onCreate() {
        super.onCreate()
        init(this)
    }

    fun showLoading(activity: Activity){
        if(activity == null || activity.isFinishing){
            return
        }

        if(progressDialog != null && progressDialog?.isShowing!!){

        } else {
            progressDialog = AppCompatDialog(activity)
            progressDialog?.apply{
                setCancelable(false)
                window?.setBackgroundDrawable(ColorDrawable(android.graphics.Color.TRANSPARENT))
                setContentView(R.layout.progress_loading)
                show()
            }
        }
    }

    fun hideLoading(){
        if(progressDialog != null && progressDialog?.isShowing!!){
            progressDialog?.dismiss()
        }
    }
}
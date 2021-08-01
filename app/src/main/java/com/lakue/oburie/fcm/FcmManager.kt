package com.lakue.oburie.fcm

import android.util.Log
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.ktx.Firebase
import com.google.firebase.messaging.FirebaseMessaging
import com.lakue.oburie.R
import com.lakue.oburie.utils.BaseUtils.context
import okhttp3.RequestBody

object FcmManager {
    val TAG = FcmManager::class.java.name

    interface OnEventListener {
        fun onSuccess(token: String)
    }

    fun getFcmToken(onEventListener: OnEventListener) {

        FirebaseMessaging.getInstance().token.addOnCompleteListener(OnCompleteListener { task ->
            if (!task.isSuccessful) {
                Log.w(TAG, "Fetching FCM registration token failed", task.exception)
                return@OnCompleteListener
            }

            // Get new FCM registration token
            val token = task.result

            onEventListener.onSuccess(token!!)
        })
    }
}
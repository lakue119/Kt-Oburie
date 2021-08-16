package com.lakue.oburie.utils

import android.app.Dialog
import android.app.Notification
import android.content.Context
import android.os.Message
import android.view.ContextMenu
import android.view.ViewGroup
import android.view.WindowManager
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebView.WebViewTransport
import android.webkit.WebViewClient
import com.lakue.oburie.utils.BaseUtils.context


class OBWebChromeClient: WebChromeClient() {
    val Tag = OBWebChromeClient::class.java.name

    override fun onCreateWindow(
        view: WebView?,
        isDialog: Boolean,
        isUserGesture: Boolean,
        resultMsg: Message?
    ): Boolean {
        // Dialog Create Code
        val newWebView = WebView(context)
        val webSettings = newWebView.settings
        webSettings.javaScriptEnabled = true
        val dialog = Dialog(context)
        dialog.setContentView(newWebView)
        val params: ViewGroup.LayoutParams = dialog.window?.attributes!!
        params.width = ViewGroup.LayoutParams.MATCH_PARENT
        params.height = ViewGroup.LayoutParams.MATCH_PARENT
        dialog.window?.attributes = params as WindowManager.LayoutParams
        dialog.show()
        newWebView.webChromeClient = object : WebChromeClient() {
            override fun onCloseWindow(window: WebView) {
                dialog.dismiss()
            }
        }

        // WebView Popup에서 내용이 안보이고 빈 화면만 보여 아래 코드 추가
        newWebView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(
                view: WebView,
                request: WebResourceRequest
            ): Boolean {
                return false
            }
        }
        (resultMsg?.obj as WebViewTransport).webView = newWebView
        resultMsg?.sendToTarget()
        return true
    }
}
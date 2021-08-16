package com.lakue.oburie.utils

import android.app.AlertDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.net.http.SslError
import android.os.Build
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.annotation.RequiresApi
import com.lakue.oburie.listener.OnLimitFinishListener
import com.lakue.oburie.utils.BaseUtils.context
import java.net.URISyntaxException


object WebViewClientClass : WebViewClient() {

    lateinit var listener: OnLimitFinishListener

    fun onSetFinishListener(listener: OnLimitFinishListener) {
        this.listener = listener
    }

    //페이지 이동
    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    override fun shouldOverrideUrlLoading(view: WebView, url: String): Boolean {
        LogUtil.i("payurl", "shouldOverrideUrlLoading : $url")
        if (!url.startsWith("http://") && !url.startsWith("https://") && !url.startsWith("javascript:")) {
            var intent: Intent? = null
            return try {
                intent = Intent.parseUri(url, Intent.URI_INTENT_SCHEME) //IntentURI처리
                LogUtil.i("payurl", "intent.getDataString()" + intent.dataString)
                val uri = Uri.parse(intent.dataString)
                context.startActivity(Intent(Intent.ACTION_VIEW, uri).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)) //해당되는 Activity 실행
                true
            } catch (ex: URISyntaxException) {
                false
            } catch (e: ActivityNotFoundException) {
                if (intent == null) return false
                if (handleNotFoundPaymentScheme(intent.scheme)) return true //설치되지 않은 앱에 대해 사전 처리(Google Play이동 등 필요한 처리)
                val packageName = intent.getPackage()
                if (packageName != null) { //packageName이 있는 경우에는 Google Play에서 검색을 기본
                    context.startActivity(
                        Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName")).addFlags(
                            Intent.FLAG_ACTIVITY_NEW_TASK
                        ))
                    return true
                }
                false
            }
        }
        return false
    }

    //    override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
//        handler?.proceed()
//    }
    override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler, error: SslError?): Unit {
        val builder: AlertDialog.Builder = AlertDialog.Builder(context)
        builder.setMessage("이 사이트의 보안 인증서는 신뢰하는 보안 인증서가 아닙니다. 계속하시겠습니까?")
        builder.setPositiveButton("계속하기") { _, _ -> handler.proceed() }
        builder.setNegativeButton("취소") { _, _ -> handler.cancel() }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }

    override fun onPageFinished(view: WebView, url: String) {
        LogUtil.d("payurl", "onPageFinished$url")
//        binding.webView.visibility = View.VISIBLE
//        hideLoading()
        listener.onLimitFinish()
        view.loadUrl("javascript:window.Android.getHtml(document.getElementsByTagName('body')[0].innerHTML);")
        super.onPageFinished(view, url)
    }

    fun handleNotFoundPaymentScheme(scheme: String?): Boolean {
        //PG사에서 호출하는 url에 package정보가 없어 ActivityNotFoundException이 난 후 market 실행이 안되는 경우
        if (PaymentScheme.ISP.equals(scheme, ignoreCase = true)) {
            context.startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + PaymentScheme.PACKAGE_ISP)).addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                ))
            return true
        } else if (PaymentScheme.BANKPAY.equals(scheme, ignoreCase = true)) {
            context.startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + PaymentScheme.PACKAGE_BANKPAY)).addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                ))
            return true
        } else if (PaymentScheme.HYUNDAI_APPCARD.equals(scheme, ignoreCase = true)) {
            context.startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + PaymentScheme.PACKAGE_HYUNDAI)).addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                ))
            return true
        } else if (PaymentScheme.LOTTE_APPCARD.equals(scheme, ignoreCase = true)) {
            context.startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + PaymentScheme.PACKAGE_LOTTE)).addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                ))
            return true
        } else if (PaymentScheme.SAMSUNG_APPCARD.equals(scheme, ignoreCase = true)) {
            context.startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + PaymentScheme.PACKAGE_SAMSUNG)).addFlags(
                    Intent.FLAG_ACTIVITY_NEW_TASK
                ))
            return true
        }
        return false
    }
}
package com.lakue.oburie.ui.location.search

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.view.View
import android.view.WindowManager
import android.webkit.JavascriptInterface
import android.webkit.WebChromeClient
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebView.WebViewTransport
import com.lakue.oburie.BuildConfig
import com.lakue.oburie.R
import com.lakue.oburie.base.BaseActivity
import com.lakue.oburie.databinding.ActivityLocationSearchBinding
import com.lakue.oburie.listener.OnLimitFinishListener
import com.lakue.oburie.utils.LogUtil
import com.lakue.oburie.utils.WebViewClientClass


class LocationSearchActivity :
    BaseActivity<ActivityLocationSearchBinding, LocationSearchViewModel>(R.layout.activity_location_search) {

    val link = "${BuildConfig.BASE_URL}viewport.html"
    val KEY_NAME = "OburieApp"

    private var handler: Handler? = null

    var addressNum = ""
    var address1 = ""
    var address2 = ""

    companion object {
        fun startLocationSearchActivity(
            context: Context
        ) {
            val intent = Intent(context, LocationSearchActivity::class.java)
            context.startActivity(intent)
        }
    }

    override fun init() {
        binding.apply {
            lifecycleOwner = this@LocationSearchActivity
        }
        handler = Handler(Looper.getMainLooper())
    }

    override fun setUI() {
        binding.apply {
            webView.apply {
                settings.apply {
                    javaScriptEnabled = true // 웹페이지 자바스클비트 허용 여부
                    setSupportMultipleWindows(true) // 새창 띄우기 허용 여부
                    javaScriptCanOpenWindowsAutomatically = true // 자바스크립트 새창 띄우기(멀티뷰) 허용 여부
                    loadWithOverviewMode = true // 메타태그 허용 여부
                    useWideViewPort = true // 화면 사이즈 맞추기 허용 여부

                    domStorageEnabled = true // 로컬저장소 허용 여부
                    allowFileAccess = true // 크로스도메인 허용
                    allowContentAccess = true // 크로스도메인 허용
                    allowFileAccessFromFileURLs = true // 크로스도메인 허용
                    allowUniversalAccessFromFileURLs = true // 크로스도메인 허용
                    loadsImagesAutomatically = true
                    mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
                    setLayerType(View.LAYER_TYPE_HARDWARE, null)
                }
                addJavascriptInterface(AddressBridge(), KEY_NAME)
                webViewClient = WebViewClientClass
                WebViewClientClass.onSetFinishListener(OnLimitFinishListener {
                    binding.webView.visibility = View.VISIBLE
                })

                webChromeClient = object : WebChromeClient() {
                    override fun onCreateWindow(
                        view: WebView?,
                        isDialog: Boolean,
                        isUserGesture: Boolean,
                        resultMsg: Message?
                    ): Boolean {
                        val newWebView = WebView(this@LocationSearchActivity)
                        newWebView.settings.javaScriptEnabled = true
                        val dialog = Dialog(this@LocationSearchActivity).apply {
                            setContentView(newWebView)
                        }
                        dialog.show()
                        val lp = WindowManager.LayoutParams().apply {
                            copyFrom(dialog.window!!.attributes)
                            width = WindowManager.LayoutParams.MATCH_PARENT
                            height = WindowManager.LayoutParams.MATCH_PARENT
                        }
                        dialog.window!!.attributes = lp
                        newWebView.webChromeClient = object : WebChromeClient() {
                            override fun onCloseWindow(window: WebView) {
                                dialog.dismiss()
                            }
                        }
                        (resultMsg?.obj as WebViewTransport).webView = newWebView
                        resultMsg?.sendToTarget()
                        return true
                    }
                }
                loadUrl(link)
            }
        }
    }

    override fun setEvent() {

    }

    override fun setObserve() {

    }

    //웹뷰에서 가져온 주소 데이터 처리
    private inner class AddressBridge {
        @JavascriptInterface
        fun setAddress(arg1: String, arg2: String, arg3: String) {
            handler!!.post {
                addressNum = arg1
                address1 = arg2
                address2 = arg3

                LogUtil.d("QWRLKJ", "$addressNum / $address1 / $address2")
                val resultIntent = Intent()
                resultIntent.putExtra("address_num", addressNum)
                resultIntent.putExtra("address", address1 + address2)
                setResult(Activity.RESULT_OK, resultIntent)
                finish()
            }
        }
    }
}
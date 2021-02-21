package com.lakue.oburie.base

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.text.Editable
import android.text.SpannableString
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.FragmentManager
import com.lakue.oburie.R
import com.lakue.oburie.listener.OnThrottleClickListener

abstract open class BaseActivity: AppCompatActivity() {
    var mToast: Toast? = null
    var isShowToast = false

    protected inline fun <reified T : ViewDataBinding> binding(@LayoutRes resId: Int): Lazy<T> =
        lazy { DataBindingUtil.setContentView<T>(this, resId) }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)

        setUI()
    }

    abstract fun setUI()


    @SuppressLint("ShowToast")
    open fun showToast(msg: String?) {
        if (mToast == null) {
            mToast = Toast.makeText(this, "", Toast.LENGTH_LONG)
        }

        val inflater = layoutInflater
        // Custom 레이아웃 Imflatation '인플레이션', 레이아웃 메모리에 객체화
        val layout: View = inflater.inflate(
            R.layout.toast_custom,
            findViewById<View>(R.id.toast_custom) as? ViewGroup
        )
        // 보여줄 메시지 설정 위해 TextView 객체 연결, 인플레이션해서 생성된 View를 통해 findViewById 실행
        val message: TextView = layout.findViewById(R.id.tv_toast)
        message.text = msg
        mToast?.view = layout
        mToast?.show()
        isShowToast = true
        Handler().postDelayed({ //여기에 딜레이 후 시작할 작업들을 입력
            if (isShowToast) {
                mToast?.cancel()
                isShowToast = false
            }
        }, 1500) // 0.5초 정도 딜레이를 준 후 시작
    }

    open fun onKeyboardHide(editText: EditText) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editText.windowToken, 0)
    }

    fun View.onThrottleClick(action: (v: View) -> Unit) {
        val listener = View.OnClickListener { action(it) }
        setOnClickListener(OnThrottleClickListener(listener))
    }

    fun View.onThrottleClick(action: (v: View) -> Unit, interval: Long) {
        val listener = View.OnClickListener { action(it) }
        setOnClickListener(OnThrottleClickListener(listener, interval))
    }
    fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)
}
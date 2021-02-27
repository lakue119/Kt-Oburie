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
import androidx.lifecycle.ViewModelLazy
import androidx.lifecycle.ViewModelProvider
import com.lakue.oburie.BR
import com.lakue.oburie.R
import com.lakue.oburie.listener.OnThrottleClickListener
import io.reactivex.disposables.CompositeDisposable
import java.lang.reflect.ParameterizedType
import javax.inject.Inject

abstract class BaseActivity<B : ViewDataBinding, VM : BaseViewModel>(
    @LayoutRes val layoutId: Int
) : AppCompatActivity() {

    var mToast: Toast? = null
    var isShowToast = false

    lateinit var binding: B

    private val viewModelClass = ((javaClass.genericSuperclass as ParameterizedType?)
        ?.actualTypeArguments
        ?.get(1) as Class<VM>).kotlin

    protected open val viewModel by ViewModelLazy(
        viewModelClass,
        { viewModelStore },
        { defaultViewModelProviderFactory }
    )

    private val compositeDisposable = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, layoutId)
        binding.lifecycleOwner = this

        init()
        setUI()
        setEvent()
        setObserve()
    }

    abstract fun init()
    abstract fun setUI()
    abstract fun setEvent()
    abstract fun setObserve()

    override fun onDestroy() {
        super.onDestroy()
        compositeDisposable.clear()
    }

    @SuppressLint("ShowToast")
    protected fun showToast(msg: String?) {
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
    protected fun onKeyboardHide(editText: EditText) {
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(editText.windowToken, 0)
    }

    protected fun View.onThrottleClick(action: (v: View) -> Unit) {
        val listener = View.OnClickListener { action(it) }
        setOnClickListener(OnThrottleClickListener(listener))
    }

    protected fun View.onThrottleClick(action: (v: View) -> Unit, interval: Long) {
        val listener = View.OnClickListener { action(it) }
        setOnClickListener(OnThrottleClickListener(listener, interval))
    }

    //null이면 ""으로 변환
    protected fun String.ifNullEmpty(): String {
        return if (this.isNullOrEmpty()) {
            ""
        } else {
            this
        }
    }

    protected fun String.isNullToEmpty(): String{
        return if(this == "null"){
            ""
        } else {
            this
        }
    }

    protected fun String.toEditable(): Editable = Editable.Factory.getInstance().newEditable(this)
}
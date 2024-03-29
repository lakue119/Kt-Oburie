package com.lakue.oburie.ui.main

import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.pref.PrefManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    val prefManager: PrefManager
): BaseViewModel() {

    fun getPref(): PrefManager = prefManager

}
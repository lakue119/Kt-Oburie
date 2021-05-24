package com.lakue.oburie.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.test.*
import com.lakue.oburie.ui.search.SearchAdapter
import com.lakue.oburie.utils.Event
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel()  {

    val searchRecommendAdapter = SearchAdapter(this)

    private val _searchRecommend = MutableLiveData<ArrayList<String>>(testSearchRecomment)
    val searchRecommend: LiveData<ArrayList<String>> = _searchRecommend


    private val _searchEvent = MutableLiveData<Event<String>>()
    val searchEvent: LiveData<Event<String>> = _searchEvent

    init {
        searchRecommendAdapter.dataCount = searchRecommend.value!!.size
    }

    fun onSearchDetail(keyword: String){
        _searchEvent.value = Event(keyword)
    }

}
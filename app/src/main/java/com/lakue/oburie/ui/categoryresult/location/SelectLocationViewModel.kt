package com.lakue.oburie.ui.categoryresult.location

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.viewModelScope
import com.lakue.oburie.base.BaseViewModel
import com.lakue.oburie.model.Location
import com.lakue.oburie.model.Profile
import com.lakue.oburie.utils.LogUtil
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SelectLocationViewModel @Inject constructor(
        savedStateHandle: SavedStateHandle//,
//    private val profileRepository: ProfileRepository
) : BaseViewModel() {

    private val _locationData = MutableLiveData<ArrayList<Location>>()
    val locationData: LiveData<ArrayList<Location>> = _locationData

    val locationAdapter = SelectLocationAdapter(this)

    val arrLocation = arrayListOf(Location(0,"전국", false),
            Location(0,"강원", false),
            Location(0,"경기", false),
            Location(0,"경남", false),
            Location(0,"경북", false),
            Location(0,"광주", false),
            Location(0,"대구", false),
            Location(0,"대전", false),
            Location(0,"부산", false),
            Location(0,"서울", false),
            Location(0,"세종", false),
            Location(0,"울산", false),
            Location(0,"인천", false),
            Location(0,"전남", false),
            Location(0,"전북", false),
            Location(0,"제주", false),
            Location(0,"충남", false),
            Location(0,"충북", false))


    init {
        _locationData.value = arrLocation
        locationAdapter.setCount(locationData.value!!.size)
    }

    fun sampleProfileData(){
//        _locationData.value = sampleList
//        locationAdapter.setCount(_locationData.value!!.size)
    }

    fun onSelectLocation(pos: Int){
        if(pos == 0){
            arrLocation.add(Location(0,"하이",false))
            arrLocation.add(Location(0,"하이",false))
            arrLocation.add(Location(0,"하이",false))
            arrLocation.add(Location(0,"하이",false))
            arrLocation.add(Location(0,"하이",false))
            arrLocation.add(Location(0,"하이",false))
        }
        viewModelScope.launch {
//            var sampleList = arrayListOf(Location(0,"전국", false),
//                    Location(0,"강원", false),
//                    Location(0,"경기", false),
//                    Location(0,"경남", false),
//                    Location(0,"경북", false),
//                    Location(0,"광주", false),
//                    Location(0,"대구", false),
//                    Location(0,"대전", false),
//                    Location(0,"부산", false),
//                    Location(0,"서울", true),
//                    Location(0,"세종", false),
//                    Location(0,"울산", false),
//                    Location(0,"인천", false),
//                    Location(0,"전남", false),
//                    Location(0,"전북", false),
//                    Location(0,"제주", true),
//                    Location(0,"충남", false),
//                    Location(0,"충북", false))
//
//            _locationData.value = sampleList

            arrLocation[pos].isSelect = !arrLocation[pos].isSelect
            _locationData.value = arrLocation
        }
        locationAdapter.setCount(locationData.value!!.size)
    }

}
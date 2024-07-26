package com.example.nativeappjetpaccompouse

import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain1.BluetoothDeviseRepository
import com.example.domain1.ConnectRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class ConnectViewModel @Inject constructor(
    bluetoothDeviseRepository: BluetoothDeviseRepository,
    private val connectRepository: ConnectRepository
) : ViewModel() {

    private var deviseListLiveData = bluetoothDeviseRepository.getBluetoothDevise()
    private val mediatorLiveData = MediatorLiveData<List<Int>>()

    init {
        /*mediatorLiveData.addSource(deviseListLiveData){
            mediatorLiveData.value = it
        }*/
    }

    fun connectToDevise() {
        viewModelScope.launch {
            connectRepository.connectToDevise()
        }
    }

}
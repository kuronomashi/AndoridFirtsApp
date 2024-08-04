package com.example.pruenbainterfaces.ui.detalleH

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(): ViewModel(){

    private  var _state = MutableStateFlow<HoroscopeDetailStatus>(HoroscopeDetailStatus.Cargando)
    val State: StateFlow<HoroscopeDetailStatus> = _state
}
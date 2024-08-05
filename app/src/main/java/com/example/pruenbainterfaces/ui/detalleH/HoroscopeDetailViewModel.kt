package com.example.pruenbainterfaces.ui.detalleH

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruenbainterfaces.Dominio.model.usecase.GetPredictionUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPredictionUseCase: GetPredictionUsecase): ViewModel(){

    private  var _state = MutableStateFlow<HoroscopeDetailStatus>(HoroscopeDetailStatus.Cargando)
    val State: StateFlow<HoroscopeDetailStatus> = _state

   fun getHoroscope(sign: String){
       viewModelScope.launch {
           getPredictionUseCase(sign)
       }
   }
}
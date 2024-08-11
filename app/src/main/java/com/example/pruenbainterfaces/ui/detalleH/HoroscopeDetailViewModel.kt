package com.example.pruenbainterfaces.ui.detalleH

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pruenbainterfaces.Dominio.model.HoroscopoModelo
import com.example.pruenbainterfaces.Dominio.model.usecase.GetPredictionUsecase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class HoroscopeDetailViewModel @Inject constructor(private val getPredictionUsecase: GetPredictionUsecase) : ViewModel(){


    private  var _state = MutableStateFlow<HoroscopeDetailStatus>(HoroscopeDetailStatus.Cargando)
    val State: StateFlow<HoroscopeDetailStatus> = _state

    lateinit var horoscope: HoroscopoModelo

   fun getHoroscope(sign: HoroscopoModelo){
       horoscope = sign
       viewModelScope.launch {
           _state.value = HoroscopeDetailStatus.Cargando
           val reult = withContext(Dispatchers.IO){getPredictionUsecase(sign.name)}
           if (reult != null){
               _state.value = HoroscopeDetailStatus.Success(reult.horoscope,reult.sign,horoscope)
           }else{
               _state.value = HoroscopeDetailStatus.Error("Ha ocurrido un error")
           }
       }
   }
}
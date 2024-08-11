package com.example.pruenbainterfaces.ui.Primerapagina

import androidx.lifecycle.ViewModel
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.data.o.provider.HoroscopoProvider
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class OroscopusViewModel @Inject constructor(HoroscopoProvider: HoroscopoProvider) : ViewModel(){

    private var _horoscope = MutableStateFlow<List<oroscopuesinformation>>(emptyList())
    val horoscope:StateFlow<List<oroscopuesinformation>> = _horoscope

    init {
        _horoscope.value = HoroscopoProvider.getOroscopusInfo()
    }

}
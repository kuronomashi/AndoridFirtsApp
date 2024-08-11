package com.example.pruenbainterfaces.ui.detalleH

import com.example.pruenbainterfaces.Dominio.model.HoroscopoModelo

sealed class HoroscopeDetailStatus {
    data object  Cargando:HoroscopeDetailStatus()
    data class  Error(val error:String):HoroscopeDetailStatus()
    data class  Success(val Prediccion:String, val sign: String, val horoscopemodel : HoroscopoModelo):HoroscopeDetailStatus()
}
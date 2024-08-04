package com.example.pruenbainterfaces.ui.detalleH

sealed class HoroscopeDetailStatus {
    data object  Cargando:HoroscopeDetailStatus()
    data class  Error(val error:String):HoroscopeDetailStatus()
    data class  Success(val data:String):HoroscopeDetailStatus()
}
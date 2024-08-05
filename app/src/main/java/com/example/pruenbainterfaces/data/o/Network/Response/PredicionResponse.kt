package com.example.pruenbainterfaces.data.o.Network.Response

import com.example.pruenbainterfaces.Dominio.model.PredictionModel
import com.google.gson.annotations.SerializedName

data class PredicionResponse(
    @SerializedName("date") val Datos: String,
    @SerializedName("horoscope") val Horoscopo: String,
    @SerializedName("sign") val Signo: String,
){
    fun toDomain():PredictionModel{
        return PredictionModel(horoscope = Horoscopo, sign = Signo)
    }
}
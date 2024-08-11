package com.example.pruenbainterfaces.data.o.provider

import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation.*
import javax.inject.Inject

class HoroscopoProvider @Inject constructor() {
    fun getOroscopusInfo(): List<oroscopuesinformation> {
        return listOf(
            Aries,Aries,
            Taurus,
            Geminis,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Escorpio,
            Sagitario,
            Capricornio,
            Acuario,
            Piscis
        )
    }
}
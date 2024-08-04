package com.example.pruenbainterfaces.data.o.provider

import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation.*
import javax.inject.Inject

class HoroscopoProvider {
    fun getOroscopusInfo(): List<oroscopuesinformation> {
        return listOf(
            Aries,Aries,
            Tauro,
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
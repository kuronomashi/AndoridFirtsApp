package com.example.pruenbainterfaces.data.o.provider

import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation
import com.example.pruenbainterfaces.Dominio.model.oroscopuesinformation.*
import javax.inject.Inject

class HoroscopoProvider @Inject constructor() {
    fun getOroscopusInfo(): List<oroscopuesinformation> {
        return listOf(
            Aries,Aries,
            Taurus,
            Gemini,Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces
        )
    }
}
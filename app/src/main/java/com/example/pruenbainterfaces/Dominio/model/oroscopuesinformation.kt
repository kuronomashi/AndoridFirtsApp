package com.example.pruenbainterfaces.Dominio.model

import com.example.pruenbainterfaces.R

sealed class oroscopuesinformation(val Imagen:Int,val name:Int){
    data object Aries : oroscopuesinformation(R.drawable.aries, R.string.Aries)
    data object Taurus : oroscopuesinformation(R.drawable.tauro, R.string.Tauro)
    data object Geminis : oroscopuesinformation(R.drawable.geminis, R.string.Geminis)
    data object Cancer : oroscopuesinformation(R.drawable.cancer, R.string.Cancer)
    data object Leo : oroscopuesinformation(R.drawable.leo, R.string.Leo)
    data object Virgo : oroscopuesinformation(R.drawable.virgo, R.string.Virgo)
    data object Libra : oroscopuesinformation(R.drawable.libra, R.string.Libra)
    data object Escorpio : oroscopuesinformation(R.drawable.escorpio, R.string.Escorpio)
    data object Sagitario : oroscopuesinformation(R.drawable.sagitario, R.string.Sagitario)
    data object Capricornio : oroscopuesinformation(R.drawable.capricornio, R.string.Capricornio)
    data object Acuario : oroscopuesinformation(R.drawable.aquario, R.string.Acuario)
    data object Piscis : oroscopuesinformation(R.drawable.piscis, R.string.Piscis)
}
package com.example.pruenbainterfaces.Dominio.model

import com.example.pruenbainterfaces.R

sealed class oroscopuesinformation(val Imagen:Int,val name:Int){
    object Aries : oroscopuesinformation(R.drawable.aries, R.string.Aries)
    object Tauro : oroscopuesinformation(R.drawable.tauro, R.string.Tauro)
    object Geminis : oroscopuesinformation(R.drawable.geminis, R.string.Geminis)
    object Cancer : oroscopuesinformation(R.drawable.cancer, R.string.Cancer)
    object Leo : oroscopuesinformation(R.drawable.leo, R.string.Leo)
    object Virgo : oroscopuesinformation(R.drawable.virgo, R.string.Virgo)
    object Libra : oroscopuesinformation(R.drawable.libra, R.string.Libra)
    object Escorpio : oroscopuesinformation(R.drawable.escorpio, R.string.Escorpio)
    object Sagitario : oroscopuesinformation(R.drawable.sagitario, R.string.Sagitario)
    object Capricornio : oroscopuesinformation(R.drawable.capricornio, R.string.Capricornio)
    object Acuario : oroscopuesinformation(R.drawable.aquario, R.string.Acuario)
    object Piscis : oroscopuesinformation(R.drawable.piscis, R.string.Piscis)
}
package com.example.pruenbainterfaces.Dominio.model.Repositorio

import com.example.pruenbainterfaces.Dominio.model.PredictionModel

interface Repository {
    suspend fun getPrediciones (sign: String):PredictionModel?
}
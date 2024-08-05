package com.example.pruenbainterfaces.Dominio.model.Repositorio

interface Repository {
    suspend fun getPrediciones (sign: String)
}
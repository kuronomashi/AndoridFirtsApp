package com.example.pruenbainterfaces.data.o

import android.util.Log
import com.example.pruenbainterfaces.Dominio.model.PredictionModel
import com.example.pruenbainterfaces.Dominio.model.Repositorio.Repository
import com.example.pruenbainterfaces.data.o.Network.HoroscopeAppService
import com.example.pruenbainterfaces.data.o.Network.Response.PredicionResponse
import retrofit2.Retrofit
import javax.inject.Inject

class RepositoryImPl @Inject constructor(private val ServiciosDeApi: HoroscopeAppService) :
    Repository {
    override suspend fun getPrediciones(sign: String): PredictionModel? {
        //Peticion de rtofit
        runCatching { ServiciosDeApi.getHroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { return null }
        return null
    }
}
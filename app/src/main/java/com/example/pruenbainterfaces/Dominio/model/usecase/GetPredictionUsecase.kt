package com.example.pruenbainterfaces.Dominio.model.usecase

import com.example.pruenbainterfaces.Dominio.model.Repositorio.Repository
import javax.inject.Inject

class GetPredictionUsecase @Inject constructor(private val repository: Repository)  {
    suspend operator fun invoke(sign:String) = repository.getPrediciones(sign)
}
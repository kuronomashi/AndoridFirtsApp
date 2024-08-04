package com.example.pruenbainterfaces.data.o.Network

import com.example.pruenbainterfaces.data.o.Network.Response.PredicionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeAppService {

    @GET("/{sign}")
    suspend fun getHroscope(@Path("sign") sign:String):PredicionResponse
}
package com.example.pruenbainterfaces.data.o.Network

import com.example.pruenbainterfaces.Dominio.model.Repositorio.Repository
import com.example.pruenbainterfaces.data.o.RepositoryImPl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    private fun Provideretrofit(): Retrofit {
       return Retrofit
           .Builder()
            .baseUrl("https://newastro.vercel.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    private fun ProvideretrofitApi(retrofit: Retrofit): HoroscopeAppService {
        return retrofit.create(HoroscopeAppService::class.java)
    }

    @Provides
    private fun ProvideretrofitRepository(apiservice: HoroscopeAppService): Repository {
        return RepositoryImPl(apiservice)
    }

}
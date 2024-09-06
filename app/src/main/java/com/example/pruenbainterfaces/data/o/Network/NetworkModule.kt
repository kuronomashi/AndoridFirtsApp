package com.example.pruenbainterfaces.data.o.Network

import com.example.pruenbainterfaces.BuildConfig.BASE_URL
import com.example.pruenbainterfaces.Dominio.model.Repositorio.Repository
import com.example.pruenbainterfaces.data.o.Core.interceptor.AuthInterceptor
import com.example.pruenbainterfaces.data.o.RepositoryImPl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideRetrofit(okhttpCliente: OkHttpClient): Retrofit {
       return Retrofit
           .Builder()
            .baseUrl(BASE_URL)
           .client(okhttpCliente)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    @Singleton
    fun providesOkhttpCliente(authInterceptor: AuthInterceptor): OkHttpClient {

        val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        return OkHttpClient.Builder().addInterceptor(interceptor).addInterceptor(authInterceptor).build()
    }

    @Provides
    fun provideHoroscopeApiService(retrofit: Retrofit): HoroscopeAppService {
        return retrofit.create(HoroscopeAppService::class.java)
    }

    @Provides
    fun provideRepository(apiservice: HoroscopeAppService): Repository {
        return RepositoryImPl(apiservice)
    }

}
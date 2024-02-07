package com.example.simpsonapi.network

import com.example.simpsonapi.models.Personaje
import okhttp3.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface WebService {

    @GET("quotes?count=12")
    suspend fun obtenerPersonajes(): retrofit2.Response<List<Personaje>>

    @GET("quotes")
    suspend fun obtenerPersonaje(
        @Query("character") personaje: String
    ): retrofit2.Response<List<Personaje>>
}
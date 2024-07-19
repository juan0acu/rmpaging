package com.juandevs.rmpaging.data

import com.juandevs.rmpaging.data.response.ResponseWrapper
import retrofit2.http.GET
import retrofit2.http.Query

interface RickMortyApiService {

    @GET("character/")
    suspend fun getCharacters(@Query("page") page:Int) : ResponseWrapper
}
package com.example.movieapp.data.network

import com.example.movieapp.data.model.Movies
import retrofit2.Response

interface ApiService {

    companion object {
        // api url
        val BASE_URL = ""
    }

    suspend fun getMovies() : Response<List<Movies>>

}
package com.alexy.movieapp.data.data.cache.database.converters

import androidx.room.TypeConverter
import com.alexy.movieapp.data.cache.database.entity.Movie
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class MovieConverter {
    private val gson = Gson()

    @TypeConverter
    fun fromMovie(movie: List<Movie>): String? {
        if (movie.isNullOrEmpty()) return null
        val type = object : TypeToken<List<Movie>?>() {}.type
        return gson.toJson(movie, type)
    }

    @TypeConverter
    fun toMovie(movieString: String?): List<Movie>? {
        if (movieString.isNullOrEmpty()) return null
        val type = object : TypeToken<List<Movie>?>() {}.type
        return gson.fromJson(movieString, type)
    }
}
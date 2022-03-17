package com.example.movieapp.data.data.cache.database.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.movieapp.data.data.cache.database.dao.MovieDao
import com.example.movieapp.data.data.cache.database.entity.Movie

@Database(entities = [Movie::class], version = 1, exportSchema = false)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao
}
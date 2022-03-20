package com.example.movieapp.data.cache.di

import androidx.room.Room
import com.example.movieapp.data.data.cache.database.db.MovieDatabase
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module


val cacheModule = module {
    single {
        Room.databaseBuilder(androidApplication(), MovieDatabase::class.java, "movies.db"
        ).build()
    }
}

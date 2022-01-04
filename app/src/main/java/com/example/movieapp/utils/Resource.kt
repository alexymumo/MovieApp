package com.example.movieapp.utils

data class Resource<out T>(val status: Status, val data: T?, val message: String?){
    fun <T> success(data: T?) : Resource<T>{
        return Resource(Status.SUCCESS, data , null)
    }
    fun <T> error(data: T?) : Resource<T>{
        return Resource(Status.ERROR, data , null)
    }
    fun <T> loading(data: T?) : Resource<T>{
        return Resource(Status.LOADING, data , null)
    }
}
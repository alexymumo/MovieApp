package com.alexy.movieapp.data.utils

import androidx.recyclerview.widget.DiffUtil
import com.alexy.movieapp.data.cache.database.entity.Movie

class MovieComparator: DiffUtil.ItemCallback<Movie>() {
    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id == newItem.id
    }
}
package com.example.movieapp.data.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movieapp.R

import com.example.movieapp.data.cache.database.entity.Movie
import com.example.movieapp.data.utils.MovieComparator
import com.example.movieapp.databinding.MovieItemBinding
import com.example.movieapp.domain.models.MovieShow

class MovieAdapter(private val movies: List<MovieShow>) : ListAdapter<Movie,MovieAdapter.MovieViewHolder>(
    MovieComparator()) {

    inner class MovieViewHolder(val binding: MovieItemBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: Movie) {
            Glide.with(binding.imageurl)
                .load(movie.title)
                .placeholder(R.drawable.ic_launcher_background)
                .centerCrop()
                .into(binding.imageurl) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val movieItemBinding = MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MovieViewHolder(movieItemBinding)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) = with(holder.binding) {

        val movie = getItem(position)
        holder.itemView.setOnClickListener {

        }
        holder.bind(movie)
    }
    override fun getItemCount() = currentList.size
}




/*movieCardView.setOnClickListener {
    val action = MovieFragmentDirections.actionMovieFragmentToDetailFragment(movie)
    Navigation.findNavController(it).navigate(action)
}*/
package com.etwicaksono.infomovie.ui.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.etwicaksono.infomovie.data.MovieEntity
import com.etwicaksono.infomovie.databinding.ItemsRowMovieBinding

class ListAdapter : RecyclerView.Adapter<ListAdapter.ListViewHolder>() {
    inner class ListViewHolder(private val binding: ItemsRowMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(movie: MovieEntity) {
            with(binding) {
                imgMovie.setImageResource(
                    binding.root.resources.getIdentifier(
                        movie.poster,
                        "drawable",
                        binding.root.context.packageName
                    )
                )
                tvTitle.text = movie.title
                tvReleaseDate.text = movie.releaseDate
                tvPlot.text = movie.plot
            }
        }

    }

    private val listMovies=ArrayList<MovieEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder {
        val binding = ItemsRowMovieBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        val movie =listMovies[position]
        holder.bind(movie)
    }

    override fun getItemCount(): Int =listMovies.size
}
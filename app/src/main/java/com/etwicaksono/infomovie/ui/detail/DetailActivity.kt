package com.etwicaksono.infomovie.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.etwicaksono.infomovie.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val id = intent.getIntExtra(EXTRA_ID, 1)
        val type = intent.getStringExtra(EXTRA_TYPE)

        val viewModel = ViewModelProvider(
            this,
            ViewModelProvider.NewInstanceFactory()
        )[DetailViewModel::class.java]
        viewModel.setSelectedMovie(type, id)
        viewModel.getMovies(this)
        val movie = viewModel.movie

        binding.apply {
            tvTitle.text = movie.title
            tvGenre.text = movie.genres
            ivPoster.setImageResource(
                root.resources.getIdentifier(
                    movie.poster,
                    "drawable",
                    this@DetailActivity.packageName
                )
            )
            tvReleaseDate.text=movie.releaseDate
            tvRuntime.text=movie.runtime
            tvPlot.text=movie.plot
            tvDirector.text=movie.director
            tvActors.text=movie.actors
        }
    }

    companion object {
        const val EXTRA_ID = "extra_id"
        const val EXTRA_TYPE = "extra_type"
    }
}
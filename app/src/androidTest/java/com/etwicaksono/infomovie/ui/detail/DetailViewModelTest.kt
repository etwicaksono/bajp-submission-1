package com.etwicaksono.infomovie.ui.detail

import com.etwicaksono.infomovie.data.MovieEntity
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private lateinit var dummyMovie: MovieEntity
    private lateinit var dummyTvShow: MovieEntity
    private var movieId = 1
    private var tvShowId = 1

    @Before
    fun setup(){
        viewModel= DetailViewModel()
    }

    @Test
    fun getMovies() {
        viewModel.setSelectedMovie("movies",movieId)
        dummyMovie=viewModel.movie

        viewModel.setSelectedMovie(dummyMovie)
        val movie =
    }
}
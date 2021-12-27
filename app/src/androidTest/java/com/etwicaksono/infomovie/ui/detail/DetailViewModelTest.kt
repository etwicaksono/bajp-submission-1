package com.etwicaksono.infomovie.ui.detail

import androidx.test.core.app.ApplicationProvider
import com.etwicaksono.infomovie.data.MovieEntity
import com.etwicaksono.infomovie.utils.DataDummy
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class DetailViewModelTest {

    private lateinit var viewModel: DetailViewModel
    private var dummyMovie = DataDummy.getAllMovies(ApplicationProvider.getApplicationContext())[0]
    private var dummyTvShow= DataDummy.getAllTvShows(ApplicationProvider.getApplicationContext())[0]
    private var movieId = dummyMovie.id
    private var tvShowId = dummyTvShow.id

    @Before
    fun setup(){
        viewModel= DetailViewModel()
    }

    @Test
    fun getMovieTest() {
        viewModel.setSelectedMovie("movies",movieId)
        viewModel.getMovie(ApplicationProvider.getApplicationContext())
        val movie =viewModel.movie
        Assert.assertNotNull(movie)
        Assert.assertEquals(dummyMovie.id,movie.id)
        Assert.assertEquals(dummyMovie.type,movie.type)
        Assert.assertEquals(dummyMovie.title,movie.title)
        Assert.assertEquals(dummyMovie.year,movie.year)
        Assert.assertEquals(dummyMovie.releaseDate,movie.releaseDate)
        Assert.assertEquals(dummyMovie.runtime,movie.runtime)
        Assert.assertEquals(dummyMovie.genres,movie.genres)
        Assert.assertEquals(dummyMovie.director,movie.director)
        Assert.assertEquals(dummyMovie.actors,movie.actors)
        Assert.assertEquals(dummyMovie.plot,movie.plot)
        Assert.assertEquals(dummyMovie.poster,movie.poster)
    }


    @Test
    fun getTvShowTest() {
        viewModel.setSelectedMovie("series",movieId)
        viewModel.getMovie(ApplicationProvider.getApplicationContext())
        val movie =viewModel.movie
        Assert.assertNotNull(movie)
        Assert.assertEquals(dummyTvShow.id,movie.id)
        Assert.assertEquals(dummyTvShow.type,movie.type)
        Assert.assertEquals(dummyTvShow.title,movie.title)
        Assert.assertEquals(dummyTvShow.year,movie.year)
        Assert.assertEquals(dummyTvShow.releaseDate,movie.releaseDate)
        Assert.assertEquals(dummyTvShow.runtime,movie.runtime)
        Assert.assertEquals(dummyTvShow.genres,movie.genres)
        Assert.assertEquals(dummyTvShow.director,movie.director)
        Assert.assertEquals(dummyTvShow.actors,movie.actors)
        Assert.assertEquals(dummyTvShow.plot,movie.plot)
        Assert.assertEquals(dummyTvShow.poster,movie.poster)
    }


}
package com.etwicaksono.infomovie.ui.list

import androidx.test.core.app.ApplicationProvider
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class ListViewModelInstrumentedTest {

    private lateinit var viewModel: ListViewModel

    @Before
    fun setup() {
        viewModel = ListViewModel()
    }

    @Test
    fun getAllMovies() {
        viewModel.getAllMovies(ApplicationProvider.getApplicationContext())
        val movies = viewModel.movie
        assertNotNull(movies)
        assertEquals(13,movies.size)
    }

    @Test
    fun getAllTvShows() {
         viewModel.getAllTvShows(ApplicationProvider.getApplicationContext())
        val movies = viewModel.movie
        assertNotNull(movies)
        assertEquals(13,movies.size)
    }
}
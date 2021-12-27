package com.etwicaksono.infomovie.ui.list

import android.content.Context
import androidx.lifecycle.ViewModel
import com.etwicaksono.infomovie.data.MovieEntity
import com.etwicaksono.infomovie.utils.DataDummy

class ListViewModel : ViewModel() {

    lateinit var movie: List<MovieEntity>

    fun getAllMovies(context: Context) {
        movie = DataDummy.getAllMovies(context)
    }

    fun getAllTvShows(context: Context) {
        movie = DataDummy.getAllTvShows(context)
    }


}
package com.etwicaksono.infomovie.ui.detail

import android.content.Context
import androidx.lifecycle.ViewModel
import com.etwicaksono.infomovie.data.MovieEntity
import com.etwicaksono.infomovie.utils.DataDummy
import com.etwicaksono.infomovie.utils.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class DetailViewModel : ViewModel() {

    private var movieId: Int = 1
    private lateinit var type: String
    lateinit var movie: MovieEntity

    fun setSelectedMovie(type: String?, id: Int) {
        if (type != null) {
            this.type = type
        }else{
            this.type="movies"
        }
        this.movieId = id
    }

    fun getMovie(context: Context) {
        val result = if(type=="movies")DataDummy.getAllMovies(context) else DataDummy.getAllTvShows(context)

        for (res in result) {
            if (movieId == res.id) {
                movie = res
            }
        }
    }
}
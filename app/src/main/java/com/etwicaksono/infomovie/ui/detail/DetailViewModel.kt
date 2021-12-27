package com.etwicaksono.infomovie.ui.detail

import android.content.Context
import androidx.lifecycle.ViewModel
import com.etwicaksono.infomovie.data.MovieEntity
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
        val jsonMovies = getJsonDataFromAsset(context, if(type=="movies")"movies.json" else "tvshows.json")
        val gson = Gson()
        val listMoviesType = object : TypeToken<List<MovieEntity>>() {}.type
        val result = gson.fromJson(jsonMovies, listMoviesType) as List<MovieEntity>

        for (res in result) {
            if (movieId == res.id) {
                movie = res
            }
        }
    }
}
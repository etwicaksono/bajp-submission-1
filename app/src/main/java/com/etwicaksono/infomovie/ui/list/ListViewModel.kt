package com.etwicaksono.infomovie.ui.list

import android.content.Context
import androidx.lifecycle.ViewModel
import com.etwicaksono.infomovie.data.MovieEntity
import com.etwicaksono.infomovie.utils.getJsonDataFromAsset
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class ListViewModel : ViewModel() {

    lateinit var movie: List<MovieEntity>

    fun getAllMovies(context: Context) {
        val jsonMovies = getJsonDataFromAsset(context, "movies.json")
        val gson = Gson()
        val listMoviesType = object : TypeToken<List<MovieEntity>>() {}.type
        movie = gson.fromJson(jsonMovies, listMoviesType)
    }

    fun getAllTvShows(context: Context) {
        val jsonMovies = getJsonDataFromAsset(context, "tvshows.json")
        val gson = Gson()
        val listMoviesType = object : TypeToken<List<MovieEntity>>() {}.type
        movie = gson.fromJson(jsonMovies, listMoviesType)
    }


}
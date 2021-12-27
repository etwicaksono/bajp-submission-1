package com.etwicaksono.infomovie.utils

import android.content.Context
import com.etwicaksono.infomovie.data.MovieEntity
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

object DataDummy {
    fun getAllMovies(context: Context): List<MovieEntity> {
        val jsonMovies = getJsonDataFromAsset(context, "movies.json")
        val gson = Gson()
        val listMoviesType = object : TypeToken<List<MovieEntity>>() {}.type
        return gson.fromJson(jsonMovies, listMoviesType)
    }

    fun getAllTvShows(context: Context): List<MovieEntity> {
        val jsonMovies = getJsonDataFromAsset(context, "tvshows.json")
        val gson = Gson()
        val listMoviesType = object : TypeToken<List<MovieEntity>>() {}.type
        return gson.fromJson(jsonMovies, listMoviesType)
    }
}
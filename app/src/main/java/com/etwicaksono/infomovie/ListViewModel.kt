package com.etwicaksono.infomovie

import android.content.Context
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class ListViewModel:ViewModel() {

    fun getAllMovies(context: Context):List<MovieEntity>{
        val jsonMovies = getJsonDataFromAsset(context,"movies.json")
        val gson = Gson()
        val listMoviesType = object:TypeToken<List<MovieEntity>>(){}.type
        return gson.fromJson(jsonMovies,listMoviesType)
    }

    fun getAllTvShows(context: Context):List<MovieEntity>{
        val jsonMovies = getJsonDataFromAsset(context,"tvshows.json")
        val gson = Gson()
        val listMoviesType = object:TypeToken<List<MovieEntity>>(){}.type
        return gson.fromJson(jsonMovies,listMoviesType)
    }

    private fun getJsonDataFromAsset(context: Context, fileName: String): String? {
        val jsonString:String
        try {
            jsonString=context.assets.open(fileName).bufferedReader().use{
                it.readText()
            }
        }catch (ioException:IOException){
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }


}
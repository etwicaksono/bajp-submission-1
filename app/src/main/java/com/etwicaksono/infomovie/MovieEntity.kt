package com.etwicaksono.infomovie


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieEntity(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("year")
    val year: String?,
    @SerializedName("release_date")
    val releaseDate: String?,
    @SerializedName("runtime")
    val runtime: String?,
    @SerializedName("genres")
    val genres: String?,
    @SerializedName("director")
    val director: String?,
    @SerializedName("actors")
    val actors: String?,
    @SerializedName("plot")
    val plot: String?,
    @SerializedName("poster")
    val poster: String?
):Parcelable
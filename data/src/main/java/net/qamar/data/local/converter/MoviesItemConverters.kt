package net.qamar.data.local.converter

import androidx.room.TypeConverter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import net.qamar.data.model.MovieEntity

class MoviesItemConverters {
    private val moshi = Moshi.Builder().build()
    private val termsType = Types.newParameterizedType(List::class.java, MovieEntity::class.java)
    private val termsAdapter = moshi.adapter<List<MovieEntity>>(termsType)
    @TypeConverter
    fun listToJson(list: List<MovieEntity>?) = termsAdapter.toJson(list)

    @TypeConverter
    fun jsonToList(value: String) = termsAdapter.fromJson(value).orEmpty()
}
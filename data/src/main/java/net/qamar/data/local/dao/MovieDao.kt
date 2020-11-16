package net.qamar.data.local.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import io.reactivex.Single
import net.qamar.data.model.MovieEntity
import net.qamar.data.model.SearchResultEntity
import net.qamar.domain.models.SearchResult


@Dao
interface MovieDao{
    @get:Query("select * from SearchResultEntity")
    val all: Single<SearchResultEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE )
    fun insert(t: SearchResultEntity?)

    @Insert(onConflict =OnConflictStrategy.REPLACE  )
    fun insert(t: List<SearchResultEntity>)
}
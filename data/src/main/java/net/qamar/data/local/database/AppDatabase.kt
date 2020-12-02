package net.qamar.data.local.database

import android.content.Context
import androidx.room.*
import net.qamar.data.local.converter.MoviesItemConverters
import net.qamar.data.local.dao.MovieDao
import net.qamar.data.model.MovieEntity
import net.qamar.data.model.SearchResultEntity
import net.qamar.data.util.MoshiJsonMapperAdapter


@Database(entities = [SearchResultEntity::class, MovieEntity::class], version = 1, exportSchema = false)
@TypeConverters(MoviesItemConverters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract val movieDao: MovieDao?

    companion object {
        private const val DATABASE_DB = "database.db"
        private var appDatabase: AppDatabase? = null
        fun getInstance(context: Context?): AppDatabase? {
            if (appDatabase == null) {
                appDatabase = Room.databaseBuilder(
                        context!!,
                        AppDatabase::class.java, DATABASE_DB
                ).allowMainThreadQueries().build()
            }
            return appDatabase
        }
    }
}
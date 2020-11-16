package net.qamar.data.di

import android.app.Application
import net.qamar.data.apiservice.ApiService


import dagger.Module
import dagger.Provides
import net.qamar.data.local.dao.MovieDao
import net.qamar.data.local.database.AppDatabase
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ApiModule {

    @Provides
    fun bindApiService(retrofit: Retrofit): ApiService {
        return retrofit.create(ApiService::class.java)
    }

    @Singleton
    @Provides
    fun getDataBase(application: Application): AppDatabase {

        return AppDatabase.getInstance(application)!!
    }


    @Provides
    fun movieDao(appDatabase: AppDatabase) : MovieDao {
        return appDatabase.movieDao!!
    }




}
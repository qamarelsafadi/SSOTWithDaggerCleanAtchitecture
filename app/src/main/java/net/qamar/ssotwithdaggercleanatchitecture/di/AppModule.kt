package net.qamar.ssotwithdaggercleanatchitecture.di

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.reactivex.Single
import net.qamar.domain.models.SearchResult
import net.qamar.domain.repositories.RemoteRepo
import net.qamar.ssotwithdaggercleanatchitecture.viewmodel.ViewModelProviderFactory

@Module
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application): Context



}
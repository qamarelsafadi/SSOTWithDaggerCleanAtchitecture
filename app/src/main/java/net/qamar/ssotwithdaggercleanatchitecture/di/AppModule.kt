package net.qamar.ssotwithdaggercleanatchitecture.di

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import io.reactivex.Single
import net.qamar.ssotwithdaggercleanatchitecture.viewmodel.ViewModelProviderFactory

@Module
abstract class AppModule {
    @Binds
    abstract fun bindContext(application: Application): Context

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory



}
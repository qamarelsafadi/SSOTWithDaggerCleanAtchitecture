package net.qamar.ssotwithdaggercleanatchitecture.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import net.qamar.ssotwithdaggercleanatchitecture.viewmodel.ViewModelProviderFactory

@Module
abstract class ViewModelFactoryModule {

    @Binds
    abstract fun getViewModelProviderFactory(modelProviderFactory :
                                             ViewModelProviderFactory
    ) : ViewModelProvider.Factory


}
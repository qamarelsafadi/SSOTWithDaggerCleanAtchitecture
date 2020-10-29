package net.qamar.ssotwithdaggercleanatchitecture.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import net.qamar.ssotwithdaggercleanatchitecture.ui.MainViewModel
import net.qamar.ssotwithdaggercleanatchitecture.viewmodel.ViewModelProviderFactory


@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel

}
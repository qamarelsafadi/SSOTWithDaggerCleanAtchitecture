package net.qamar.ssotwithdaggercleanatchitecture.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import net.qamar.ssotwithdaggercleanatchitecture.ui.MainActivity


//only activity contribution
@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(modules = [ViewModelModule::class])
    abstract fun contributeMainActivity(): MainActivity


}
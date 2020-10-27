package net.qamar.ssotwithdaggercleanatchitecture.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import net.qamar.data.di.ApiModule
import net.qamar.data.di.DataModule
import net.qamar.data.di.NetworkModule
import net.qamar.ssotwithdaggercleanatchitecture.BaseApplication
import javax.inject.Singleton

@Singleton
@Component( modules = [
    AppModule::class,
    NetworkModule::class,
    ApiModule::class,
    DataModule::class,
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class])
interface AppComponent : AndroidInjector<BaseApplication> {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun application(application: Application): Builder
    }

}
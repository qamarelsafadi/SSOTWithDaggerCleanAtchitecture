package net.qamar.data.di

import dagger.Binds
import dagger.Module
import net.qamar.data.mapper.MovieMapper
import net.qamar.data.repositories.RemoteRepoImpl
import net.qamar.domain.repositories.RemoteRepo

@Module
abstract class DataModule {

    @Binds
    abstract fun bindRemoteRepository(dataRepository: RemoteRepoImpl): RemoteRepo


}
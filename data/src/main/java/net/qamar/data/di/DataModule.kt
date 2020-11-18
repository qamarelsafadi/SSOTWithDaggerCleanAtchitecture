package net.qamar.data.di

import dagger.Binds
import dagger.Module
import net.qamar.data.repositories.SearchResultRepository
import net.qamar.domain.repositories.RemoteRepo

@Module
abstract class DataModule {

    @Binds
    abstract fun bindRemoteRepository(dataRepository: SearchResultRepository): RemoteRepo


}
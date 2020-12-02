package net.qamar.data.store

import net.qamar.data.store.repository.LocalRepoImpl
import net.qamar.data.store.repository.RemoteRepoImpl
import net.qamar.domain.repositories.RemoteRepo
import javax.inject.Inject

open class FactoryDataStore @Inject constructor(
        private val local: LocalRepoImpl,
        private val remote: RemoteRepoImpl
) {
    open fun getDataStore(isOffline: Boolean): RemoteRepo = if (isOffline) local else remote
}
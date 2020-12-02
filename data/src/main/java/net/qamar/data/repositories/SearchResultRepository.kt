package net.qamar.data.repositories

import android.app.Application
import io.reactivex.Single
import net.qamar.data.store.FactoryDataStore
import net.qamar.data.util.isNetworkConnected
import net.qamar.domain.models.SearchResult
import net.qamar.domain.repositories.RemoteRepo
import javax.inject.Inject

class SearchResultRepository @Inject constructor(
        private val factory: FactoryDataStore,
        private val application: Application
) : RemoteRepo {

    override fun getSearchResult(): Single<SearchResult> {
        return if (application.applicationContext.isNetworkConnected(application.applicationContext))
                    factory.getDataStore(false).getSearchResult()
               else factory.getDataStore(true).getSearchResult()
    }
}
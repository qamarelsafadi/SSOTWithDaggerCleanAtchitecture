package net.qamar.data.mapper

import net.qamar.data.model.Movie
import net.qamar.data.model.SearchResult
import javax.inject.Inject


class EntityMapper @Inject constructor() {

    fun mapToEntity(searchResultModelServer: SearchResult): net.qamar.domain.models.SearchResult {
        return  net.qamar.domain.models.SearchResult(
            searchResultModelServer.search ?: ArrayList<Any>(),
            searchResultModelServer.totalResults ?: 0,
            searchResultModelServer.isResponse ?: ""
        )
    }
}
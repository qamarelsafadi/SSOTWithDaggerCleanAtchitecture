package net.qamar.data.mapper

import net.qamar.data.model.SearchResultEntity
import net.qamar.domain.models.SearchResult
import javax.inject.Inject

class SearchResultMapper @Inject constructor(private val movieMapper: MovieMapper) :
    EntityMapper<SearchResultEntity, SearchResult> {

    override fun mapFromEntity(entity: SearchResultEntity): SearchResult {
        return SearchResult(
            search = entity.searches.map { movieMapper.mapFromEntity(it) } ,
            isResponse = entity.isResponse!!,
            totalResults = entity.totalResults
        )
    }

    override fun mapToEntity(domain: SearchResult): SearchResultEntity {
        return SearchResultEntity(
            "1",
            searches = domain.search!!.map { movieMapper.mapToEntity(it) },
            isResponse = domain.isResponse,
            totalResults = domain.totalResults!!
        )
    }
}
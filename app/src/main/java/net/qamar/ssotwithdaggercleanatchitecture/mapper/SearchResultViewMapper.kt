package net.qamar.ssotwithdaggercleanatchitecture.mapper

import net.qamar.domain.models.SearchResult
import net.qamar.ssotwithdaggercleanatchitecture.model.SearchResultView
import javax.inject.Inject

class SearchResultViewMapper @Inject constructor(private val movieViewMapper: MovieViewMapper) :
    Mapper<SearchResultView, SearchResult> {
    override fun mapToView(type: SearchResult): SearchResultView {
        return SearchResultView(
            searches = type.search!!.map { movieViewMapper.mapToView(it) },
            isResponse = type.isResponse,
            totalResults = type.totalResults!!
        )
    }

}
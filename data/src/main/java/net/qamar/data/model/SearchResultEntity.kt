package net.qamar.data.model

import com.squareup.moshi.Json


data class SearchResultEntity(
    @field:Json(name = "Search")
    var searches: List<MovieEntity> = listOf(),

    @field:Json(name = "totalResults")
    var totalResults: Int = 0,

    @field:Json(name = "Response")
    var isResponse: String? = null
) {


    override fun toString(): String {
        return "SearchResult(search=$searches, totalResults=$totalResults, response=$isResponse )"
    }

}
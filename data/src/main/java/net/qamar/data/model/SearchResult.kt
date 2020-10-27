package net.qamar.data.model

import com.squareup.moshi.Json


data class SearchResult(
    @field:Json(name = "Search")
    var search: ArrayList<Any>? = null,

    @field:Json(name = "totalResults")
    var totalResults: Int = 0,

    @field:Json(name = "Response")
    var isResponse: String? = null
) {


    override fun toString(): String {
        return "SearchResult(search=$search, totalResults=$totalResults, response=$isResponse )"
    }

}
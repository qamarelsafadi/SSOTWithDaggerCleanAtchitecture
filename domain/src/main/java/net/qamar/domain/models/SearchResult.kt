package net.qamar.domain.models

data class SearchResult(
    var search: ArrayList<Any>? = null,
    var totalResults : Int? = null,
    var isResponse : String
)
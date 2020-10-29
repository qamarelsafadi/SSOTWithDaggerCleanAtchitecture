package net.qamar.domain.models

data class SearchResult(
    var search: List<Movie>? = null,
    var totalResults : Int? = null,
    var isResponse : String
)
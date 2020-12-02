package net.qamar.ssotwithdaggercleanatchitecture.model

data class SearchResultView(
    var searches: List<MovieView> = listOf(),
    var totalResults: Int = 0,
    var isResponse: String? = null
) {
    override fun toString(): String {
        return "SearchResult(search=$searches, totalResults=$totalResults, response=$isResponse )"
    }
}
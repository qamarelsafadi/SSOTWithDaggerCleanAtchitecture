package net.qamar.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json


@Entity
data class SearchResultEntity(
    @PrimaryKey var ID: String="1",
    @field:Json(name = "Search") var searches: List<MovieEntity> = listOf(),
    @field:Json(name = "totalResults") var totalResults: Int = 0,
    @field:Json(name = "Response") var isResponse: String? = null
) {
    override fun toString(): String {
        return "SearchResult(search=$searches, totalResults=$totalResults, response=$isResponse )"
    }
}
package net.qamar.data.model

import androidx.room.PrimaryKey
import com.squareup.moshi.Json

class MovieEntity(
    @PrimaryKey
    var imdbID: String,

    @field:Json(name = "Title")
    var title: String? = null,

    @field:Json(name = "Year")
    var year: String? = null
)
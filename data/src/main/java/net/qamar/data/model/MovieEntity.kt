package net.qamar.data.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity
class MovieEntity(
    @PrimaryKey
    var imdbID: String,
    @field:Json(name = "Title")
    var title: String? = null,

    @field:Json(name = "Year")
    var year: String? = null
)
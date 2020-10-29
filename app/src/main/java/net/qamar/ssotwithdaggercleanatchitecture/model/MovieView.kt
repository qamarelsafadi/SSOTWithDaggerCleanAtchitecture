package net.qamar.ssotwithdaggercleanatchitecture.model

import com.squareup.moshi.Json

class MovieView(
    var imdbID: String,
    var title: String? = null,
    var year: String? = null
)
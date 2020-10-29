package net.qamar.ssotwithdaggercleanatchitecture.mapper

import net.qamar.domain.models.Movie
import net.qamar.ssotwithdaggercleanatchitecture.model.MovieView
import javax.inject.Inject

class MovieViewMapper @Inject constructor() : Mapper<MovieView, Movie> {
    override fun mapToView(type: Movie): MovieView {

        return MovieView(
            imdbID = type.imdbID!!,
            title = type.title,
            year = type.year
        )


    }


}
package net.qamar.data.mapper

import net.qamar.data.model.MovieEntity
import net.qamar.domain.models.Movie
import javax.inject.Inject

class MovieMapper @Inject constructor() : EntityMapper<MovieEntity, Movie> {
    override fun mapFromEntity(entity: MovieEntity): Movie {

        return Movie(
            imdbID = entity.imdbID,
            title = entity.title,
            year = entity.year!!
        )


    }

    override fun mapToEntity(domain: Movie): MovieEntity {

        return MovieEntity(
            domain.imdbID!!,
            domain.title,
            domain.year

        )
    }

}
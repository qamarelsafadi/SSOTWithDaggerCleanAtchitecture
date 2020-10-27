package net.qamar.domain.repositories

import io.reactivex.Single
import net.qamar.domain.models.SearchResult

interface RemoteRepo {
    fun getMovies(): Single<SearchResult>
}
package net.qamar.domain.usecases

import io.reactivex.Single
import net.qamar.domain.models.SearchResult
import net.qamar.domain.repositories.RemoteRepo
import javax.inject.Inject

class GetMoviesUseCase @Inject
constructor(private val remoteRepo: RemoteRepo):SingleUseCase<SearchResult> {
    override fun execute(): Single<SearchResult> {
        return remoteRepo.getMovies()
    }
}
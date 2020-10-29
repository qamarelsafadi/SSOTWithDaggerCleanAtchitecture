package net.qamar.data.repositories


import io.reactivex.Single
import net.qamar.data.apiservice.ApiService
import net.qamar.data.mapper.EntityMapper
import net.qamar.data.mapper.SearchResultMapper
import net.qamar.domain.models.SearchResult
import net.qamar.domain.repositories.RemoteRepo
import javax.inject.Inject

class RemoteRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val entityMapper:SearchResultMapper) : RemoteRepo {

    override fun getMovies(): Single<SearchResult> {
        return  apiService.getSharingDetails()
            .map {
                entityMapper.mapFromEntity(it)
            }
    }
}
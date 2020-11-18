package net.qamar.data.store.repository


import android.util.Log
import io.reactivex.Single
import net.qamar.data.apiservice.ApiService
import net.qamar.data.local.dao.MovieDao
import net.qamar.data.mapper.EntityMapper
import net.qamar.data.mapper.SearchResultMapper
import net.qamar.domain.models.SearchResult
import net.qamar.domain.repositories.RemoteRepo
import javax.inject.Inject

class RemoteRepoImpl @Inject constructor(
    private val apiService: ApiService,
    private val movieDao: MovieDao,
    private val entityMapper: SearchResultMapper
) : RemoteRepo {


    override fun getSearchResult(): Single<SearchResult> =
          apiService.getSharingDetails()
                  .map {
                movieDao.insert(it)
                entityMapper.mapFromEntity(it)
          }
}
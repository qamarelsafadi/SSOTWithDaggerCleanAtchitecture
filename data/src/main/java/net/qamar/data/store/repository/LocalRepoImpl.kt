package net.qamar.data.store.repository

import android.util.Log
import io.reactivex.Single
import net.qamar.data.local.dao.MovieDao
import net.qamar.data.mapper.SearchResultMapper
import net.qamar.domain.models.SearchResult
import net.qamar.domain.repositories.RemoteRepo
import javax.inject.Inject

class LocalRepoImpl @Inject constructor(
    private val movieDao: MovieDao,
    private val entityMapper: SearchResultMapper
) : RemoteRepo {
    override fun getSearchResult(): Single<SearchResult> = movieDao.all.map { entityMapper.mapFromEntity(it) }
}
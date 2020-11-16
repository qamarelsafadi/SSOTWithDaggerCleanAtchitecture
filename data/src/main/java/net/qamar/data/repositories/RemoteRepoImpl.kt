package net.qamar.data.repositories


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

    init {
        if (movieDao != null)
            Log.e("qmr", "hey database from repository")
    }

    override fun getSearchResult(): Single<SearchResult> {
        //todo make a store data factory to handle online and offline

        return  apiService.getSharingDetails()
            .map {
//                movieDao.insert(it)
//                Log.e("qmrData","${movieDao.all.blockingGet().searches.size}")
                entityMapper.mapFromEntity(it)
            }


    }


}
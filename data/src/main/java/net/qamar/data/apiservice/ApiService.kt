package net.qamar.data.apiservice


import io.reactivex.Single
import net.qamar.data.model.SearchResult
import retrofit2.http.GET


interface ApiService {

    @GET("/?s=Batman&page=1&apikey=96099fe3")
    fun getSharingDetails(): Single<SearchResult>

}
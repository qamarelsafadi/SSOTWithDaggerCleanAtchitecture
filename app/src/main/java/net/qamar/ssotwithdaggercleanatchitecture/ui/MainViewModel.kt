package net.qamar.ssotwithdaggercleanatchitecture.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers.io
import net.qamar.domain.models.SearchResult
import net.qamar.domain.usecases.GetMoviesUseCase
import javax.inject.Inject


class MainViewModel @Inject constructor(
    private val shareUseCase: GetMoviesUseCase
) : ViewModel() {
    private val movieLiveData = MutableLiveData<SearchResult>()
    private val compositeDisposable = CompositeDisposable()
    lateinit var data: LiveData<SearchResult>


    fun getMovieData(): LiveData<SearchResult> {
        shareUseCase.execute()
            .subscribeOn(io())
            .subscribe({
                it?.let {
                    movieLiveData.postValue(it)
                }
            }, {
                Log.e("qmrThro",it.message!!)

            }).let {
                compositeDisposable.add(it)
            }

        return movieLiveData

    }


    override fun onCleared() {
        compositeDisposable.clear()
    }


}
package net.qamar.ssotwithdaggercleanatchitecture.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers.io
import net.qamar.domain.usecases.GetMoviesUseCase
import net.qamar.ssotwithdaggercleanatchitecture.mapper.SearchResultViewMapper
import net.qamar.ssotwithdaggercleanatchitecture.model.SearchResultView
import javax.inject.Inject


class MainViewModel @Inject constructor(
    private val shareUseCase: GetMoviesUseCase,
    private val mapper: SearchResultViewMapper
) : ViewModel() {
    private val _movieLiveData = MutableLiveData<SearchResultView>()
    private val compositeDisposable = CompositeDisposable()


    fun getMovieData(): LiveData<SearchResultView> {
        shareUseCase.execute()
            .subscribeOn(io())
            .subscribe({
                it?.let { _movieLiveData.postValue(mapper.mapToView(it)) }
            },{
                Log.e("qmrThro", it.message!!)
            }).let {
                compositeDisposable.add(it)
            }


        return _movieLiveData
    }


    override fun onCleared() {
        compositeDisposable.clear()
    }


}
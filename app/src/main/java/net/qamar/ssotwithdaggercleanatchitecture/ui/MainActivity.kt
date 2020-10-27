package net.qamar.ssotwithdaggercleanatchitecture.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import dagger.android.support.DaggerAppCompatActivity
import net.qamar.data.model.Movie
import net.qamar.ssotwithdaggercleanatchitecture.R
import net.qamar.ssotwithdaggercleanatchitecture.viewmodel.ViewModelProviderFactory
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProviderFactory

    private lateinit var viewmodel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel = ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)


        subscribeObserver()


    }

    private fun subscribeObserver() {
        viewmodel.getMovieData().observe(this, Observer {
            val array = it.search as ArrayList<Movie>
            Log.e("qmr", "$array")
        })


    }

}
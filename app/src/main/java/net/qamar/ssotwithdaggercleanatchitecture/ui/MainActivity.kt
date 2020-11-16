package net.qamar.ssotwithdaggercleanatchitecture.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import net.qamar.ssotwithdaggercleanatchitecture.R
import net.qamar.ssotwithdaggercleanatchitecture.viewmodel.ViewModelProviderFactory
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelProviderFactory

    private lateinit var adapter: MovieAdapter
    private val viewModel by viewModels<MainViewModel> {viewModelFactory }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        initUI()
        subscribeObserver()


    }

    private  fun subscribeObserver() {
        viewModel.getMovieData().observe(this, Observer {
            val array = it.searches
            adapter.items = array
        })


    }

    private fun initUI() {

        adapter = MovieAdapter()
        movieList.layoutManager = LinearLayoutManager(this)
        movieList.adapter = adapter

    }


}
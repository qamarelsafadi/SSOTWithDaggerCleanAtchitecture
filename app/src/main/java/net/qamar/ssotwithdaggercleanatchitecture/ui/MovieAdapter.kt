package net.qamar.ssotwithdaggercleanatchitecture.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout_movies_list_item.view.*
import net.qamar.ssotwithdaggercleanatchitecture.model.MovieView
import net.qamar.ssotwithdaggercleanatchitecture.R

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    var items:List<MovieView> = listOf()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.layout_movies_list_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { holder.bind(items[position]) }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item: MovieView) { itemView.title.text = item.title }
    }
}
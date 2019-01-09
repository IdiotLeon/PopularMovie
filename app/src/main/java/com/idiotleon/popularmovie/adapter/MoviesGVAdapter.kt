package com.idiotleon.popularmovie.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.idiotleon.popularmovie.R
import com.idiotleon.popularmovie.model.Movie
import com.squareup.picasso.Picasso

class MoviesGVAdapter(mContext: Context, private val movies: MutableList<Movie>) : BaseAdapter() {

    private val mInflater: LayoutInflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view: View
        val viewHolder: ViewHolder

        if (convertView == null) {
            view = this.mInflater.inflate(R.layout.gv_item_movie, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        Picasso.get().load(getItem(position).posterURI).into(viewHolder.ivPoster)

        return view
    }

    override fun getItem(position: Int): Movie {
        return movies[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return movies.size
    }

    private class ViewHolder(row: View?) {
        val ivPoster = row?.findViewById(R.id.iv_item_movies) as ImageView
    }
}
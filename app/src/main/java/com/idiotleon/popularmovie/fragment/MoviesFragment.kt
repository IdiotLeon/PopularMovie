package com.idiotleon.popularmovie.fragment

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.GridView
import com.idiotleon.popularmovie.R
import com.idiotleon.popularmovie.adapter.MoviesGVAdapter
import com.idiotleon.popularmovie.model.Movie

class MoviesFragment : Fragment() {

    private lateinit var gridView: GridView

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fr_movies, container, false)

        gridView = view.findViewById(R.id.gv_movies)

        return view
    }

    companion object {

        fun newInstance(movies: MutableList<Movie>): MoviesFragment {

            val fragment = MoviesFragment()

            // To create the GridView adapter
            val moviesGVAdapter = MoviesGVAdapter(fragment.context!!, movies)

            // To setAdapter
            fragment.gridView.adapter = moviesGVAdapter

            return fragment
        }
    }
}
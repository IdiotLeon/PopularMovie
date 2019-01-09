package com.idiotleon.popularmovie.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.idiotleon.popularmovie.fragment.MoviesFragment
import com.idiotleon.popularmovie.model.Movie

class ViewPagerAdapter(fragmentManager: FragmentManager, private val movies: MutableList<Movie>) :
    FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(p0: Int): Fragment {
        return MoviesFragment.newInstance(movies)
    }

    override fun getCount(): Int {
        return movies.size
    }
}
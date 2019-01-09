package com.idiotleon.popularmovie

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import com.idiotleon.popularmovie.adapter.ViewPagerAdapter
import com.idiotleon.popularmovie.model.Movie

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var viewPagerAdapter: ViewPagerAdapter

    private val movies = mutableListOf<Movie>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Todo: To get movies from the API

        viewPager = findViewById(R.id.vp)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager, movies)
        viewPager.adapter = viewPagerAdapter

    }
}

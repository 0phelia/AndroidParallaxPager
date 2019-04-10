package com.example.arty.androidparallaxpager

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.vp_characters)

        val characters = ChampionFactory.getCharacters()
        val pagerAdapter = PageAdapter(characters)
        val pageTransformer = PageTransformer(viewPager, pagerAdapter)

        viewPager.adapter = pagerAdapter
        viewPager.setPageTransformer(false, pageTransformer)
        viewPager.offscreenPageLimit = 3
    }


}

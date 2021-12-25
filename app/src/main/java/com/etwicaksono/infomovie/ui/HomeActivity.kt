package com.etwicaksono.infomovie.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.etwicaksono.infomovie.R
import com.etwicaksono.infomovie.databinding.ActivityHomeBinding
import com.etwicaksono.infomovie.ui.list.ListPagerAdapter
import com.google.android.material.tabs.TabLayoutMediator

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPagerAdapter=ListPagerAdapter(this,supportFragmentManager)
        binding.apply {
            viewPager.adapter=listPagerAdapter
            tabs.setupWithViewPager(binding.viewPager)
        }
    }
}
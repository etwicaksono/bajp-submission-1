package com.etwicaksono.infomovie.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.etwicaksono.infomovie.databinding.ActivityHomeBinding
import com.etwicaksono.infomovie.ui.list.ListPagerAdapter

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listPagerAdapter = ListPagerAdapter(this, supportFragmentManager)
        binding.apply {
            viewPager.adapter = listPagerAdapter
            tabs.setupWithViewPager(binding.viewPager)
        }
    }
}
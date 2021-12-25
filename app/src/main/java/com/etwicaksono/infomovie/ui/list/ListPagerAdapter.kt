package com.etwicaksono.infomovie.ui.list

import android.content.Context
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.etwicaksono.infomovie.R

class ListPagerAdapter(fm: Fragment, private val type: String) : FragmentStateAdapter(fm) {

    private val tab = listOf(fm.getString(R.string.movies), fm.getString(R.string.tv_shows))

    override fun getItemCount(): Int = tab.size

    override fun createFragment(position: Int): Fragment {
        return ListFragment.newInstance(tab[position])
    }

}
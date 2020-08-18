package com.example.tabviewpagerassignment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class TabAdapter(fragmentManager:FragmentManager,lifecycle:Lifecycle)
    : FragmentStateAdapter(fragmentManager,lifecycle) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> Fragment1()
            1 -> Fragment2()
            else -> Fragment3()
        }
    }
}
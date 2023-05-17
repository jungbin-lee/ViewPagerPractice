package com.h2square.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.h2square.viewpagerpractice.fragments.GreetingsFragment
import com.h2square.viewpagerpractice.fragments.MyinfoFragment
import com.h2square.viewpagerpractice.fragments.NameFragment

class NameViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){


    override fun getItem(position: Int): Fragment {
    if (position==0){
        return NameFragment()
    }
    else if(position==1){
        return MyinfoFragment()
    }
    else{
            return GreetingsFragment()
        }
    }
    override fun getCount(): Int {
        return 3
    }
}
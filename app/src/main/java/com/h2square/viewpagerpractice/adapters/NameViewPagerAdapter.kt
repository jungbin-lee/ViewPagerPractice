package com.h2square.viewpagerpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.h2square.viewpagerpractice.fragments.GreetingsFragment
import com.h2square.viewpagerpractice.fragments.MyinfoFragment
import com.h2square.viewpagerpractice.fragments.NameFragment

class NameViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){


    override fun getPageTitle(position: Int): CharSequence? {
//        if (position==0){
//            return "이름"
//        }else if (position==1){
//            return "내정보"
//        }else{
//            return "인사"
//        }
      return  when(position){
//            0-> return "이름"
//            1-> return ""
//            else ->return ""
            0-> "이름"
             1-> "내정보"
            else-> "인사말"
        }
    }

    override fun getItem(position: Int): Fragment {
//    if (position==0){
//        return NameFragment()
//    }
//    else if(position==1){
//        return MyinfoFragment()
//    }
//    else{
//            return GreetingsFragment()
//        }
        return when(position){
            0->NameFragment()
            1 ->MyinfoFragment()
            else ->GreetingsFragment()
        }
    }
    override fun getCount(): Int {
        return 3
    }



}
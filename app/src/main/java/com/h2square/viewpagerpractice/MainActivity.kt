package com.h2square.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.h2square.viewpagerpractice.adapters.NameViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var mViewPagerAdapter: NameViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mViewPagerAdapter= NameViewPagerAdapter(supportFragmentManager)
        mainViewpager.adapter= mViewPagerAdapter
        //a페이지 많아지면 부드럽게 지원
        mainViewpager.offscreenPageLimit=5

    }
}
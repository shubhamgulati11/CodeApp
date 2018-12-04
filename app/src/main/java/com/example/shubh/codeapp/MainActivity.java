package com.example.shubh.codeapp;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager vp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        vp.setAdapter(new GoThroughAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(vp);
    }
    private class GoThroughAdapter extends FragmentPagerAdapter {
        public GoThroughAdapter(FragmentManager supportFragmentManager) {
            super(supportFragmentManager);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i) {
                case 0:
                    return new FragmentA();
                case 1:
                    return new FragmentB();
                case 2:
                    return new FragmentC();
            }
            return null;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }
}


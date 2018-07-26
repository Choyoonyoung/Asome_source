package com.example.asome.asome_sourcerequire;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

class CustomAdapter extends FragmentStatePagerAdapter{
    public CustomAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 1:
                return new TwoFragment();
            case 2:
                return new ThreeFragment();
            default:
                return new OneFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}

package com.example.myapplication.adapter;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

public class PagerFragmentAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    public PagerFragmentAdapter(FragmentManager fm,List<Fragment> list) {
        super(fm);
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "呵呵";
            case 1:
                return "笑了";
            case 2:
                return "难受";
            case 3:
                return "辣鸡";
        }
        return super.getPageTitle(position);
    }
}

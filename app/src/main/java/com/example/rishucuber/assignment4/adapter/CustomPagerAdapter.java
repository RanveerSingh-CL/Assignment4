package com.example.rishucuber.assignment4.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.rishucuber.assignment4.AppConstants;
import com.example.rishucuber.assignment4.fragment.DiscoverFragment;
import com.example.rishucuber.assignment4.fragment.MapFragment;
import com.example.rishucuber.assignment4.fragment.MyNetworkFragment;
import com.example.rishucuber.assignment4.fragment.MyPostsFragment;
import com.example.rishucuber.assignment4.fragment.RequestsFragment;


public class CustomPagerAdapter extends FragmentPagerAdapter {

    protected Context mContext;

    public CustomPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        AppConstants constants = new AppConstants();

        switch (position) {

            case 0:

                return DiscoverFragment.getInstance(constants.getModeAdapterDiscover());

            case 1:
                return MapFragment.getInstance(constants.getModeAdapterMap());

            case 2:
                return MyPostsFragment.getInstance(constants.getModeAdapterMyPosts());

            case 3:
                return RequestsFragment.getInstance(constants.getModeAdapterRequests());
            case 4:
                return MyNetworkFragment.getInstance(constants.getModeAdapterMyNetwork());

            default:
                return null;


        }



    }


    @Override
    public int getCount() {
        return 5;
    }
}


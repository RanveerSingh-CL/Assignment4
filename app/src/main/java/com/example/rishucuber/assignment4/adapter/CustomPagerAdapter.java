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

/**
 * adapter
 */
public class CustomPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    /**
     *
     * @param fm fragment manager object
     * @param context context
     */
    public CustomPagerAdapter(final FragmentManager fm, final Context context) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(final int position) {
        switch (position) {
            case 0:
                return DiscoverFragment.getInstance(AppConstants.MODE_ADAPTER_DISCOVER);
            case 1:
                return MapFragment.getInstance(AppConstants.MODE_ADAPTER_MAP);
            case 2:
                return MyPostsFragment.getInstance(AppConstants.MODE_ADAPTER_MY_POSTS);
            case 3:
                return RequestsFragment.getInstance(AppConstants.MODE_ADAPTER_REQUESTS);
            case 4:
                return MyNetworkFragment.getInstance(AppConstants.MODE_ADAPTER_MY_NETWORK);

            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
}


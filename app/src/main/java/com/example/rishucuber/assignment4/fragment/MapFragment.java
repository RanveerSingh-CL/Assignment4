package com.example.rishucuber.assignment4.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishucuber.assignment4.R;

/**
 * map fragment
 */
public class MapFragment extends Fragment {
    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container, final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_map, null);
        return v;
    }
    /**
     * @param mode fragmentmode
     * @return discoverFragment
     */
    public static MapFragment getInstance(final int mode) {
        Bundle bundle = new Bundle();
        MapFragment mapFragment = new MapFragment();
        bundle.putInt("mode", mode);
        Log.d("MapFragment", "getInstance: " + mode);
        mapFragment.setArguments(bundle);
        return mapFragment;
    }
}
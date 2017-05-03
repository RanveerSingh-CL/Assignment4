package com.example.rishucuber.assignment4.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishucuber.assignment4.R;
import com.example.rishucuber.assignment4.activity.MainActivity;
import com.example.rishucuber.assignment4.adapter.DiscoverRecyclerAdapter;

/**
 * discover faragment
 */

public class DiscoverFragment extends Fragment implements MainActivity.OnRecyclerLayoutChange {
    private RecyclerView recyclerView;
    private DiscoverRecyclerAdapter adapter;
    private Boolean isGridOn = true;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_discover, null);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_discover);
        adapter = new DiscoverRecyclerAdapter(getContext(), true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        recyclerView.requestFocus();
        return v;
    }

    /**
     * @param mode fragmentmode
     * @return discoverFragment
     */
    public static DiscoverFragment getInstance(final int mode) {
        Bundle bundle = new Bundle();
        DiscoverFragment discoverFragment = new DiscoverFragment();
        bundle.putInt("mode", mode);
        Log.d("DiscoverFragment", "getInstance: " + mode);
        discoverFragment.setArguments(bundle);
        return discoverFragment;

    }

    @Override
    public void onRecyclerLayoutChange() {
        adapter = new DiscoverRecyclerAdapter(getContext(), falsetrue());
        if (!isGridOn) {
            recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        } else {
            recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        }
        recyclerView.setAdapter(adapter);
        recyclerView.requestFocus();
    }

    /**
     * @return gridview
     */
    public Boolean falsetrue() {
        isGridOn = !isGridOn;
        return isGridOn;
    }
}

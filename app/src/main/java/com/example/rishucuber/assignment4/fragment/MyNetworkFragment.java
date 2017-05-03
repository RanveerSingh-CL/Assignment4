package com.example.rishucuber.assignment4.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.rishucuber.assignment4.R;
import com.example.rishucuber.assignment4.adapter.MyNetworkRecyclerAdapter;

public class MyNetworkFragment extends Fragment {
    private RecyclerView recyclerView;
    private MyNetworkRecyclerAdapter adapter;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_network, null);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_my_network);
        init();

        return v;
    }

    public static MyNetworkFragment getInstance(final int mode) {
        Bundle bundle = new Bundle();
        MyNetworkFragment myNetworkFragment = new MyNetworkFragment();
        bundle.putInt("mode", mode);
        Log.d("MyNetworkFragment", "getInstance: " + mode);
        myNetworkFragment.setArguments(bundle);
        return myNetworkFragment;

    }

    public void init() {

        adapter = new MyNetworkRecyclerAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);


    }

}

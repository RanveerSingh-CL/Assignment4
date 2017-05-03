package com.example.rishucuber.assignment4.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishucuber.assignment4.R;
import com.example.rishucuber.assignment4.adapter.RequestsRecyclerAdapter;

/**
 * RequestsFragment
 */
public class RequestsFragment extends Fragment {
    private RecyclerView recyclerView;
    private RequestsRecyclerAdapter adapter;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_requests, null);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_request);
        adapter = new RequestsRecyclerAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return v;
    }

    /**
     * @param mode fragment mode
     * @return fragment
     */
    public static RequestsFragment getInstance(final int mode) {
        Bundle bundle = new Bundle();
        RequestsFragment requestsFragment = new RequestsFragment();
        bundle.putInt("mode", mode);
        Log.d("RequestsFragment", "getInstance: " + mode);
        requestsFragment.setArguments(bundle);
        return requestsFragment;

    }

}

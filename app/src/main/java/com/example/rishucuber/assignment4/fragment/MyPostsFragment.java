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
import com.example.rishucuber.assignment4.adapter.MyPostsRecyclerAdapter;

/**
 * MyPostsFragment
 */
public class MyPostsFragment extends Fragment {
    private RecyclerView recyclerView;
    private MyPostsRecyclerAdapter adapter;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             final Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_my_posts, container, false);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view_posts);
        adapter = new MyPostsRecyclerAdapter(getContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);
        return v;
    }

    /**
     * @param mode fragment mode
     * @return fragment
     */
    public static MyPostsFragment getInstance(final int mode) {
        Bundle bundle = new Bundle();
        MyPostsFragment myPostsFragment = new MyPostsFragment();
        bundle.putInt("mode", mode);
        Log.d("MyPostsFragment", "getInstance: " + mode);
        myPostsFragment.setArguments(bundle);
        return myPostsFragment;
    }

}

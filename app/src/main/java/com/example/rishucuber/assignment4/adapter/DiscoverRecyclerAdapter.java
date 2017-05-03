package com.example.rishucuber.assignment4.adapter;

/**
 * Created by rishucuber on 30/4/17.
 */

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.rishucuber.assignment4.R;

public class DiscoverRecyclerAdapter extends RecyclerView.Adapter<DiscoverRecyclerAdapter.MyViewHolder> {


    Context context;
    Boolean isGridOn;


    public DiscoverRecyclerAdapter(Context context, boolean isGridOn) {
        this.context = context;
        this.isGridOn = isGridOn;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (isGridOn) {
            View view = LayoutInflater.from(context).inflate(R.layout.item_discover, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        } else {
            View view = LayoutInflater.from(context).inflate(R.layout.item_dicover_grid, parent, false);
            MyViewHolder holder = new MyViewHolder(view);
            return holder;
        }


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {


    }


    @Override
    public int getItemCount() {
        return 15;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        public MyViewHolder(final View itemView) {
            super(itemView);

        }
    }

    public void layout() {


    }

}


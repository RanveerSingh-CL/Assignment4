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

/**
 * recycler adapter
 */
public class MyNetworkRecyclerAdapter extends RecyclerView.Adapter<MyNetworkRecyclerAdapter.MyViewHolder> {
    private Context context;
    private final int itemCount = 15;

    /**
     * @param context contxt
     */
    public MyNetworkRecyclerAdapter(final Context context) {
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_my_network, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
    }

    @Override
    public int getItemCount() {
        return itemCount;
    }

    /**
     *
     */
    class MyViewHolder extends RecyclerView.ViewHolder {
        /**
         * @param itemView itemview
         */
        public MyViewHolder(final View itemView) {
            super(itemView);
        }
    }

}


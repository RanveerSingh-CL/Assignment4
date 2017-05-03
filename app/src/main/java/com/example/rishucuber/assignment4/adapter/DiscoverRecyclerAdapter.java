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
 * DiscoverRecyclerAdapter
 */
public class DiscoverRecyclerAdapter extends RecyclerView.Adapter<DiscoverRecyclerAdapter.MyViewHolder> {

    private Context context;
    private Boolean isGridOn;
    private final int itemCount = 15;
    /**
     *
     * @param context context
     * @param isGridOn boolean for grid mode
     */
    public DiscoverRecyclerAdapter(final Context context, final boolean isGridOn) {
        this.context = context;
        this.isGridOn = isGridOn;
    }
    @Override
    public MyViewHolder onCreateViewHolder(final ViewGroup parent, final int viewType) {
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
         * @param itemView number of cards
         */
        public MyViewHolder(final View itemView) {
            super(itemView);
        }
    }
}


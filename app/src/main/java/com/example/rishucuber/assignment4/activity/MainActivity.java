package com.example.rishucuber.assignment4.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rishucuber.assignment4.R;
import com.example.rishucuber.assignment4.adapter.CustomPagerAdapter;
import com.example.rishucuber.assignment4.fragment.DiscoverFragment;


/**
 * main activity
 */
public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    private TextView tvTabDiscover, tvTabMap, tvTabMyPosts, tvTabRequests, tvTabMyNetwork, tvAppBarTitle;
    private ImageView ivSort, ivGrid, ivFilter, ivHam;
    private DrawerLayout dlNavView;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(5);
        CustomPagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adapter);
        tvTabDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(0);

            }
        });
        tvTabMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(1);

            }
        });
        tvTabMyPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(2);

            }
        });
        tvTabRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(3);

            }
        });
        tvTabMyNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                viewPager.setCurrentItem(4);

            }
        });
        viewPager.setOnPageChangeListener(this);
        ivGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {


                if (viewPager.getCurrentItem() == 0) {
                    DiscoverFragment discoverFragment = (DiscoverFragment) getSupportFragmentManager().findFragmentByTag("android:switcher:"
                            + R.id.viewpager + ":" + viewPager.getCurrentItem());
                    discoverFragment.onRecyclerLayoutChange();

                }
            }
        });
        ivHam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                dlNavView.openDrawer(Gravity.LEFT);


            }
        });


    }

    /**
     * initialization
     */
    public void init() {
        tvTabDiscover = (TextView) findViewById(R.id.tv_tab_discover);
        tvTabMap = (TextView) findViewById(R.id.tv_tab_map);
        tvTabMyPosts = (TextView) findViewById(R.id.tv_tab_myposts);
        tvTabRequests = (TextView) findViewById(R.id.tv_tab_requests);
        tvTabMyNetwork = (TextView) findViewById(R.id.tv_tab_mynetwotk);
        ivGrid = (ImageView) findViewById(R.id.iv_appbar_grid);
        ivSort = (ImageView) findViewById(R.id.iv_appbar_sort);
        tvAppBarTitle = (TextView) findViewById(R.id.tv_appbar_title);
        tvAppBarTitle.setText(R.string.title_tab_discover);
        ivFilter = (ImageView) findViewById(R.id.iv_appbar_filter);
        ivFilter.setVisibility(View.GONE);
        ivHam = (ImageView) findViewById(R.id.iv_ham);
        dlNavView = (DrawerLayout) findViewById(R.id.drawer_layout);


    }

    @Override
    public void onPageScrolled(final int position, final float positionOffset, final int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(final int position) {
        if (position == 0) {
            ivGrid.setVisibility(View.VISIBLE);
            ivSort.setVisibility(View.VISIBLE);
            ivFilter.setVisibility(View.GONE);
            tvAppBarTitle.setText(R.string.title_tab_discover);

        }
        if (position == 1) {
            ivGrid.setVisibility(View.GONE);
            ivSort.setVisibility(View.GONE);
            tvAppBarTitle.setText(R.string.title_tab_map);
            ivFilter.setVisibility(View.GONE);

        }
        if (position == 2) {
            ivGrid.setVisibility(View.GONE);
            ivSort.setVisibility(View.GONE);
            tvAppBarTitle.setText(R.string.title_tab_posts);
            ivFilter.setVisibility(View.VISIBLE);


        }
        if (position == 3) {
            ivGrid.setVisibility(View.GONE);
            ivSort.setVisibility(View.GONE);
            tvAppBarTitle.setText(R.string.title_tab_requests);
            ivFilter.setVisibility(View.GONE);

        }
        if (position == 4) {
            ivGrid.setVisibility(View.GONE);
            ivSort.setVisibility(View.GONE);
            tvAppBarTitle.setText(R.string.title_tab_network);
            ivFilter.setVisibility(View.GONE);

        }
    }

    @Override
    public void onPageScrollStateChanged(final int state) {

    }

    /**
     * Interface
     */
    public interface OnRecyclerLayoutChange {
        /**
         *
         */
        void onRecyclerLayoutChange();
    }


}







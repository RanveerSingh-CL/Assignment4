package com.example.rishucuber.assignment4.activity;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
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

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {
    TextView mTabDiscover, mTabMap, mTabMyPosts, mTabRequests, mTabMyNetwork;
    TextView mAppBarTitle;
    private ImageView mSort, mGrid, mFilter, mHam;
    DrawerLayout mNavView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setOffscreenPageLimit(5);
        CustomPagerAdapter adapter = new CustomPagerAdapter(getSupportFragmentManager(), MainActivity.this);
        viewPager.setAdapter(adapter);
        mTabDiscover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);

            }
        });
        mTabMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);

            }
        });
        mTabMyPosts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);

            }
        });
        mTabRequests.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(3);

            }
        });
        mTabMyNetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(4);

            }
        });
        viewPager.setOnPageChangeListener(this);
        mGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (viewPager.getCurrentItem() == 0) {
                    DiscoverFragment discoverFragment = (DiscoverFragment) getSupportFragmentManager().findFragmentByTag("android:switcher:"
                            + R.id.viewpager + ":" + viewPager.getCurrentItem());
                    discoverFragment.onRecyclerLayoutChange();

                }
            }
        });
        mHam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mNavView.openDrawer(Gravity.LEFT);



            }
        });


    }


    public void init() {
        mTabDiscover = (TextView) findViewById(R.id.tab_discover);
        mTabMap = (TextView) findViewById(R.id.tab_map);
        mTabMyPosts = (TextView) findViewById(R.id.tab_myposts);
        mTabRequests = (TextView) findViewById(R.id.tab_requests);
        mTabMyNetwork = (TextView) findViewById(R.id.tab_mynetwotk);
        mGrid = (ImageView) findViewById(R.id.appbar_grid);
        mSort = (ImageView) findViewById(R.id.appbar_sort);
        mAppBarTitle = (TextView) findViewById(R.id.appbar_title);
        mAppBarTitle.setText(R.string.title_tab1);
        mFilter = (ImageView) findViewById(R.id.appbar_filter);
        mFilter.setVisibility(View.GONE);
        mHam = (ImageView) findViewById(R.id.ham);
        mNavView = (DrawerLayout) findViewById(R.id.drawer_layout);


    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        if (position == 0) {
            mGrid.setVisibility(View.VISIBLE);
            mSort.setVisibility(View.VISIBLE);

        }
        if (position == 1) {
            mGrid.setVisibility(View.GONE);
            mSort.setVisibility(View.GONE);
            mAppBarTitle.setText(R.string.title_tab2);
            mFilter.setVisibility(View.GONE);

        }
        if (position == 2) {
            mGrid.setVisibility(View.GONE);
            mSort.setVisibility(View.GONE);
            mAppBarTitle.setText(R.string.title_tab3);
            mFilter.setVisibility(View.VISIBLE);


        }
        if (position == 3) {
            mGrid.setVisibility(View.GONE);
            mSort.setVisibility(View.GONE);
            mAppBarTitle.setText(R.string.title_tab4);
            mFilter.setVisibility(View.GONE);

        }
        if (position == 4) {
            mGrid.setVisibility(View.GONE);
            mSort.setVisibility(View.GONE);
            mAppBarTitle.setText(R.string.title_tab5);
            mFilter.setVisibility(View.GONE);

        }
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    public interface OnRecyclerLayoutChange {
        public void onRecyclerLayoutChange();
    }


}







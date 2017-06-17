package com.example.sanyi.tour_guide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Sanyi on 15/06/2017.
 */

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;


    public CategoryAdapter(Context context, FragmentManager fm){
        super(fm);
        mContext=context;
    }

    @Override
    public Fragment getItem(int position) {
        if(position==0){
            return new RestaurantFragment();
        }
         else{
            return new HotelFragment();
        }
    }

    // Total number of pages
    @Override
    public int getCount() {
        return 2;
    }

    public CharSequence getPageTitle(int position){
        switch (position){
            case 0:
                return mContext.getString(R.string.Restaurant);
            default:
                return mContext.getString(R.string.Hotel);
        }
    }
}

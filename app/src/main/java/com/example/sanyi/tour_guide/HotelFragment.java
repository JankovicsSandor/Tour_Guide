package com.example.sanyi.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelFragment extends Fragment {

    final ArrayList<Sight>sights=new ArrayList<Sight>();
    final ArrayList<Sight>properSight=new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.sight_list,container,false);


        sights.add(new Sight(getString(R.string.Budapest),"Pacek Hotel",R.drawable.hotel1,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"Pace Hotel","Jó hely","Ez e nagyon jó hely",1000,500));
        sights.add(new Sight(getString(R.string.Budapest),"Pac Hotel",R.drawable.hotel2,"Jó hely","Ez egy nagyon jó hely",100,5000));
        sights.add(new Sight(getString(R.string.Budapest),"Pac Hotel",R.drawable.hotel3,"Jó he","Ez egy nagyon jó hely",1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"Pac Hotel",R.drawable.hotel4,"Jó he","Ez egy nagyon jó hely",1000,5000));


        for (Sight sight:sights) {
            if(sight.getCity()==Constants.CITY){
                properSight.add(sight);
            }
        }
        SightAdapter sightAdapter=new SightAdapter(getActivity(),properSight);

        ListView listView=(ListView) rootView.findViewById(R.id.listMap);

        listView.setAdapter(sightAdapter);

        return rootView;

    }

}

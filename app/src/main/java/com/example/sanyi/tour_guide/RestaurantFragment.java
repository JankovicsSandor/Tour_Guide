package com.example.sanyi.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {

    final ArrayList<Sight> sights=new ArrayList<Sight>();
    final ArrayList<Sight>properSight=new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        sights.add(new Sight(getString(R.string.Budapest),"Pacek Étterem",R.drawable.rest1,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"P Étterem",R.drawable.rest2,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"P Étterem",R.drawable.rest3,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"PaÉtterem",R.drawable.rest4,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"Étterem",R.drawable.rest5,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"PaÉtterem",R.drawable.rest6,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"Pace Étterem","Jó hely","Ez e nagyon jó hely",1000,500));
        sights.add(new Sight(getString(R.string.Budapest),"Pac Étterem",R.drawable.rest7,"Jó hely","Ez egy nagyon jó hely",100,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"PaÉtterem",R.drawable.rest5,"Jóhs hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"Pac Étterem",R.drawable.rest3,"Jó he","Ez egy nagyon jó hely",1000,5000));

        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.sight_list,container,false);
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

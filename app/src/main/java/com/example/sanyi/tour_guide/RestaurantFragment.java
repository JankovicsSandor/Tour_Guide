package com.example.sanyi.tour_guide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class RestaurantFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.sight_list,container,false);

        final ArrayList<Sight> sights=new ArrayList<Sight>();
        sights.add(new Sight(getString(R.string.Budapest),"Pacek Étterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"P Étterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"P Étterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"PaÉtterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"Étterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"PaÉtterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"Pace Étterem","Jó hely","Ez e nagyon jó hely",1000,500));
        sights.add(new Sight(getString(R.string.Budapest),"Pac Étterem",R.mipmap.ic_launcher,"Jó hely","Ez egy nagyon jó hely",100,5000));
        sights.add(new Sight(getString(R.string.Debrecen),"PaÉtterem",R.mipmap.ic_launcher,"Jóhs hely","Ez egy nagyon jó hely",10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),"Pac Étterem",R.mipmap.ic_launcher,"Jó he","Ez egy nagyon jó hely",1000,5000));
        SightAdapter sightAdapter=new SightAdapter(getActivity(),sights);

        ListView listView=(ListView) rootView.findViewById(R.id.listMap);

        listView.setAdapter(sightAdapter);

        return rootView;
    }
}

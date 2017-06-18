package com.example.sanyi.tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class FlightFragment extends Fragment {
    final ArrayList<Sight> sights=new ArrayList<Sight>();
    final ArrayList<Sight>properSight=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Flight1Name),R.drawable.vluchten_volgen,10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Flight2Name),1000,500));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Flight3Name),R.drawable.vluchten_volgen,100,5000));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Flight4Name),R.drawable.vluchten_volgen,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Flight5Name),R.drawable.vluchten_volgen,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Flight6Name),R.drawable.vluchten_volgen,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Flight7Name),R.drawable.vluchten_volgen,1000,5000));
        for (Sight sight:sights) {
            if(sight.getCity().equals(Constants.CITY)){
                properSight.add(sight);
            }
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.sight_list,container,false);



        SightAdapter sightAdapter=new SightAdapter(getActivity(),properSight);

        ListView listView=(ListView) rootView.findViewById(R.id.listMap);

        listView.setAdapter(sightAdapter);

        return rootView;

    }
}

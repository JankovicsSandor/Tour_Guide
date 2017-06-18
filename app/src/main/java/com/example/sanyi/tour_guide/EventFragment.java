package com.example.sanyi.tour_guide;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class EventFragment extends Fragment {
    final ArrayList<Sight> sights=new ArrayList<Sight>();
    final ArrayList<Sight>properSight=new ArrayList<>();

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Event1Name),R.drawable.eventicon,10000,5000));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Event2Name),1000,500));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Event3Name),R.drawable.eventicon,100,5000));
        sights.add(new Sight(getString(R.string.Budapest),getString(R.string.Event4Name),R.drawable.eventicon,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Event5Name),R.drawable.eventicon,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Event6Name),R.drawable.eventicon,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Event7Name),R.drawable.eventicon,1000,5000));
        sights.add(new Sight(getString(R.string.Debrecen),getString(R.string.Event8Name),R.drawable.eventicon,1000,5000));

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

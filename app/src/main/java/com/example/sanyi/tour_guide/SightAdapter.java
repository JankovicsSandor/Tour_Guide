package com.example.sanyi.tour_guide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sanyi on 16/06/2017.
 */

public class SightAdapter extends ArrayAdapter<Sight> {

    public SightAdapter(Activity context, ArrayList<Sight> sightlist) {
        super(context,0,sightlist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView=convertView;

        if(listItemView ==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_element,parent,false);
        }
        Sight currentSight=getItem(position);
        Log.e("Current city: ",currentSight.getCity());
        Log.e("Current cityproperty: ",Constants.CITY);
        if(currentSight.getCity().equals(Constants.CITY)){
            ImageView image=(ImageView) listItemView.findViewById(R.id.imagePlace);
            image.setImageResource(currentSight.getPicture());

            TextView title =(TextView) listItemView.findViewById(R.id.titleView);
            title.setText(currentSight.getName());

            TextView shortDesc =(TextView) listItemView.findViewById(R.id.shortDesc);
            shortDesc.setText(currentSight.getCity());

            TextView price = (TextView) listItemView.findViewById(R.id.priceTag);
            price.setText(currentSight.getPriceFrom()+" - "+currentSight.getPriceTo()+" "+getContext().getString(R.string.currency));
        }

        return listItemView;
    }
}

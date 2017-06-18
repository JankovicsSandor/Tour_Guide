package com.example.sanyi.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Value of Restaurant: ", String.valueOf(R.string.Restaurant));
        Log.e("Value of Hotel: ", String.valueOf(R.string.Hotel));
        Button budapest= (Button) findViewById(R.id.budapestId);
        budapest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,CityActivity.class);
                Constants.CITY=getString(R.string.Budapest);
                startActivity(intent);
            }
        });
        Button debrecen =(Button) findViewById(R.id.debrecenId);
        debrecen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CityActivity.class);
                Constants.CITY=getString(R.string.Debrecen);
                startActivity(intent);
            }
        });
    }
}

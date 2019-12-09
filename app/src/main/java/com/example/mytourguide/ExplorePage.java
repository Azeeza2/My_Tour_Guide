package com.example.mytourguide;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ExplorePage extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tourist_centres);

        LinearLayout parks = (LinearLayout) findViewById(R.id.parks);
        // Set a click listener on that View
        parks.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(ExplorePage.this, parks_zoo.class);
                startActivity(parksIntent);
            }
        });
        LinearLayout malls = (LinearLayout) findViewById(R.id.malls);

        // Set a click listener on that View
        malls.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent mallsIntent = new Intent(ExplorePage.this, malls.class);
                startActivity(mallsIntent);
            }
        });

        LinearLayout restaurants = (LinearLayout) findViewById(R.id.restaurants);
        // Set a click listener on that View
        restaurants.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(ExplorePage.this,restaurants.class);
                startActivity(restaurantsIntent);
            }
        });

        LinearLayout historicalCentres = (LinearLayout) findViewById(R.id.historical_centres);
        // Set a click listener on that View
        historicalCentres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent historicalCentresIntent = new Intent(ExplorePage.this,historical_centres.class);
                startActivity(historicalCentresIntent );
            }
        });
        LinearLayout others = (LinearLayout) findViewById(R.id.others);
        // Set a click listener on that View
        others.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent othersIntent = new Intent(ExplorePage.this,others.class);
                startActivity(othersIntent );
            }
        });
    }
}

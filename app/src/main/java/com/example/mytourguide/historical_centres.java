package com.example.mytourguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class historical_centres extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parks_zoo);

        ArrayList<Explore> explore = new ArrayList<Explore> ();

        explore.add(new Explore ("Bowers Towers", "Location: Ring road", "Open: 9am - 10pm everyday ", R.drawable.bowers_tower));
        explore.add(new Explore("Mapo Hall","Location: Mapo", "Open: 9am - 10pm everyday ", R.drawable.mapo_hall));
        explore.add(new Explore("National Museum","Location: Jericho", "Open: 9am - 10pm everyday", R.drawable.national_museum));
        explore.add(new Explore("Irefin Palace","Location: Oke-Are - Oje road","Open: 9am - 10pm everyday ", R.drawable.irefin_palace));
        explore.add(new Explore("Olubadan Palace","Location: Queen Elizabeth, Mokola","Open: 9am - 10pm everyday ", R.drawable.olubadan_palace));



        ParksZooAdapter adapter = new ParksZooAdapter (this,explore, R.color.historical_centres );
        ListView listView = (ListView) findViewById(R.id.parks_zoo);
        listView.setAdapter(adapter);

    }
}

package com.example.mytourguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

import java.util.ArrayList;

public class malls extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parks_zoo);

        ArrayList<Explore> explore = new ArrayList<Explore> ();

        explore.add(new Explore ("Palms Mall", "Location: Ring road", "Open: 9am - 10pm everyday ", R.drawable.palms_mall_));
        explore.add(new Explore("Jericho Mall","Location: Jericho", "Open: 9am - 10pm everyday ", R.drawable.jericho_mall));
        explore.add(new Explore("Heritage Mall","Location: Heritage Mall, Beside Cocoa House, Dugbe", "Open: 9am - 10pm everyday", R.drawable.heritage_mall));
        explore.add(new Explore("Ventura Mall","Location: Sango-UI Road, Samonda GRA","Open: 9am - 10pm everyday ", R.drawable.ventura_mall));



        ParksZooAdapter adapter = new ParksZooAdapter (this,explore, R.color.parks_nature_zoos );
        ListView listView = (ListView) findViewById(R.id.parks_zoo);
        listView.setAdapter(adapter);

    }
}
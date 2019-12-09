package com.example.mytourguide;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class others extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parks_zoo);

        ArrayList<Explore> explore = new ArrayList<Explore> ();

        explore.add(new Explore ("Tutti Frutti", "Location: Ring road", "Open: 9am - 10pm everyday ", R.drawable.bowers_tower));
        explore.add(new Explore("Cold Stone Creamery","Location: Mapo", "Open: 9am - 10pm everyday ", R.drawable.mapo_hall));
        explore.add(new Explore("Cafe Chrysallis","Location: Jericho", "Open: 9am - 10pm everyday", R.drawable.national_museum));
        explore.add(new Explore("Dominos Pizza","Location: Oke-Are - Oje road","Open: 9am - 10pm everyday ", R.drawable.irefin_palace));
        explore.add(new Explore("Apollos lounge and Bar","Location: Queen Elizabeth, Mokola","Open: 9am - 10pm everyday ", R.drawable.olubadan_palace));
        explore.add(new Explore ("Mauve Lounge", "Location: Ring road", "Open: 9am - 10pm everyday ", R.drawable.bowers_tower));
        explore.add(new Explore("Mannas Kitchen","Location: Mapo", "Open: 9am - 10pm everyday ", R.drawable.mapo_hall));
        explore.add(new Explore("Jade's Cuisine","Location: Jericho", "Open: 9am - 10pm everyday", R.drawable.national_museum));
        explore.add(new Explore("Agodi Gardens Restaurant","Location: Oke-Are - Oje road","Open: 9am - 10pm everyday ", R.drawable.irefin_palace));
        explore.add(new Explore("Da Kings Grill and Coffee","Location: Queen Elizabeth, Mokola","Open: 9am - 10pm everyday ", R.drawable.olubadan_palace));



        ParksZooAdapter adapter = new ParksZooAdapter (this,explore, R.color.others );
        ListView listView = (ListView) findViewById(R.id.parks_zoo);
        listView.setAdapter(adapter);

    }
}

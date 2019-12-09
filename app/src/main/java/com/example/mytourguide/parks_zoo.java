package com.example.mytourguide;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class parks_zoo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parks_zoo);

        ArrayList<Explore> explore = new ArrayList<Explore> ();

        explore.add(new Explore ("Agodi Gardens", "Location: Agodi, Secretariat road, Ibadan", "Open: 9am - 10pm everyday (except Sundays)", R.drawable.agodi));
        explore.add(new Explore("Ado-Awaye Lake","Location: About 20km west of Iseyin, Iseyin", "Open: 9am - 10pm everyday (except Sundays)", R.drawable.adoawaye_ibadan));
        explore.add(new Explore("Trans Amusement Park","Location: Bodija, Ibadan", "Open: 9am - 10pm everyday)", R.drawable.trans_amusement));
        explore.add(new Explore("Moore Plantation Ibadan","Location: 21b Aba Akinjide Rd, Agodi, Ibadan","Open: 9am - 10pm everyday (except Sundays)", R.drawable.moore_plantation_ibadan));
        explore.add(new Explore("Tree Park, University of Ibadan","Location: Faculty of Agriculture, university of Ibadan", "Open:A 9am - 10pm everyday (except Sundays)", R.drawable.tree_park_ui));
        explore.add(new Explore("NPG Gardens","Location: 17, Alao Akala road, Akobo, Ibadan", "Open: 9am - 10pm everyday (except Sundays)", R.drawable.npg_gardens_ibadan));
        explore.add(new Explore("Heritage Park, University of Ibadan","Location: Opposite Queen Elizabeth II hall, University of Ibadan, Ibadan ", "Open: 9am - 11pm everyday", R.drawable.heritage_park_ui));




        ParksZooAdapter adapter = new ParksZooAdapter (this,explore, R.color.malls );
        ListView listView = (ListView) findViewById(R.id.parks_zoo);
        listView.setAdapter(adapter);
    }
}
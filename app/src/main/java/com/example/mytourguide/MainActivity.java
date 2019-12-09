package com.example.mytourguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openAbout (View view){
        Intent openAbout = new Intent(MainActivity.this, AboutPage.class);
        startActivity(openAbout);
    }
    public void openExplore (View view){
        Intent openExplore = new Intent(MainActivity.this,ExplorePage.class);
        startActivity(openExplore);
    }


}

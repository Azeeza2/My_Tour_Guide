package com.example.mytourguide;

import android.graphics.Path;
import android.widget.RatingBar;

public class Explore {
    // Drawable resource ID
    private int mImageResourceId;

    {
        mImageResourceId = NO_IMAGE;
    }

    private static final int NO_IMAGE = -1;

    private String mNameOfPlace;
    private String mLocation;
    private String mOpeningHours;

    public Explore ( String NameOfPlace,String Location, String OpeningHours, int ImageResourceId ){
        mImageResourceId = ImageResourceId;
        mNameOfPlace = NameOfPlace;
        mOpeningHours = OpeningHours;
        mLocation = Location;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE;

    }
    public String getNameOfPlace(){
        return mNameOfPlace;
    }
    public String getOpeningHours(){
        return mOpeningHours;
    }
    public String getLocation (){return mLocation;}
}

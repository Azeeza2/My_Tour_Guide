package com.example.mytourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.LayoutInflater;
import androidx.core.content.ContextCompat;
import java.util.ArrayList;
import java.util.List;
import androidx.core.content.ContextCompat;

public class ParksZooAdapter extends ArrayAdapter<Explore> {

    // color resource value
    private int mColorResourceId;

    public ParksZooAdapter(Activity context, ArrayList<Explore> explore, int colorResourceId) {

        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, explore);
        mColorResourceId = colorResourceId;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.tour_list, parent, false);
        }

        // Get the {@link WordAdapter} object located at this position in the list
        Explore currentWord = getItem(position);

        ImageView imageView= (ImageView) listItemView.findViewById(R.id.imageView2);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        if (currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else{
            imageView.setVisibility(View.GONE);
        }

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView NameOfPlaceTextView = (TextView) listItemView.findViewById(R.id.nameOfPlace);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        NameOfPlaceTextView.setText(currentWord.getNameOfPlace());

        TextView LocationTextView = (TextView) listItemView.findViewById(R.id.location);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        LocationTextView.setText(currentWord.getLocation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView OpeningHoursTextView = (TextView) listItemView.findViewById(R.id.openingHours);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        OpeningHoursTextView.setText(currentWord.getOpeningHours());

        View textContainer = listItemView.findViewById(R.id.strange);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}

package com.example.listviewapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

import androidx.annotation.NonNull;

import java.util.List;

public class ItemAdapter extends ArrayAdapter<Item> {

    public ItemAdapter(MainActivity context, List<Item> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Item item = getItem(position);

        // Reuse existing view if available, otherwise inflate a new one
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        // Lookup view components within the inflated layout
        TextView titleTextView = convertView.findViewById(R.id.itemTitle);
        TextView subtitleTextView = convertView.findViewById(R.id.itemSubtitle);
        ImageView itemImageView = convertView.findViewById(R.id.itemImage);

        // Populate the views with data from the item object
        if (item != null) {
            titleTextView.setText(item.getTitle());
            subtitleTextView.setText(item.getSubtitle());
            itemImageView.setImageResource(item.getImageResId());
        }

        return convertView;
    }
}

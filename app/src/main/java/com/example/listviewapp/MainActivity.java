package com.example.listviewapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.*;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Item> itemList;
    ItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.itemListView);
        itemList = new ArrayList<>();

        itemList.add(new Item(getString(R.string.apple_title), getString(R.string.apple_subtitle), R.drawable.apple, getString(R.string.apple_info)));
        itemList.add(new Item(getString(R.string.banana_title), getString(R.string.banana_subtitle), R.drawable.banana, getString(R.string.banana_info)));
        itemList.add(new Item(getString(R.string.grapes_title), getString(R.string.grapes_subtitle), R.drawable.grapes, getString(R.string.grapes_info)));
        itemList.add(new Item(getString(R.string.kiwi_title), getString(R.string.kiwi_subtitle), R.drawable.kiwi, getString(R.string.kiwi_info)));
        itemList.add(new Item(getString(R.string.watermelon_title), getString(R.string.watermelon_subtitle), R.drawable.watermelon, getString(R.string.watermelon_info)));
        itemList.add(new Item(getString(R.string.pineapple_title), getString(R.string.pineapple_subtitle), R.drawable.pineapple, getString(R.string.pineapple_info)));
        itemList.add(new Item(getString(R.string.strawberry_title), getString(R.string.strawberry_subtitle), R.drawable.strawberry, getString(R.string.strawberry_info)));
        itemList.add(new Item(getString(R.string.mango_title), getString(R.string.mango_subtitle), R.drawable.mango, getString(R.string.mango_info)));
        itemList.add(new Item(getString(R.string.orange_title), getString(R.string.orange_subtitle), R.drawable.orange, getString(R.string.orange_info)));
        itemList.add(new Item(getString(R.string.raspberry_title), getString(R.string.raspberry_subtitle), R.drawable.raspberry, getString(R.string.raspberry_info)));
        itemList.add(new Item(getString(R.string.blueberry_title), getString(R.string.blueberry_subtitle), R.drawable.blueberry, getString(R.string.blueberry_info)));
        itemList.add(new Item(getString(R.string.dragonfruit_title), getString(R.string.dragonfruit_subtitle), R.drawable.dragonfruit, getString(R.string.dragonfruit_info)));

        adapter = new ItemAdapter(this, itemList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) -> {
            Item clickedItem = itemList.get(position);

            Intent intent = new Intent(MainActivity.this, DetailActivity.class);
            intent.putExtra("itemData", clickedItem);
            startActivityForResult(intent, 1);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK) {
            // Toast.makeText(this, "Returned from detail view!", Toast.LENGTH_SHORT).show();
            Snackbar.make(findViewById(android.R.id.content), "Returned from detail view!", Snackbar.LENGTH_SHORT).show();
        }
    }
}

package com.example.listviewapp;

import android.os.Bundle;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView titleView, subtitleView, infoView;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        titleView = findViewById(R.id.detailTitle);
        subtitleView = findViewById(R.id.detailSubtitle);
        imageView = findViewById(R.id.detailImage);
        infoView = findViewById(R.id.detailInfo);

        Item item = (Item) getIntent().getSerializableExtra("itemData");

        if (item != null) {
            titleView.setText(item.getTitle());
            subtitleView.setText(item.getSubtitle());
            imageView.setImageResource(item.getImageResId());
            infoView.setText(item.getInfo());
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        setResult(RESULT_OK); // Tells MainActivity the return was successful
        finish();             // Closes this activity
        return true;
    }

}


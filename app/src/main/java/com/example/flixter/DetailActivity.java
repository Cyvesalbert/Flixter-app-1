package com.example.flixter;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.flixter.models.Movies;

import org.parceler.Parcels;

public class DetailActivity extends AppCompatActivity {
    TextView itvTitle;
    TextView itvOverview;
    RatingBar ratingBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        itvTitle = findViewById(R.id.itvTitle);
        itvOverview = findViewById(R.id.itvOverview);
        ratingBar = findViewById(R.id.ratingBar);

        Movies movie = Parcels.unwrap(getIntent().getParcelableExtra("movie"));
        itvTitle.setText(movie.getTitle());
        itvOverview.setText(movie.getOverview());
        ratingBar.setRating((float)movie.getRating());
    }
}
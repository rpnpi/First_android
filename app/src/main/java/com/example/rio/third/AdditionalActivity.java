package com.example.rio.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class AdditionalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_additional);

        final Button button = (Button) findViewById(R.id.buttonBack);

        String userName = getIntent().getStringExtra(MainActivity.USER_NAME);
        int receivedRating = getIntent().getIntExtra(MainActivity.EXTRA_RATING,3);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setRating(receivedRating);

        TextView textView = (TextView) findViewById(R.id.welcomeMessageView);
        textView.setText(userName);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent = new Intent(AdditionalActivity.this,MainActivity.class);

                startActivity(intent);
            }
        });
    }
}

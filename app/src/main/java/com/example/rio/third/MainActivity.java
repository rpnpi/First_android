package com.example.rio.third;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String USER_NAME;
  final  public static String EXTRA_RATING = "com.example.rio.RATING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.clickButton);
        final EditText editText = (EditText) findViewById(R.id.userNameEntert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),AdditionalActivity.class);
                final String name=("Welcome To "+editText.getText().toString());
                intent.putExtra(USER_NAME,name);
                intent.putExtra(EXTRA_RATING,3);
                startActivity(intent);
            }
        });
    }

}

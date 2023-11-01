package com.example.que4; // Your package name here

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Find the TextView in the layout
        TextView displayText = findViewById(R.id.displayText);

        // Check if "time" extra is present in the intent
        if (getIntent().hasExtra("time")) {
            String receivedTime = getIntent().getStringExtra("time");
            displayText.setText("Current Time: " + receivedTime);
        }
        // Check if "date" extra is present in the intent
        else if (getIntent().hasExtra("date")) {
            String receivedDate = getIntent().getStringExtra("date");
            displayText.setText("Current Date: " + receivedDate);
        }
    }
}

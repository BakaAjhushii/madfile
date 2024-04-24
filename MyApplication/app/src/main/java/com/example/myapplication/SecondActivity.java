package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewReceivedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewReceivedValue = findViewById(R.id.textViewReceivedValue);

        // Get the Intent that started this activity
        Intent intent = getIntent();

        // Get the value passed from MainActivity using the key
        String receivedValue = intent.getStringExtra("VALUE_KEY");

        // Display the received value in TextView
        textViewReceivedValue.setText("Received Value: " + receivedValue);
    }
}

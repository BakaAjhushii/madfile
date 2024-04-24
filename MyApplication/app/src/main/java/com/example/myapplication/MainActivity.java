package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextValue;
    private Button buttonOpenSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextValue = findViewById(R.id.editTextValue);
        buttonOpenSecond = findViewById(R.id.buttonOpenSecond);

        buttonOpenSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSecondActivity();
            }
        });
    }

    private void openSecondActivity() {
        // Get the value from the EditText
        String valueToSend = editTextValue.getText().toString();

        // Create an Intent to start SecondActivity
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        // Pass the value to the second activity using the Intent
        intent.putExtra("VALUE_KEY", valueToSend);

        // Start the second activity
        startActivity(intent);
    }
}

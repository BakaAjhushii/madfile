package com.example.expthree;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView helloWorldTextView = findViewById(R.id.helloWorldTextView);

        // Set an OnClickListener on the TextView
        helloWorldTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message when the TextView is clicked
                Toast.makeText(MainActivity.this, "Hello World!", Toast.LENGTH_SHORT).show();
                //displayText.setText("Hello");
            }
        });
    }
}

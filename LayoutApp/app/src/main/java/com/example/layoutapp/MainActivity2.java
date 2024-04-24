package com.example.layoutapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.AbsoluteLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Create an AbsoluteLayout
        AbsoluteLayout absoluteLayout = new AbsoluteLayout(this);
        setContentView(absoluteLayout);

        // Create a TextView
        TextView textView = new TextView(this);
        textView.setText("Hello, AbsoluteLayout!");
        textView.setTextSize(20);

        // Set TextView position within AbsoluteLayout
        AbsoluteLayout.LayoutParams textParams = new AbsoluteLayout.LayoutParams(
                AbsoluteLayout.LayoutParams.WRAP_CONTENT,
                AbsoluteLayout.LayoutParams.WRAP_CONTENT,
                50, // X coordinate
                50  // Y coordinate
        );
        textView.setLayoutParams(textParams);

        // Add TextView to AbsoluteLayout
        absoluteLayout.addView(textView);

        // Create an ImageView
        ImageView imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.flowers_name_in_english); // Replace 'image' with your image resource

        // Set ImageView position within AbsoluteLayout
        AbsoluteLayout.LayoutParams imageParams = new AbsoluteLayout.LayoutParams(
                AbsoluteLayout.LayoutParams.WRAP_CONTENT,
                AbsoluteLayout.LayoutParams.WRAP_CONTENT,
                200, // X coordinate
                200  // Y coordinate
        );
        imageView.setLayoutParams(imageParams);

        // Add ImageView to AbsoluteLayout
        absoluteLayout.addView(imageView);
    }
}

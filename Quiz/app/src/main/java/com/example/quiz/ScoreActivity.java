package com.example.quiz;

// ScoreActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        Intent intent = getIntent();
        int score = intent.getIntExtra("score", 0);

        TextView scoreTextView = findViewById(R.id.score_text);
        scoreTextView.setText("Your Score: " + score + " / 5");
    }
}

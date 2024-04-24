package com.example.quiz;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] questions = {
            "Which of the following is NOT a valid Java keyword?",
            "What is the correct syntax for declaring a variable in Java?",
            "What is the output of 'System.out.println(4 | 3)'?",
            "Which of the following is a valid declaration of a char variable in Java?",
            "What is the default value of a boolean variable in Java?"
    };

    private String[][] options = {
            {"class", "interface", "String", "static"},
            {"var x", "int x = 5", "x = 5", "Integer x = 5"},
            {"7", "3", "4", "0"},
            {"char c = 'A';", "Char c = 'A';", "char c = \"A\";", "char c = 65;"},
            {"true", "false", "0", "null"}
    };

    private int[] answers = {2, 1, 3, 0, 1}; // Index of correct option for each question
    private int currentIndex = 0;
    private int score = 0;

    private RadioGroup optionsRadioGroup;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        optionsRadioGroup = findViewById(R.id.options_radio_group);
        submitButton = findViewById(R.id.submit_button);

        updateQuestion();

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedOptionId = optionsRadioGroup.getCheckedRadioButtonId();
                if (selectedOptionId != -1) {
                    RadioButton selectedRadioButton = findViewById(selectedOptionId);
                    int selectedOptionIndex = optionsRadioGroup.indexOfChild(selectedRadioButton);
                    checkAnswer(selectedOptionIndex);
                } else {
                    Toast.makeText(MainActivity.this, "Please select an option", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void updateQuestion() {
        if (currentIndex < questions.length) {
            TextView questionTextView = findViewById(R.id.question_text_view);
            questionTextView.setText("Question " + (currentIndex + 1) + ": " + questions[currentIndex]);
            optionsRadioGroup.removeAllViews();
            for (int i = 0; i < options[currentIndex].length; i++) {
                RadioButton radioButton = new RadioButton(this);
                radioButton.setText(options[currentIndex][i]);
                optionsRadioGroup.addView(radioButton);
            }
        } else {
            showScore();
        }
    }

    private void checkAnswer(int selectedOptionIndex) {
        if (selectedOptionIndex == answers[currentIndex]) {
            score++;
        }
        currentIndex++;
        updateQuestion();
    }

    private void showScore() {
        Intent intent = new Intent(this, ScoreActivity.class);
        intent.putExtra("score", score);
        startActivity(intent);
        finish();
    }
}

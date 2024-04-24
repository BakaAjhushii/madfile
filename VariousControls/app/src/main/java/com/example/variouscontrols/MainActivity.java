package com.example.variouscontrols;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText nameEditText;
    CheckBox checkBox;
    RadioGroup radioGroup;
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radioGroup);
        submitButton = findViewById(R.id.submitButton);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nameEditText.getText().toString();
                boolean isChecked = checkBox.isChecked();
                int radioButtonId = radioGroup.getCheckedRadioButtonId();
                String radioButtonSelected = "";

                if (radioButtonId != -1) {
                    RadioButton radioButton = findViewById(radioButtonId);
                    radioButtonSelected = radioButton.getText().toString();
                }

                String message = "Name: " + name + "\n" +
                        "Checkbox checked: " + isChecked + "\n" +
                        "Radio Button selected: " + radioButtonSelected;

                Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

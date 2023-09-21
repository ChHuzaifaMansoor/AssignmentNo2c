package com.example.assignmentno2c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BMI extends AppCompatActivity {
    private EditText weightEditText;
    private EditText heightEditText;
    private Button calculateButton;
    private TextView resultTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

        weightEditText = findViewById(R.id.weightEditText);
        heightEditText = findViewById(R.id.heightEditText);
        calculateButton = findViewById(R.id.calculateButton);
        resultTextView = findViewById(R.id.resultTextView);
        Button Exit=findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(BMI.this,MainActivity.class);
                startActivity(intent);
            }
        });



        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the weight and height entered by the user
                String weightStr = weightEditText.getText().toString();
                String heightStr = heightEditText.getText().toString();

                if (!weightStr.isEmpty() && !heightStr.isEmpty()) {
                    // Convert weight and height to numeric values
                    double weight = Double.parseDouble(weightStr);
                    double height = Double.parseDouble(heightStr);

                    // Calculate BMI
                    double bmi = weight / (height * height);
                    // Display the result in the TextView
                    resultTextView.setText(String.format("Your BMI: %.2f", bmi));
                } else {
                    resultTextView.setText("Please enter valid weight and height.");
                }
            }
        });
    }
}
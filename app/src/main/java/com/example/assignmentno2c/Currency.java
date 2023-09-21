package com.example.assignmentno2c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Currency extends AppCompatActivity {
    private EditText Input;
    private TextView Output;
    private Button convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        Input=findViewById(R.id.edit);
        Output=findViewById(R.id.textView);
        convert=findViewById(R.id.button);
        Button Exit=findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Currency.this,MainActivity.class);
                startActivity(intent);
            }
        });


        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pkrAmountStr = Input.getText().toString();

                if (!pkrAmountStr.isEmpty()) {
                    // Convert PKR to USD using a fixed conversion rate (replace with a real rate)
                    double pkrAmount = Double.parseDouble(pkrAmountStr);
                    double conversionRate = 0.0058; // Example rate
                    double usdAmount = pkrAmount * conversionRate;

                    // Display the result in the TextView
                    Output.setText(String.format("%.2f PKR = %.2f USD", pkrAmount, usdAmount));
                } else {
                    Output.setText("Please enter a valid PKR amount.");
                }
            }
        });
    }
}
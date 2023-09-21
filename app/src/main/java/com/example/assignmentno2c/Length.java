package com.example.assignmentno2c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Length extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        Button btn= findViewById(R.id.Go_Back);
        Button btn1=findViewById(R.id.Con_B);
        TextView Output=findViewById(R.id.Input);
        EditText Input=findViewById(R.id.Output);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Length.this,MainActivity.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get the text from the Input EditText
                String inputText = Input.getText().toString();

                if (!inputText.isEmpty()) {
                    try {
                        double meters = Double.parseDouble(inputText);
                        double centimeters = meters * 100.0;
                        Output.setText("Length in Centimeter is:"+centimeters+"cm");
                    }
                    catch (NumberFormatException e) {
                        Toast.makeText(Length.this, "Invalid Input", Toast.LENGTH_LONG).show();
                        Output.setText("");
                    }
                } else {
                    Toast.makeText(Length.this, "Enter the Value", Toast.LENGTH_LONG).show();
                    Output.setText("");
                }
            }

        });

    }
}
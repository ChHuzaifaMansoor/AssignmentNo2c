package com.example.assignmentno2c;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Temprature extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature);
         Button convert =  findViewById(R.id.Con_B);
        EditText Output=findViewById(R.id.Output);
        TextView Input= findViewById(R.id.Input);

        Button btn= findViewById(R.id.Go_Back);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Temprature.this,MainActivity.class);
                startActivity(intent);
            }
        });
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = String.valueOf(Output.getText());

                float C = Float.parseFloat(temp);
                float F = (9*C/5) +32;
                Input.setText(String.valueOf( F));
                Toast.makeText(Temprature.this, "F "+F, Toast.LENGTH_LONG).show();


            }
        });





    }
}
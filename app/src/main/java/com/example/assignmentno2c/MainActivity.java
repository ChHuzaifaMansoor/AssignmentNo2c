package com.example.assignmentno2c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Friend= findViewById(R.id.button1);
        Button Currency= findViewById(R.id.button2);
        Button Temperature= findViewById(R.id.button3);
        Button BMI= findViewById(R.id.button4);
        Button Length= findViewById(R.id.button5);
        Button Area= findViewById(R.id.button6);

        Friend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,FriendShip_Cal.class);
                startActivity(intent);

            }
        });
        Currency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Currency.class);
                startActivity(intent);

            }
        });

        Temperature.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Temprature.class);
                startActivity(intent);

            }
        });
        BMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,BMI.class);
                startActivity(intent);

            }
        });
        Length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Length.class);
                startActivity(intent);

            }
        });
        Area.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Area_Convertor.class);
                startActivity(intent);

            }
        });
    }
}
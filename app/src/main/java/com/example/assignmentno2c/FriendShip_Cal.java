package com.example.assignmentno2c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class FriendShip_Cal extends AppCompatActivity {
    private EditText editTextName1;
    private EditText editTextName2;
    private TextView resultTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friend_ship_cal);
       editTextName1 = findViewById(R.id.editTextName1);
       editTextName2 = findViewById(R.id.editTextName2);
       resultTextView = findViewById(R.id.resultTextView);
        Button calculateButton = findViewById(R.id.calculateButton);
        Button Exit=findViewById(R.id.Exit);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateFriendshipScore();

            }
        });
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(FriendShip_Cal.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void calculateFriendshipScore() {
        String name1 = editTextName1.getText().toString().trim();
        String name2 = editTextName2.getText().toString().trim();

        if (name1.isEmpty() || name2.isEmpty()) {
            resultTextView.setText("Please enter both names.");
        } else {
            // Generate a random friendship score between 0 and 100
            int friendshipScore = new Random().nextInt(101);
            String resultMessage = "Friendship Score between " + name1 + " and " + name2 + ": " + friendshipScore + "%";
            resultTextView.setText(resultMessage);
        }
    }
}

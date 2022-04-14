package com.example.fitnesstrackerfnal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("Home");

        Button workoutBTN = findViewById(R.id.workoutButton);
        Button calorieTrackerBTN = findViewById(R.id.calorieTrackerButton);

        workoutBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent workoutIntent = new Intent(HomeActivity.this, WorkoutActivity.class);
                startActivity(workoutIntent);
            }
        });

        calorieTrackerBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calorieTrackerIntent = new Intent(HomeActivity.this, CalorieTrackerActivity.class);
                startActivity(calorieTrackerIntent);
            }
        });
    }
}
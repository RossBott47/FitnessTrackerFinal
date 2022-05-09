package com.example.fitnesstrackerfnal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.fitnesstrackerfnal.WorkoutAreaActivities.BackWorkoutActivity;
import com.example.fitnesstrackerfnal.WorkoutAreaActivities.BicepWorkoutActivity;
import com.example.fitnesstrackerfnal.WorkoutAreaActivities.ChestWorkoutActivity;
import com.example.fitnesstrackerfnal.WorkoutAreaActivities.LegsWorkoutActivity;
import com.example.fitnesstrackerfnal.WorkoutAreaActivities.ShoulderWorkoutActivity;
import com.example.fitnesstrackerfnal.WorkoutAreaActivities.TricepWorkoutActivity;

public class WorkoutActivity extends AppCompatActivity {

    LinearLayout workout1;
    LinearLayout workout2;
    LinearLayout workout3;
    LinearLayout workout4;
    LinearLayout workout5;
    LinearLayout workout6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout);
        setTitle("Workout List");

        workout1 = (LinearLayout) findViewById(R.id.workout1);
        workout2 = (LinearLayout) findViewById(R.id.workout2);
        workout3 = (LinearLayout) findViewById(R.id.workout3);
        workout4 = (LinearLayout) findViewById(R.id.workout4);
        workout5 = (LinearLayout) findViewById(R.id.workout5);
        workout6 = (LinearLayout) findViewById(R.id.workout6);


        workout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chestWorkoutIntent = new Intent(WorkoutActivity.this, ChestWorkoutActivity.class);
                startActivity(chestWorkoutIntent);
            }
        });

        workout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bicepWorkoutIntent = new Intent(WorkoutActivity.this, BicepWorkoutActivity.class);
                startActivity(bicepWorkoutIntent);
            }
        });

        workout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shoulderWorkoutIntent = new Intent(WorkoutActivity.this, ShoulderWorkoutActivity.class);
                startActivity(shoulderWorkoutIntent);
            }
        });

        workout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent legsWorkoutIntent = new Intent(WorkoutActivity.this, LegsWorkoutActivity.class);
                startActivity(legsWorkoutIntent);
            }
        });

        workout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backWorkoutIntent = new Intent(WorkoutActivity.this, BackWorkoutActivity.class);
                startActivity(backWorkoutIntent);
            }
        });

        workout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tricepWorkoutIntent = new Intent(WorkoutActivity.this, TricepWorkoutActivity.class);
                startActivity(tricepWorkoutIntent);
            }
        });
    }
}
package com.example.fitnesstrackerfnal.WorkoutAreaActivities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.example.fitnesstrackerfnal.WorkoutTimers.BenchTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.CableCrossoverTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.CableFlyTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.FloorPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.InclineDumbellFlyTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.PushupsTimer;
import com.example.fitnesstrackerfnal.R;

public class ChestWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;
    LinearLayout workout2Exercise;
    LinearLayout workout3Exercise;
    LinearLayout workout4Exercise;
    LinearLayout workout5Exercise;
    LinearLayout workout6Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout_activty);
        setTitle("Chest Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.chestworkout1Exercise);
        workout2Exercise = (LinearLayout) findViewById(R.id.chestworkout2Exercise);
        workout3Exercise = (LinearLayout) findViewById(R.id.chestworkout3Exercise);
        workout4Exercise = (LinearLayout) findViewById(R.id.chestworkout4Exercise);
        workout5Exercise = (LinearLayout) findViewById(R.id.chestworkout5Exercise);
        workout6Exercise = (LinearLayout) findViewById(R.id.chestworkout6Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent benchWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, BenchTimer.class);
                startActivity(benchWorkoutTimerIntent);
            }
        });

        workout2Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cableFlyWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, CableFlyTimer.class);
                startActivity(cableFlyWorkoutTimerIntent);
            }
        });

        workout3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pushupsWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, PushupsTimer.class);
                startActivity(pushupsWorkoutTimerIntent);
            }
        });

        workout4Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inclineDumbellFlyWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, InclineDumbellFlyTimer.class);
                startActivity(inclineDumbellFlyWorkoutTimerIntent);
            }
        });

        workout5Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cableCrossoverWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, CableCrossoverTimer.class);
                startActivity(cableCrossoverWorkoutTimerIntent);
            }
        });

        workout6Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent floorPressWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, FloorPressTimer.class);
                startActivity(floorPressWorkoutTimerIntent);
            }
        });
    }
}
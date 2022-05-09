package com.example.fitnesstrackerfnal.WorkoutAreaActivities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrackerfnal.R;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.BarbellHipThrustTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.DumbellStepUpTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.FrontSquatTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.LegPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.SeatedCalfRaiseTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.SquatTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.BentOverReverseFlyTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.CirclePressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.FrontDeltRaiseTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.LateralDeltRaiseTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.OverheadShoulderPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.UprightRowTimer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ShoulderWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;
    LinearLayout workout2Exercise;
    LinearLayout workout3Exercise;
    LinearLayout workout4Exercise;
    LinearLayout workout5Exercise;
    LinearLayout workout6Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulder_workout);
        setTitle("Shoulder Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.shoulderworkout1Exercise);
        workout2Exercise = (LinearLayout) findViewById(R.id.shoulderworkout2Exercise);
        workout3Exercise = (LinearLayout) findViewById(R.id.shoulderworkout3Exercise);
        workout4Exercise = (LinearLayout) findViewById(R.id.shoulderworkout4Exercise);
        workout5Exercise = (LinearLayout) findViewById(R.id.shoulderworkout5Exercise);
        workout6Exercise = (LinearLayout) findViewById(R.id.shoulderworkout6Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoulderWorkoutActivity.this, OverheadShoulderPressTimer.class);
                startActivity(intent);
            }
        });

        workout2Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoulderWorkoutActivity.this, FrontDeltRaiseTimer.class);
                startActivity(intent);
            }
        });

        workout3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoulderWorkoutActivity.this, LateralDeltRaiseTimer.class);
                startActivity(intent);
            }
        });

        workout4Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoulderWorkoutActivity.this, CirclePressTimer.class);
                startActivity(intent);
            }
        });

        workout5Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoulderWorkoutActivity.this, BentOverReverseFlyTimer.class);
                startActivity(intent);
            }
        });

        workout6Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShoulderWorkoutActivity.this, UprightRowTimer.class);
                startActivity(intent);
            }
        });
    }
}
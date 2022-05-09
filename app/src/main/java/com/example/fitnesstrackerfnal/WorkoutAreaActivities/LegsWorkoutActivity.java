package com.example.fitnesstrackerfnal.WorkoutAreaActivities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrackerfnal.R;
import com.example.fitnesstrackerfnal.WorkoutTimers.BenchTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.CableCrossoverTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.CableFlyTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.FloorPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.InclineDumbellFlyTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.BarbellHipThrustTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.DumbellStepUpTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.FrontSquatTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.LegPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.SeatedCalfRaiseTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Legs.SquatTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.PushupsTimer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class LegsWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;
    LinearLayout workout2Exercise;
    LinearLayout workout3Exercise;
    LinearLayout workout4Exercise;
    LinearLayout workout5Exercise;
    LinearLayout workout6Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legs_workout);
        setTitle("Chest Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.legsworkout1Exercise);
        workout2Exercise = (LinearLayout) findViewById(R.id.legsworkout2Exercise);
        workout3Exercise = (LinearLayout) findViewById(R.id.legsworkout3Exercise);
        workout4Exercise = (LinearLayout) findViewById(R.id.legsworkout4Exercise);
        workout5Exercise = (LinearLayout) findViewById(R.id.legsworkout5Exercise);
        workout6Exercise = (LinearLayout) findViewById(R.id.legsworkout6Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent squatWorkoutTimerIntent = new Intent(LegsWorkoutActivity.this, SquatTimer.class);
                startActivity(squatWorkoutTimerIntent);
            }
        });

        workout2Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent frontSquatWorkoutTimerIntent = new Intent(LegsWorkoutActivity.this, FrontSquatTimer.class);
                startActivity(frontSquatWorkoutTimerIntent);
            }
        });

        workout3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dumbellStepUpWorkoutTimerIntent = new Intent(LegsWorkoutActivity.this, DumbellStepUpTimer.class);
                startActivity(dumbellStepUpWorkoutTimerIntent);
            }
        });

        workout4Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent legPressWorkoutTimerIntent = new Intent(LegsWorkoutActivity.this, LegPressTimer.class);
                startActivity(legPressWorkoutTimerIntent);
            }
        });

        workout5Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent barbellHipThrustWorkoutTimerIntent = new Intent(LegsWorkoutActivity.this, BarbellHipThrustTimer.class);
                startActivity(barbellHipThrustWorkoutTimerIntent);
            }
        });

        workout6Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seatedCalfRaiseWorkoutTimerIntent = new Intent(LegsWorkoutActivity.this, SeatedCalfRaiseTimer.class);
                startActivity(seatedCalfRaiseWorkoutTimerIntent);
            }
        });
    }
}
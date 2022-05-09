package com.example.fitnesstrackerfnal.WorkoutAreaActivities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrackerfnal.R;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.BentOverReverseFlyTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.CirclePressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.FrontDeltRaiseTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.LateralDeltRaiseTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.OverheadShoulderPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Shoulders.UprightRowTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Triceps.DiamondPressUpTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Triceps.IsolatedTricepExtensionTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Triceps.OneArmKettlebellFloorPressTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Triceps.RopeTricepPushdownTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Triceps.SkullcrushersTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Triceps.TricepDipsTimer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class TricepWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;
    LinearLayout workout2Exercise;
    LinearLayout workout3Exercise;
    LinearLayout workout4Exercise;
    LinearLayout workout5Exercise;
    LinearLayout workout6Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tricep_workout);
        setTitle("Tricep Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.tricepworkout1Exercise);
        workout2Exercise = (LinearLayout) findViewById(R.id.tricepworkout2Exercise);
        workout3Exercise = (LinearLayout) findViewById(R.id.tricepworkout3Exercise);
        workout4Exercise = (LinearLayout) findViewById(R.id.tricepworkout4Exercise);
        workout5Exercise = (LinearLayout) findViewById(R.id.tricepworkout5Exercise);
        workout6Exercise = (LinearLayout) findViewById(R.id.tricepworkout6Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TricepWorkoutActivity.this, RopeTricepPushdownTimer.class);
                startActivity(intent);
            }
        });

        workout2Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TricepWorkoutActivity.this, TricepDipsTimer.class);
                startActivity(intent);
            }
        });

        workout3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TricepWorkoutActivity.this, IsolatedTricepExtensionTimer.class);
                startActivity(intent);
            }
        });

        workout4Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TricepWorkoutActivity.this, SkullcrushersTimer.class);
                startActivity(intent);
            }
        });

        workout5Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TricepWorkoutActivity.this, DiamondPressUpTimer.class);
                startActivity(intent);
            }
        });

        workout6Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TricepWorkoutActivity.this, OneArmKettlebellFloorPressTimer.class);
                startActivity(intent);
            }
        });
    }
}
package com.example.fitnesstrackerfnal.WorkoutAreaActivities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrackerfnal.R;
import com.example.fitnesstrackerfnal.WorkoutTimers.BandCurlTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.HammerCurlTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.PreacherCurlTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.ReverseCurl;
import com.example.fitnesstrackerfnal.WorkoutTimers.SideCurlTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.WideGripCurlTimer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class BicepWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;
    LinearLayout workout2Exercise;
    LinearLayout workout3Exercise;
    LinearLayout workout4Exercise;
    LinearLayout workout5Exercise;
    LinearLayout workout6Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep_workout);
        setTitle("Bicep Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.bicepworkout1Exercise);
        workout2Exercise = (LinearLayout) findViewById(R.id.bicepworkout2Exercise);
        workout3Exercise = (LinearLayout) findViewById(R.id.bicepworkout3Exercise);
        workout4Exercise = (LinearLayout) findViewById(R.id.bicepworkout4Exercise);
        workout5Exercise = (LinearLayout) findViewById(R.id.bicepworkout5Exercise);
        workout6Exercise = (LinearLayout) findViewById(R.id.bicepworkout6Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hammerCurlWorkoutTimerIntent = new Intent(BicepWorkoutActivity.this, HammerCurlTimer.class);
                startActivity(hammerCurlWorkoutTimerIntent);
            }
        });

        workout2Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bandCurlWorkoutTimerIntent = new Intent(BicepWorkoutActivity.this, BandCurlTimer.class);
                startActivity(bandCurlWorkoutTimerIntent);
            }
        });

        workout3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sideCurlWorkoutTimerIntent = new Intent(BicepWorkoutActivity.this, SideCurlTimer.class);
                startActivity(sideCurlWorkoutTimerIntent);
            }
        });

        workout4Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent preacherCurlWorkoutTimerIntent = new Intent(BicepWorkoutActivity.this, PreacherCurlTimer.class);
                startActivity(preacherCurlWorkoutTimerIntent);
            }
        });

        workout5Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reverseCurlWorkoutTimerIntent = new Intent(BicepWorkoutActivity.this, ReverseCurl.class);
                startActivity(reverseCurlWorkoutTimerIntent);
            }
        });

        workout6Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent wideGripCurlWorkoutTimerIntent = new Intent(BicepWorkoutActivity.this, WideGripCurlTimer.class);
                startActivity(wideGripCurlWorkoutTimerIntent);
            }
        });
    }
}
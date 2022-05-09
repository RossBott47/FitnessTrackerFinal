package com.example.fitnesstrackerfnal.WorkoutAreaActivities;

import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrackerfnal.R;
import com.example.fitnesstrackerfnal.WorkoutTimers.Back.BackRowsTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Back.KettleBellSwingsTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Back.LatPullDownsTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Back.PullupsTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Back.RearFlysTimer;
import com.example.fitnesstrackerfnal.WorkoutTimers.Back.SingleArmRowTimer;
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

public class BackWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;
    LinearLayout workout2Exercise;
    LinearLayout workout3Exercise;
    LinearLayout workout4Exercise;
    LinearLayout workout5Exercise;
    LinearLayout workout6Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back_workout);
        setTitle("Back Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.backworkout1Exercise);
        workout2Exercise = (LinearLayout) findViewById(R.id.backworkout2Exercise);
        workout3Exercise = (LinearLayout) findViewById(R.id.backworkout3Exercise);
        workout4Exercise = (LinearLayout) findViewById(R.id.backworkout4Exercise);
        workout5Exercise = (LinearLayout) findViewById(R.id.backworkout5Exercise);
        workout6Exercise = (LinearLayout) findViewById(R.id.backworkout6Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackWorkoutActivity.this, BackRowsTimer.class);
                startActivity(intent);
            }
        });

        workout2Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackWorkoutActivity.this, RearFlysTimer.class);
                startActivity(intent);
            }
        });

        workout3Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackWorkoutActivity.this, SingleArmRowTimer.class);
                startActivity(intent);
            }
        });

        workout4Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackWorkoutActivity.this, PullupsTimer.class);
                startActivity(intent);
            }
        });

        workout5Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackWorkoutActivity.this, LatPullDownsTimer.class);
                startActivity(intent);
            }
        });

        workout6Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BackWorkoutActivity.this, KettleBellSwingsTimer.class);
                startActivity(intent);
            }
        });
    }
}
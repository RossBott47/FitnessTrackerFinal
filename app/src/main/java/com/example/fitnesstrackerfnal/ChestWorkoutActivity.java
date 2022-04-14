package com.example.fitnesstrackerfnal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class ChestWorkoutActivity extends AppCompatActivity {

    LinearLayout workout1Exercise;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout_activty);
        setTitle("Chest Workouts");

        workout1Exercise = (LinearLayout) findViewById(R.id.workout1Exercise);

        workout1Exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent chestWorkoutTimerIntent = new Intent(ChestWorkoutActivity.this, ChestWorkoutActivityTimer.class);
                startActivity(chestWorkoutTimerIntent);
            }
        });
    }
}
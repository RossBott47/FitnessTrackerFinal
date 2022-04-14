package com.example.fitnesstrackerfnal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CalorieTrackerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_tracker);
        setTitle("Calorie Tracker");
    }
}
package com.example.fitnesstrackerfnal.BMICalculatorActivites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import com.example.fitnesstrackerfnal.R;

public class BMImainActivity extends AppCompatActivity {

    android.widget.Button calculateBMI;
    TextView currentHeight, currentAge, currentWeight;
    SeekBar seekHeight, seekWeight, seekAge;
    RelativeLayout male, female;

    int currentWeightProgress;
    int currentHeightProgress;
    int currentAgeProgress;
    String heightProgress = "0";
    String weightProgress = "0";
    String ageProgress = "0";
    String gender = "0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmimain);
        getSupportActionBar().hide();

        calculateBMI = findViewById(R.id.calculateBMI);
        currentAge = findViewById(R.id.currentAge);
        currentWeight = findViewById(R.id.currentWeight);
        currentHeight = findViewById(R.id.currentHeight);
        seekHeight = findViewById(R.id.seekBarHeight);
        seekAge = findViewById(R.id.seekBarAge);
        seekWeight = findViewById(R.id.seekBarWeight);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        seekHeight.setMax(100);
        seekHeight.setProgress(0);
        seekHeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentHeightProgress = progress;
                heightProgress= String.valueOf(currentHeightProgress);
                currentHeight.setText(heightProgress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekWeight.setMax(350);
        seekWeight.setProgress(0);
        seekWeight.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentWeightProgress = progress;
                weightProgress= String.valueOf(currentWeightProgress);
                currentWeight.setText(weightProgress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekAge.setMax(100);
        seekAge.setProgress(0);
        seekAge.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                currentAgeProgress = progress;
                ageProgress= String.valueOf(currentAgeProgress);
                currentAge.setText(ageProgress);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        male.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                male.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.boxfocusing));
                female.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.boxnormal));
                gender = "Male";
            }
        });

        female.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                male.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.boxnormal));
                female.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.boxfocusing));
                gender = "Female";
            }
        });

        calculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gender.equals("0")){
                    Toast.makeText(getApplicationContext(), "Select Gender", Toast.LENGTH_SHORT).show();
                } else if(heightProgress.equals("0") || weightProgress.equals("0") || ageProgress.equals("0")){
                    Toast.makeText(getApplicationContext(), "Must fill out all fields", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(BMImainActivity.this, BMIresultActivity.class);

                    intent.putExtra("gender", gender);
                    intent.putExtra("height", heightProgress);
                    intent.putExtra("weight", weightProgress);
                    intent.putExtra("age", ageProgress);

                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}
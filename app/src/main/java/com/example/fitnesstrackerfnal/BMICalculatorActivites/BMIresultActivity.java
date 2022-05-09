package com.example.fitnesstrackerfnal.BMICalculatorActivites;

import androidx.appcompat.app.AppCompatActivity;
import com.example.fitnesstrackerfnal.R;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BMIresultActivity extends AppCompatActivity {

    android.widget.Button recaculateBMI;
    TextView bmiDisplay, bmiCategory, gender;
    Intent intent;
    ImageView imageView;
    String bmi;
    Float intBMI;
    String height;
    String weight;
    Float intHeight, intWeight;
    RelativeLayout background;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi_result);

        intent = getIntent();
        bmiDisplay = findViewById(R.id.BmiText);
        bmiCategory = findViewById(R.id.bmiCategory);
        gender = findViewById(R.id.genderText);
        background = findViewById(R.id.contentLayout);
        recaculateBMI = findViewById(R.id.recalculateBMI);

        height = intent.getStringExtra("height");
        weight = intent.getStringExtra("weight");

        intHeight = Float.parseFloat(height);
        intWeight = Float.parseFloat(weight);
        intBMI = (intWeight / (intHeight * intHeight)) * 703;
        bmi = Float.toString(intBMI);

        if(intBMI < 18.4){
            bmiCategory.setText("Underweight");
            background.setBackgroundColor(Color.RED);
            recaculateBMI.setBackgroundColor(Color.RED);
        } else if(intBMI <= 25 && intBMI >= 18.4){
            bmiCategory.setText("Normal");
            background.setBackgroundColor(Color.GREEN);
            recaculateBMI.setBackgroundColor(Color.GREEN);
        } else if(intBMI <= 29.9 && intBMI > 25) {
            bmiCategory.setText("Overweight");
            background.setBackgroundColor(Color.RED);
            recaculateBMI.setBackgroundColor(Color.RED);
        } else{
            bmiCategory.setText("Obese");
            background.setBackgroundColor(Color.RED);
            recaculateBMI.setBackgroundColor(Color.RED);
        }

        gender.setText(intent.getStringExtra("gender"));
        bmiDisplay.setText(bmi);

        recaculateBMI = findViewById(R.id.recalculateBMI);
        recaculateBMI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BMIresultActivity.this, BMImainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
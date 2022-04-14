package com.example.fitnesstrackerfnal;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class ChestWorkoutActivityTimer extends AppCompatActivity {

    private TextView countdownText;
    private Button countdownButton;
    private CountDownTimer countDownTimer;
    private long timeLeftInMilliseconds = 60000;
    private boolean timerRunning;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest_workout_timer);
        setTitle("Workout Timer");

        countdownText = findViewById(R.id.countdown_text);
        countdownButton = findViewById(R.id.countdown_button);

        countdownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStop();
            }
        });

        updateTimer();
    }

        public void startStop(){
            if(timerRunning){
                stopTimer();
            } else{
                startTimer();
            }
        }

        public void startTimer(){
            countDownTimer = new CountDownTimer(timeLeftInMilliseconds, 1000) {
                @Override
                public void onTick(long l) {
                    timeLeftInMilliseconds = l;
                    updateTimer();
                }

                @Override
                public void onFinish() {

                }
            }.start();

            countdownButton.setText("PAUSE");
            timerRunning = true;
        }

        public void stopTimer(){
            countDownTimer.cancel();
            countdownButton.setText("START");
            timerRunning = false;
        }

        public void updateTimer(){
            int minutes = (int) timeLeftInMilliseconds / 60000;
            int seconds = (int) timeLeftInMilliseconds % 60000 / 1000;

            String timeLeftText;

            timeLeftText = "" + minutes;
            timeLeftText += ":";
            if(seconds < 10)
                timeLeftText += "0";
            timeLeftText+=seconds;

            countdownText.setText(timeLeftText);

        }
}

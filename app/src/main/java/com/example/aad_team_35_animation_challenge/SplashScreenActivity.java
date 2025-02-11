package com.example.aad_team_35_animation_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.aad_team_35_animation_challenge.auth.AuthActivity;
import com.example.aad_team_35_animation_challenge.onboarding.OnBoardingActivity;


public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(
                        new Intent(SplashScreenActivity.this, OnBoardingActivity.class)
                );

                finish();
            }
        }, 1500);
    }
}

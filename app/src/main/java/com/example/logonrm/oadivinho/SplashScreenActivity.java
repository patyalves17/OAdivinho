package com.example.logonrm.oadivinho;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Timer;
import java.util.TimerTask;
import android.content.Intent;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                finish();
                Intent intent = new Intent();
                intent.setClass(SplashScreenActivity.this, MainActivity.class);
                startActivity(intent);
            }
        }, 6000);
    }
}

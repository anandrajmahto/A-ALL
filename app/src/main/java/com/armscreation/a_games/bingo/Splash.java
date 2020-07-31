package com.armscreation.a_games.bingo;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //   requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        //  getSupportActionBar().hide(); //hide the title bar

        setContentView(R.layout.activity_splash);


        Thread myThread;
        myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);

                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        myThread.start();
    }

}
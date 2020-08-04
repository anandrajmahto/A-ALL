package com.armscreation.a_games.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.armscreation.a_games.R;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//hide the top dock
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        //   requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        //  getSupportActionBar().hide(); //hide the title bar

        setContentView(R.layout.activity_splash);


        Thread myThread;
        myThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(2000);

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
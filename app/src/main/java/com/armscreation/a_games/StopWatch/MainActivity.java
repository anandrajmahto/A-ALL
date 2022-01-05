package com.armscreation.a_games.StopWatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.armscreation.a_games.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);//hide the top dock
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_main_stopwatch);


    }
    @Override
    public void onSaveInstanceState(
            Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        int seconds=0;
        savedInstanceState
                .putInt("seconds", seconds);
        boolean running=true;
        savedInstanceState
                .putBoolean("running", running);
        boolean wasRunning= true;
        savedInstanceState
                .putBoolean("wasRunning", wasRunning);
    }

}
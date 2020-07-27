package com.armscreation.a_games;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.armscreation.a_games.fragment.game;
import com.moos.navigation.BottomBarLayout;
import com.moos.navigation.BottomTabView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomBarLayout bottomBarLayout = findViewById(R.id.navigation_bar_vertical);

        BottomTabView tab_home = new BottomTabView(getApplicationContext());
        tab_home.setTabIcon(R.drawable.work_edit_sticker_unselected_state);

        tab_home.setTabTitle("Home");
        tab_home.setSelectedColor(Color.parseColor("#f3566a"));
        //tab_home.setUnselectedColor(Color.parseColor("#f65656"));

        BottomTabView tab_look = new BottomTabView(getApplicationContext());
        tab_look.setTabIcon(R.drawable.work_edit_words_unselected_state);

        tab_look.setTabTitle("Discover");
        tab_look.setSelectedColor(Color.parseColor("#f3566a"));
        //tab_look.setUnselectedColor(Color.parseColor("#f65656"));


        BottomTabView tab_mine = new BottomTabView(getApplicationContext());
        tab_mine.setTabIcon(R.drawable.work_edit_music_unselected_state);
        tab_mine.setSelectedColor(Color.parseColor("#f3566a"));
        tab_mine.setTabTitle("Mine");
        //tab_mine.setUnreadCount(100);
        //tab_mine.setSelectedTabIcon(R.drawable.user_selected);


        replaceFragment(new game());

        bottomBarLayout
                .addTab(tab_home)
                .addTab(tab_look)
                .addTab(tab_mine)

                .create(new BottomBarLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(BottomTabView tab) {
                        Log.e(TAG, "onTabSelected: =="+tab.getTabPosition() );
                        switch (tab.getTabPosition()){
                            case 0:
                                replaceFragment(new game());
                                break;

                            case 1:
                                replaceFragment(new game());
                                break;

                            case 2:
                                replaceFragment(new game());
                                break;
                        }
                    }

                    @Override
                    public void onTabUnselected(BottomTabView tab) {

                    }

                    @Override
                    public void onTabReselected(BottomTabView tab) {

                    }
                });
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.fragment_container, fragment);
        transaction.commit();
    }

}

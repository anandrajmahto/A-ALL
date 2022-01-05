package com.armscreation.a_all;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.armscreation.a_all.fragment.discover;
import com.armscreation.a_all.fragment.home;
import com.armscreation.a_all.fragment.profile;
import com.moos.navigation.BottomBarLayout;
import com.moos.navigation.BottomTabView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide(); //hide the title bar
        setContentView(R.layout.activity_main);

        BottomBarLayout bottomBarLayout = findViewById(R.id.navigation_bar_vertical);

        BottomTabView tab_home = new BottomTabView(getApplicationContext());
        tab_home.setTabIcon(R.drawable.home);

        tab_home.setTabTitle("Home");
        tab_home.setSelectedColor(Color.parseColor("#f3566a"));
        tab_home.setTabIconOnly(true);
        tab_home.setTabIconSize(30);
        //tab_home.setUnselectedColor(Color.parseColor("#f65656"));

        BottomTabView tab_discover = new BottomTabView(getApplicationContext());
        tab_discover.setTabIcon(R.drawable.search);

        tab_discover.setTabTitle("Discover");
        tab_discover.setSelectedColor(Color.parseColor("#f3566a"));
        tab_discover.setTabIconOnly(true);
        tab_discover.setTabIconSize(30);
        //tab_discover.setUnselectedColor(Color.parseColor("#f65656"));


        BottomTabView tab_profile = new BottomTabView(getApplicationContext());
        tab_profile.setTabIcon(R.drawable.profile);
        tab_profile.setSelectedColor(Color.parseColor("#f3566a"));
        tab_profile.setTabTitle("Profile");
        tab_profile.setTabIconOnly(true);
        tab_profile.setTabIconSize(30);
        //tab_profile.setUnreadCount(100);
        //tab_profile.setSelectedTabIcon(R.drawable.user_selected);


        replaceFragment(new home());

        bottomBarLayout
                .addTab(tab_home)
                .addTab(tab_discover)
                .addTab(tab_profile)

                .create(new BottomBarLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(BottomTabView tab) {
                        Log.e(TAG, "onTabSelected: =="+tab.getTabPosition() );
                        switch (tab.getTabPosition()){
                            case 0:
                                replaceFragment(new home());
                                break;

                            case 1:
                                replaceFragment(new discover());
                                break;

                            case 2:
                                replaceFragment(new profile());
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

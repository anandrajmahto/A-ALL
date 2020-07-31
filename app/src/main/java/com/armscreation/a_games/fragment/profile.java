package com.armscreation.a_games.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.armscreation.a_games.R;


public class profile extends Fragment {


    public profile() {
        // Required empty public co nstructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.profile, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {

    }
}

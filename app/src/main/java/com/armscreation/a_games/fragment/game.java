package com.armscreation.a_games.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.armscreation.a_games.R;


public class game extends Fragment {


    private TextView textView;

    public game() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.game, container, false);
        initView(view);
        return view;
    }

    private void initView(View view){
        textView = view.findViewById(R.id.fm_content_text);
        textView.setText("content");
    }
}

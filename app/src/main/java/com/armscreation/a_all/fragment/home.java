package com.armscreation.a_all.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.armscreation.a_all.R;


public class home extends Fragment {
    CardView tictactoe, bingo, chain_reaction, chain_reaction_pro, chain_reaction_beta,StopWatch;

    public home() {
        // Required empty public co nstructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.home, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        tictactoe = view.findViewById(R.id.tictactoe);
        bingo = view.findViewById(R.id.bingo);
        chain_reaction = view.findViewById(R.id.chain_reaction);
        chain_reaction_pro = view.findViewById(R.id.chain_reaction_pro);
        chain_reaction_beta = view.findViewById(R.id.chain_reaction_beta);
        StopWatch=view.findViewById(R.id.StopWatch);
        tictactoe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), com.armscreation.a_all.tictactoe.Splash.class);
                startActivity(intent);

            }
        });

        bingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), com.armscreation.a_all.bingo.Splash.class);
                startActivity(intent);
            }
        });

        chain_reaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), com.armscreation.a_all.chain.Splash.class);
                startActivity(intent);
            }
        });

        chain_reaction_pro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getContext(), "Comming soon ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), com.armscreation.a_all.chainpro.Splash.class);
                startActivity(intent);
            }
        });

        chain_reaction_beta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getContext(), "Comming soon ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), com.armscreation.a_all.chain_beta.Splash.class);
                startActivity(intent);
            }
        });
        StopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getContext(), "Comming soon ", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getContext(), com.armscreation.a_all.StopWatch.Splash.class);
                startActivity(intent);
            }
        });
    }

}

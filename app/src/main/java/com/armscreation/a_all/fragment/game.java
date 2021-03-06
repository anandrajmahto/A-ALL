package com.armscreation.a_all.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.armscreation.a_all.R;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;


public class game extends Fragment {

    private TextView textView;

    public game() {
        // Required empty public co nstructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.game, container, false);
        initView(view);
        return view;
    }

    private void initView(View view) {
        MobileAds.initialize(getContext(), new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });


        final InterstitialAd mInterstitialAd = new InterstitialAd(getContext());
        mInterstitialAd.setAdUnitId("ca-app-pub-3273060511389671/8768994810");

        //  final AdRequest adRequestInterstitial = new AdRequest.Builder().addTestDevice("A36331EE1303A81960B3E2A6BE885C33").build();
        // mInterstitialAd.loadAd(adRequestInterstitial);
        mInterstitialAd.loadAd(new AdRequest.Builder().build());


        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(getContext(), "onAdLoaded()", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdFailedToLoad(int errorCode) {
                Log.d("as", "asd");
                //    mInterstitialAd.loadAd(adRequestInterstitial);
                // mInterstitialAd.loadAd(new AdRequest.Builder().build());
                Toast.makeText(getActivity(), "onAdFailedToLoad() with error code: " + errorCode, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onAdClosed() {

            }
        });

        textView = view.findViewById(R.id.fm_content_text);
        textView.setText("content");
        Button mMyButton = view.findViewById(R.id.mMyButton);
        mMyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mInterstitialAd.isLoaded()) {
                    mInterstitialAd.show();
                } else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.");
                }
            }
        });
    }
}

package com.kalvinkao.guideforvalorant.ui.bombtimer;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;


public class BombTimer extends Fragment {
    public CountDownTimer countDownTimer;
    private final long interval = 100;
    int secondsLeft = 0;
    /* access modifiers changed from: private */
    public Button startB;
    private final long startTime = 45000;
    public TextView text;
    /* access modifiers changed from: private */
    public boolean timerHasStarted = false;


    /* access modifiers changed from: protected */
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_bombtimer, container, false);
        MainActivity.previousTitle = "Home";


        startB = (Button) root.findViewById(R.id.button);
        startB.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (!timerHasStarted) {
                    countDownTimer.start();
                    timerHasStarted = true;
                    startB.setText("STOP");
                    return;
                }
                countDownTimer.cancel();
                timerHasStarted = false;
                startB.setText("RESTART");
            }
        });

        text = (TextView) root.findViewById(R.id.bombtime);
        countDownTimer = new MyCountDownTimer(startTime, 100);

        return root;
    }

    public class MyCountDownTimer extends CountDownTimer {
        public MyCountDownTimer(long startTime, long interval) {
            super(startTime, interval);
        }

        @SuppressLint("SetTextI18n")
        public void onTick(long ms) {
            if (Math.round(((float) ms) / 1000.0f) != secondsLeft) {
                secondsLeft = Math.round(((float) ms) / 1000.0f);
                text.setText("" + secondsLeft);
            }
            Log.i("test", "ms=" + ms + " till finished=" + secondsLeft);
        }

        @SuppressLint("SetTextI18n")
        public void onFinish() {
            text.setText("0");
            startB.setText("RESTART");
            countDownTimer.cancel();
            timerHasStarted = false;
        }
    }


}





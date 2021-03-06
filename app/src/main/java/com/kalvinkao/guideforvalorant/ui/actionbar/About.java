package com.kalvinkao.guideforvalorant.ui.actionbar;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.kalvinkao.guideforvalorant.R;

import static com.kalvinkao.guideforvalorant.MainActivity.ads_on;


public class About extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);

        // About:
        TextView about = (TextView) findViewById(R.id.about_txt1);
        String aboutText = "Guide for Valorant is a fan-made guide app for the first person shooter game Valorant by Riot Games Inc." +
                "<br><br>For any complaints or feedback, please email me here: <a href=\"mailto:kaokalvin@gmail.com\">kaokalvin@gmail.com</a>";
        about.setText(Html.fromHtml(aboutText));
        about.setMovementMethod(LinkMovementMethod.getInstance());
        // Bottom Ads
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdView mAdViewBot = findViewById(R.id.adViewBot);
        AdRequest adRequest = new AdRequest.Builder().build();
        if (ads_on) {
            mAdViewBot.loadAd(adRequest);
        }
        // Back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}

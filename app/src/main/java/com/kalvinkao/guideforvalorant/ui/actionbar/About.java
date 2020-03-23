package com.kalvinkao.guideforvalorant.ui.actionbar;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.tabs.TabLayout;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.agents.cypher.main.SectionsPagerAdapter;

import static com.kalvinkao.guideforvalorant.MainActivity.ads_on;


public class About extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_about);

        // About:
        TextView about = (TextView) findViewById(R.id.about_txt1);
        String aboutText = "Guide for Valorant is an unofficial guide app for the upcoming game Valorant. I spent a lot of time working on this app to help players of Valorant learn the game. " +
                "I'm still learning to constantly improve my programming skills to try and make the best app for the community so please bare with me. " +
                "I will try my best to update this app as soon as I am free so stay tuned. " +
                "<br><br>If you need to contact me please click here: <a href=\"mailto:kaokalvin@gmail.com\">kaokalvin@gmail.com</a>";
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

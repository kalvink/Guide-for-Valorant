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


public class Credits extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_credits);

        // Credits:
        TextView email = (TextView) findViewById(R.id.developer);
        String emailText = "Developer: " +
                "<br>Kalvin Kao" +
                "<br><a href=\"mailto:kaokalvin@gmail.com\">kaokalvin@gmail.com</a> " +
                "<br>" +
                "<br>Italian Translator:" +
                "<br>Nicola \"SirNikoP\" Porceddu" +
                "<br><a href=\"mailto:nicola.porceddu@hotmail.com\">nicola.porceddu@hotmail.com</a>";
        email.setText(Html.fromHtml(emailText));
        email.setMovementMethod(LinkMovementMethod.getInstance());


        // Riot Credits
        TextView art_credits = (TextView) findViewById(R.id.credits_text1);
        String creditTxt = "Valorant Illustrations, Assets, and In Game Screenshots by: <a href='https://www.riotgames.com/'>Riot Games</a>. <br><br>Incompliance with Riot's <a href='https://www.riotgames.com/en/legal'>Legal Use</a> <br><br> Icons: <a target=\"_blank\" href=\"https://icons8.com/icons/set/bomb\">Atomic Bomb icon</a> icon by <a target=\"_blank\" href=\"https://icons8.com\">Icons8</a> ";
        art_credits.setText(Html.fromHtml(creditTxt));
        art_credits.setMovementMethod(LinkMovementMethod.getInstance());

        // Disclaimer
        TextView disclaimer = (TextView) findViewById(R.id.credits_disclaimer);
        String disc_Txt = "Disclaimer:<br>This is an unofficial fan-made guide app based on the video game <a href='https://playvalorant.com/'>Valorant</a> by Riot Games. All intellectual property of Valorant are owned by Riot Games. The trademark Valorant is owned by Riot Games. This app is not endorsed by Riot Games and does not represent or reflect the opinions of Riot Games.";
        disclaimer.setText(Html.fromHtml(disc_Txt));
        disclaimer.setMovementMethod(LinkMovementMethod.getInstance());

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

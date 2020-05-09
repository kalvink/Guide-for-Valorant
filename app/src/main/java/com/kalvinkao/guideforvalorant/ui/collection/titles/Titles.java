package com.kalvinkao.guideforvalorant.ui.collection.titles;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;

import java.util.ArrayList;

import static com.kalvinkao.guideforvalorant.MainActivity.ads_on;

public class Titles extends AppCompatActivity {

    String[] titles = {
            "ALL STAR",
            "ASCENDANT",
            "BALLISTIC",
            "BIOHAZARD",
            "CATASTROPHIC",
            "COACH",
            "CONCUSSIVE",
            "DARING",
            "DEADEYE",
            "DOCTOR",
            "ENLIGHTENED",
            "FIRST",
            "FLASHY",
            "GENIUS",
            "GRENADIER",
            "HARBINGER",
            "HASTY",
            "HIGH COMMAND",
            "HOTSHOT",
            "HUNTER",
            "HUNTSMAN",
            "HURRICANE",
            "INFORMANT",
            "MAELSTROM",
            "MIND THIEF",
            "OLD DOG",
            "RECRUIT",
            "REVENANT",
            "SHARPSHOOTER",
            "SOLAR FLAIR",
            "SPECTRAL",
            "SWIFT",
            "TECHIE",
            "TECTONIC",
            "TOXIC",
            "V1.0",
            "VENOMOUS",
            "VETERAN",
            "WARDEN",
            "WARHEAD",
            "WATCHDOG"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_titles);
        ArrayList userList = getListData();
        final ListView lv = (ListView) findViewById(R.id.user_list);
        lv.setAdapter(new CustomListAdapter(this, userList));

        MainActivity.previousTitle = "Home";

        // Bottom Ads
        MobileAds.initialize(this, new

                OnInitializationCompleteListener() {
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

    private ArrayList getListData() {
        ArrayList<ListItem> results = new ArrayList<>();
        for (String s : titles) {
            ListItem title = new ListItem();
            title.setName(s);
            results.add(title);
        }
        return results;
    }
}

package com.kalvinkao.guideforvalorant.ui.collection.playercards;

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;

import static com.kalvinkao.guideforvalorant.MainActivity.ads_on;

public class PlayerCards extends AppCompatActivity {

    ImageView selectedImage;
    static Integer[] card_ids = {
            R.drawable.card1,
            R.drawable.card2,
            R.drawable.card3,
            R.drawable.card4,
            R.drawable.card5,
            R.drawable.card6,
            R.drawable.card7,
            R.drawable.card8,
            R.drawable.card9,
            R.drawable.card10,
            R.drawable.card11,
            R.drawable.card12,
            R.drawable.card13,
            R.drawable.card14,
            R.drawable.card15,
            R.drawable.card16,
            R.drawable.card17,
            R.drawable.card18,
            R.drawable.card19,
            R.drawable.card20,
            R.drawable.card21,
            R.drawable.card22,
            R.drawable.card23,
            R.drawable.card24,
            R.drawable.card25,
            R.drawable.card26,
            R.drawable.card27,
            R.drawable.card28,
            R.drawable.card29,
            R.drawable.card30,
            R.drawable.card31
    };
    String[] card_titles = {
            "ARM MECHANIC", "BALANCED", "BLACK DAWN", "CODE RED", "COFFEE", "CYPHER", "DEFAULT", "HARMONY", "HEAVY FORMATIONS", "JETT ULT", "JETT", "KINGDOM SITE", "OFF YOUR FEET", "OMEN TELEPORT", "OMEN ULT",
            "OPEN UP THE SKY!", "PHOENIX DOWN", "PHOENIX'S SUN", "RADIANITE EXPLOSION", "RAZE UP", "REAVER KNIFE", "SKYBOX", "SOVA POSE", "SOVA ULT", "STAINED GLASS", "STRIKE A POSE", "TINKERER", "TINKERER", "V PROTOCOL",
            "VIPER LAB COAT", "VIPER ULT"
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_playercards);

        final Gallery gallery = (Gallery) findViewById(R.id.gallery);
        selectedImage = (ImageView) findViewById(R.id.imageView);
        final TextView cardTitle = (TextView) findViewById(R.id.galleryText);
        gallery.setSpacing(10);
        final GalleryImageAdapter galleryImageAdapter = new GalleryImageAdapter(this);
        gallery.setAdapter(galleryImageAdapter);


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(card_ids[position]);
                cardTitle.setText(card_titles[position]);

            }
        });
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


    public static class GalleryImageAdapter extends BaseAdapter {
        private Context mContext;


        public GalleryImageAdapter(Context context) {
            mContext = context;
        }

        public int getCount() {
            return card_ids.length;
        }

        public Object getItem(int position) {
            return position;
        }

        public long getItemId(int position) {
            return position;
        }


        // Override this method according to your need
        public View getView(int index, View view, ViewGroup viewGroup) {
            // TODO Auto-generated method stub
            ImageView i = new ImageView(mContext);

            i.setImageResource(card_ids[index]);
            i.setLayoutParams(new Gallery.LayoutParams(250, 300));

            i.setScaleType(ImageView.ScaleType.FIT_XY);


            return i;
        }


    }
}

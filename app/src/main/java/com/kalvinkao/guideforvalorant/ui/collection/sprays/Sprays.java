package com.kalvinkao.guideforvalorant.ui.collection.sprays;

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

public class Sprays extends AppCompatActivity {

    ImageView selectedImage;
    static Integer[] spray_ids = {
            R.drawable.spray1,
            R.drawable.spray2,
            R.drawable.spray3,
            R.drawable.spray4,
            R.drawable.spray5,
            R.drawable.spray6,
            R.drawable.spray7,
            R.drawable.spray8,
            R.drawable.spray9,
            R.drawable.spray10,
            R.drawable.spray11,
            R.drawable.spray12,
            R.drawable.spray13,
            R.drawable.spray14,
            R.drawable.spray15,
            R.drawable.spray16,
            R.drawable.spray17,
            R.drawable.spray18,
            R.drawable.spray19,
            R.drawable.spray20,
            R.drawable.spray21,
            R.drawable.spray22,
            R.drawable.spray23,
            R.drawable.spray24
    };
    String[] spray_titles = {
            "ABSOLUTE PRECISION", "ALL GOOD!", "BOOM", "BOUNTY HUNTER", "BREACH", "BULLSEYE", "CHICKEN", "DEADLY TOXIN", "DRONE", "GLHF", "GUN SHOW", "KEEP UP!", "LIFELINE", "ORBITAL STRIKE", "POISON GAS",
            "PUSH!", "SALT", "SUPER SOLAR FLARE", "THE ENIGMA", "THE KING", "THE SHADOW", "VALORANT", "WATCHFUL OCULUS", "WINK"
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_sprays);

        final Gallery gallery = (Gallery) findViewById(R.id.gallery);
        selectedImage = (ImageView) findViewById(R.id.imageView);
        final TextView sprayTitle = (TextView) findViewById(R.id.galleryText);
        gallery.setSpacing(10);
        final GalleryImageAdapter galleryImageAdapter = new GalleryImageAdapter(this);
        gallery.setAdapter(galleryImageAdapter);


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(spray_ids[position]);
                sprayTitle.setText(spray_titles[position]);

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
            return spray_ids.length;
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

            i.setImageResource(spray_ids[index]);
            i.setLayoutParams(new Gallery.LayoutParams(300, 300));

            i.setScaleType(ImageView.ScaleType.FIT_XY);


            return i;
        }




    }
}

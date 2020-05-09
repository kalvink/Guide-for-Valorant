package com.kalvinkao.guideforvalorant.ui.collection.gunbuddy;

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
import com.kalvinkao.guideforvalorant.OnBackPressed;
import com.kalvinkao.guideforvalorant.R;

import static com.kalvinkao.guideforvalorant.MainActivity.ads_on;

public class Gunbuddy extends AppCompatActivity implements OnBackPressed {

    ImageView selectedImage;
    static Integer[] gunbuddy_ids = {
            R.drawable.gunbuddy1,
            R.drawable.gunbuddy2,
            R.drawable.gunbuddy3,
            R.drawable.gunbuddy4,
            R.drawable.gunbuddy5,
            R.drawable.gunbuddy6,
            R.drawable.gunbuddy7,
            R.drawable.gunbuddy8,
            R.drawable.gunbuddy9,
            R.drawable.gunbuddy10,
            R.drawable.gunbuddy11,
            R.drawable.gunbuddy12
    };
    String[] gunbuddy_titles = {
            "BREACH'S GUNBUDDY", "BRIMSTONE'S GUNBUDDY", "CLOSED BETA GUNBUDDY", "CYPHER'S GUNBUDDY", "JETT'S GUNBUDDY", "OMEN'S GUNBUDDY", "PHOENIX'S GUNBUDDY", "RAZE'S GUNBUDDY",
            "SAGE'S GUNBUDDY", "SOVA'S GUNBUDDY", "VALORANT GUNBUDDY", "VIPER'S GUNBUDDY"
    };
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_gunbuddys);
        final Gallery gallery = (Gallery) findViewById(R.id.gallery);
        selectedImage = (ImageView) findViewById(R.id.imageView);
        final TextView gunbuddyTitle = (TextView) findViewById(R.id.galleryText);
        gallery.setSpacing(10);
        final GalleryImageAdapter galleryImageAdapter = new GalleryImageAdapter(this);
        gallery.setAdapter(galleryImageAdapter);

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(gunbuddy_ids[position]);
                gunbuddyTitle.setText(gunbuddy_titles[position]);

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
            return gunbuddy_ids.length;
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

            i.setImageResource(gunbuddy_ids[index]);
            i.setLayoutParams(new Gallery.LayoutParams(300, 300));

            i.setScaleType(ImageView.ScaleType.FIT_XY);


            return i;
        }





    }
}

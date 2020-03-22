package com.kalvinkao.guideforvalorant.ui.actionbar;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.agents.cypher.main.SectionsPagerAdapter;


public class Credits extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_credits);

        // Developer:
        TextView email = (TextView) findViewById(R.id.developer);
        String emailText = "Developer: Kalvin Kao<br>Send email: <a href=\"mailto:kaokalvin@gmail.com\">kaokalvin@gmail.com</a>";
        email.setText(Html.fromHtml(emailText));
        email.setMovementMethod(LinkMovementMethod.getInstance());


        // Credits
        TextView art_credits = (TextView) findViewById(R.id.credits_text1);
        String creditTxt = "Brimstone Icon Art: by <a href='https://www.instagram.com/spiro.hugo/'>Spiro.Hugo</a><br><br>Weapon Target Icon: <br><a href='https://www.flaticon.com/free-icon/target_149231'>https://www.flaticon.com/free-icon/target_149231<a/>" +
                "<br><br>Valorant Illustrations and In Game Screenshots by: <a href='https://www.riotgames.com/'>Riot Games</a>";
        art_credits.setText(Html.fromHtml(creditTxt));
        art_credits.setMovementMethod(LinkMovementMethod.getInstance());

        // Disclaimer
        TextView disclaimer = (TextView) findViewById(R.id.credits_disclaimer);
        String disc_Txt = "Disclaimer:\nThis is an unofficial fan-made guide app based on the video game <a href='https://playvalorant.com/'>Valorant</a> by Riot Games. All intellectual property of Valorant are owned by Riot Games. The trademark Valorant is owned by Riot Games. This app is not endorsed by Riot Games and does not represent or reflect the opinions of Riot Games.";
        disclaimer.setText(Html.fromHtml(disc_Txt));
        disclaimer.setMovementMethod(LinkMovementMethod.getInstance());

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

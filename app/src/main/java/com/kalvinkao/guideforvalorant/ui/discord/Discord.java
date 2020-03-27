package com.kalvinkao.guideforvalorant.ui.discord;

import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.fragment.app.Fragment;


import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;


public class Discord extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_discord, container, false);
        MainActivity.previousTitle = "Home";



        TextView disc = (TextView) root.findViewById(R.id.txt_discord);
        String discordTxt = "Join the Discord: <a href='https://discord.gg/hTyH7hM'>Click Here</a>";
        disc.setText(Html.fromHtml(discordTxt));
        disc.setMovementMethod(LinkMovementMethod.getInstance());

        return root;
    }


}

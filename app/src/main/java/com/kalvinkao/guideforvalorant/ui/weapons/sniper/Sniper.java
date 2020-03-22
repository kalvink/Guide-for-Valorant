package com.kalvinkao.guideforvalorant.ui.weapons.sniper;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.OnBackPressed;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.agents.brimstone.Brimstone;
import com.kalvinkao.guideforvalorant.ui.agents.cypher.Cypher;
import com.kalvinkao.guideforvalorant.ui.agents.jett.Jett;
import com.kalvinkao.guideforvalorant.ui.agents.omen.Omen;
import com.kalvinkao.guideforvalorant.ui.agents.phoenix.Phoenix;
import com.kalvinkao.guideforvalorant.ui.agents.sage.Sage;
import com.kalvinkao.guideforvalorant.ui.agents.sova.Sova;
import com.kalvinkao.guideforvalorant.ui.agents.viper.Viper;

public class Sniper extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_sniper, container, false);


        MainActivity.previousTitle = "Weapons";




        return root;
    }


    @Override
    public void onBackPressed() {
        getActivity().getSupportFragmentManager().popBackStack();
    }
}
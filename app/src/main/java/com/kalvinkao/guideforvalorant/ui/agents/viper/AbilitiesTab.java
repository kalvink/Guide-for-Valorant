package com.kalvinkao.guideforvalorant.ui.agents.viper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.R;


//Our class extending fragment
public class AbilitiesTab extends Fragment {

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
        return inflater.inflate(R.layout.fragment_viper_tab_abilities, container, false);
    }
}
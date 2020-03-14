package com.kalvinkao.guideforvalorant.ui.agents.viper;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.R;


public class StoryTab extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_viper_tab_story, container, false);
    }
}
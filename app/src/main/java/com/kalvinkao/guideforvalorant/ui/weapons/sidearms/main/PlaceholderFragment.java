package com.kalvinkao.guideforvalorant.ui.weapons.sidearms.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.weapons.sidearms.Pistol;


public class PlaceholderFragment extends Fragment {

    private static int x;
    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    private SectionsPagerAdapter sectionsPagerAdapter;
    public static int[] tab_fragments = {
            //0-2
            R.layout.fragment_defaultpistol, R.layout.fragment_defaultpistol_tips, R.layout.fragment_defaultpistol_skins,
            //3-5
            R.layout.fragment_shorty, R.layout.fragment_shorty_tips, R.layout.fragment_shorty_skins,
            //6-8
            R.layout.fragment_frenzy, R.layout.fragment_frenzy_tips, R.layout.fragment_frenzy_skins,
            //9-11
            R.layout.fragment_ghost, R.layout.fragment_ghost_tips, R.layout.fragment_ghost_skins,
            //12-14
            R.layout.fragment_sheriff, R.layout.fragment_sheriff_tips, R.layout.fragment_sheriff_skins};

    public static PlaceholderFragment newInstance(int index) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_SECTION_NUMBER, index);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageViewModel = ViewModelProviders.of(this).get(PageViewModel.class);
        int index = 1;
        if (getArguments() != null) {
            index = getArguments().getInt(ARG_SECTION_NUMBER);
        }
        pageViewModel.setIndex(index);
    }

    View root;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {

        switch (getArguments().getInt(ARG_SECTION_NUMBER)) {
            case 1: {
                root = inflater.inflate(tab_fragments[x], container, false);
                break;
            }
            case 2: {
                root = inflater.inflate(tab_fragments[x + 1], container, false);
                break;
            }
            case 3: {
                root = inflater.inflate(tab_fragments[x + 2], container, false);
                break;
            }
        }

        return root;
    }

    public static void setX(int num) {
        x = num;
    }


}


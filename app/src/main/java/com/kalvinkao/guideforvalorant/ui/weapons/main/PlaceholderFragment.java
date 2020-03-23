package com.kalvinkao.guideforvalorant.ui.weapons.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.guideforvalorant.R;


public class PlaceholderFragment extends Fragment {

    private static int x;
    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    private SectionsPagerAdapter sectionsPagerAdapter;
    public static int[] tab_fragments = {

            //SIDEARMS
            //0-2
            R.layout.fragment_defaultpistol, R.layout.fragment_defaultpistol_tips, R.layout.fragment_defaultpistol_skins,
            //3-5
            R.layout.fragment_shorty, R.layout.fragment_shorty_tips, R.layout.fragment_shorty_skins,
            //6-8
            R.layout.fragment_frenzy, R.layout.fragment_frenzy_tips, R.layout.fragment_frenzy_skins,
            //9-11
            R.layout.fragment_ghost, R.layout.fragment_ghost_tips, R.layout.fragment_ghost_skins,
            //12-14
            R.layout.fragment_sheriff, R.layout.fragment_sheriff_tips, R.layout.fragment_sheriff_skins,

            //SMGS
            //15-17
            R.layout.fragment_stinger, R.layout.fragment_stinger_tips, R.layout.fragment_stinger_skins,
            //18-20
            R.layout.fragment_spectre, R.layout.fragment_spectre_tips, R.layout.fragment_spectre_skins,

            //RIFLES
            //21-23
            R.layout.fragment_bulldog, R.layout.fragment_bulldog_tips, R.layout.fragment_bulldog_skins,
            //24-26
            R.layout.fragment_guardian, R.layout.fragment_guardian_tips, R.layout.fragment_guardian_skins,
            //27-29
            R.layout.fragment_phantom, R.layout.fragment_phantom_tips, R.layout.fragment_phantom_skins,
            //30-32
            R.layout.fragment_vandal, R.layout.fragment_vandal_tips, R.layout.fragment_vandal_skins,

            //Snipers
            //33-35
            R.layout.fragment_marshal, R.layout.fragment_marshal_tips, R.layout.fragment_marshal_skins,
            //36-38
            R.layout.fragment_operator, R.layout.fragment_operator_tips, R.layout.fragment_operator_skins,

            //Heavy
            //39-41
            R.layout.fragment_ares, R.layout.fragment_ares_tips, R.layout.fragment_ares_skins,
            //42-44
            R.layout.fragment_odin, R.layout.fragment_odin_tips, R.layout.fragment_odin_skins,

            //Shields
            //45-47
            R.layout.fragment_lightshield, R.layout.fragment_lightshield_tips, R.layout.fragment_lightshield_skins,
            //48-50
            R.layout.fragment_heavyshield, R.layout.fragment_heavyshield_tips, R.layout.fragment_heavyshield_skins,

            //Shotguns
            //51-53
            R.layout.fragment_heavyshield, R.layout.fragment_stinger_tips, R.layout.fragment_stinger_skins,
            //54-56
            R.layout.fragment_spectre, R.layout.fragment_spectre_tips, R.layout.fragment_spectre_skins

    };



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


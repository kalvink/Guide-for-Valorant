package com.kalvinkao.guideforvalorant.ui.weapons.shields.main;

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

            //Shields
            //0-1
            R.layout.fragment_lightshield, R.layout.fragment_lightshield_tips,
            //2-3
            R.layout.fragment_heavyshield, R.layout.fragment_heavyshield_tips

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
        int index = 0;
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
        }

        return root;
    }

    public static void setX(int num) {
        x = num;
    }


}


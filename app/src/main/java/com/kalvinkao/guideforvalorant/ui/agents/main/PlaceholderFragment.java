package com.kalvinkao.guideforvalorant.ui.agents.main;

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

            //AGENTS
            //0-2
            R.layout.fragment_brimstone, R.layout.fragment_brimstone_tab_abilities, R.layout.fragment_brimstone_tab_gallery,
            //3-5
            R.layout.fragment_cypher, R.layout.fragment_cypher_tab_abilities, R.layout.fragment_cypher_tab_gallery,
            //6-8
            R.layout.fragment_jett, R.layout.fragment_jett_tab_abilities, R.layout.fragment_jett_tab_gallery,
            //9-11
            R.layout.fragment_omen, R.layout.fragment_omen_tab_abilities, R.layout.fragment_omen_tab_gallery,
            //12-14
            R.layout.fragment_phoenix, R.layout.fragment_phoenix_tab_abilities, R.layout.fragment_phoenix_tab_gallery,
            //15-17
            R.layout.fragment_sage, R.layout.fragment_sage_tab_abilities, R.layout.fragment_sage_tab_gallery,
            //18-20
            R.layout.fragment_sova, R.layout.fragment_sova_tab_abilities, R.layout.fragment_sova_tab_gallery,
            //21-23
            R.layout.fragment_viper, R.layout.fragment_viper_tab_abilities, R.layout.fragment_viper_tab_gallery,


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


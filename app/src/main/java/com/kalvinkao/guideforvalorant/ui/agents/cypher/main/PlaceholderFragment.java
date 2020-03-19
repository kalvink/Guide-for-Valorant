package com.kalvinkao.guideforvalorant.ui.agents.cypher.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.guideforvalorant.R;


public class PlaceholderFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private PageViewModel pageViewModel;
    private SectionsPagerAdapter sectionsPagerAdapter;

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
                root = inflater.inflate(R.layout.fragment_cypher, container, false);
                break;
            }
            case 2: {
                root = inflater.inflate(R.layout.fragment_cypher_tab_abilities, container, false);
                break;
            }
            //    case 3: {
            //        root = inflater.inflate(R.layout.fragment_viper_tab_story, container, false);
            //        break;
            //    }
            case 3: {
                root = inflater.inflate(R.layout.fragment_cypher_tab_gallery, container, false);
                break;
            }
        }
        return root;
    }


}


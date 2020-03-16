package com.kalvinkao.guideforvalorant.ui.agents.viper;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ViperFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ViperFragment extends Fragment {
    
    public ViperFragment() {
        // Required empty public constructor
    }

    public static ViperFragment newInstance(String param1, String param2) {
        ViperFragment fragment = new ViperFragment();
        Bundle args = new Bundle();


        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MainActivity.previousTitle = "Agents";

    }


    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_viper, container, false);
    }
}

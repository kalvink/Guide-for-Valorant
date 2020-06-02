package com.kalvinkao.guideforvalorant.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;

public class NewsFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_news, container, false);
        MainActivity.previousTitle = "Home";

        return root;
    }
}

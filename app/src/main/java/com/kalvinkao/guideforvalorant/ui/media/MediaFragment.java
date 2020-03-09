package com.kalvinkao.guideforvalorant.ui.media;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.guideforvalorant.R;

public class MediaFragment extends Fragment {

    private MediaViewModel mediaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        mediaViewModel =
                ViewModelProviders.of(this).get(MediaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_media, container, false);
        mediaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
            }
        });
        return root;
    }
}

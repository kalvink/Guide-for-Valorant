package com.kalvinkao.guideforvalorant.ui.weapons.rifles;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.OnBackPressed;
import com.kalvinkao.guideforvalorant.R;


public class Rifles extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_rifles, container, false);

        MainActivity.previousTitle = "Weapons";
        final CardView bulldog = root.findViewById(R.id.cv_bulldog);
        final CardView guardian = root.findViewById(R.id.cv_guardian);
        final CardView phantom = root.findViewById(R.id.cv_phantom);
        final CardView vandal = root.findViewById(R.id.cv_vandal);

        bulldog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Bulldog.class);
                root.getContext().startActivity(intent);
            }
        });
        guardian.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Guardian.class);
                root.getContext().startActivity(intent);
            }
        });
        phantom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phantom.class);
                root.getContext().startActivity(intent);
            }
        });
        vandal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Vandal.class);
                root.getContext().startActivity(intent);
            }
        });

        return root;
    }

    @Override
    public void onBackPressed() {
        getActivity().getSupportFragmentManager().popBackStack();
    }
}


package com.kalvinkao.guideforvalorant.ui.weapons.smgs;

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


public class SMGS extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_smg, container, false);

        MainActivity.previousTitle = "Weapons";
        final CardView stinger = root.findViewById(R.id.cv_stinger);
        final CardView spectre = root.findViewById(R.id.cv_spectre);


        stinger.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Stinger.class);
                root.getContext().startActivity(intent);
            }
        });
        spectre.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Spectre.class);
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


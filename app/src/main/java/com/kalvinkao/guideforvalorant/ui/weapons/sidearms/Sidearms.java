package com.kalvinkao.guideforvalorant.ui.weapons.sidearms;

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


public class Sidearms extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        final View root = inflater.inflate(R.layout.fragment_sidearms, container, false);

        MainActivity.previousTitle = "Weapons";
        final CardView pistol = root.findViewById(R.id.cv_defaultpistol);
        final CardView shorty = root.findViewById(R.id.cv_shorty);
        final CardView frenzy = root.findViewById(R.id.cv_frenzy);
        final CardView ghost = root.findViewById(R.id.cv_ghost);
        final CardView sheriff = root.findViewById(R.id.cv_sheriff);

        pistol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Pistol.class);
                root.getContext().startActivity(intent);
            }
        });
        shorty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Shorty.class);
                root.getContext().startActivity(intent);
            }
        });
        frenzy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Frenzy.class);
                root.getContext().startActivity(intent);
            }
        });
        ghost.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Ghost.class);
                root.getContext().startActivity(intent);
            }
        });
        sheriff.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sheriff.class);
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


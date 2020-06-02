package com.kalvinkao.guideforvalorant.ui.collection;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.navigation.NavigationView;
import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.OnBackPressed;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.collection.gunbuddy.Gunbuddy;
import com.kalvinkao.guideforvalorant.ui.collection.playercards.PlayerCards;
import com.kalvinkao.guideforvalorant.ui.collection.sprays.Sprays;
import com.kalvinkao.guideforvalorant.ui.collection.titles.Titles;
import com.kalvinkao.guideforvalorant.ui.weapons.sidearms.Sidearms;
import com.kalvinkao.guideforvalorant.ui.weapons.sniper.Marshal;

public class
CollectionFragment extends Fragment implements OnBackPressed {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_collection, container, false);
        MainActivity.previousTitle = "Home";

        final Button playercards = root.findViewById(R.id.btn_playercards);
        final Button sprays = root.findViewById(R.id.btn_sprays);
        final Button gunbuddy = root.findViewById(R.id.btn_gunbuddy);
        final Button titles = root.findViewById(R.id.btn_titles);

        final NavigationView navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);

        playercards.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PlayerCards.class);
                root.getContext().startActivity(intent);
                navigationView.getMenu().getItem(4).setChecked(true);
            }
        });
        sprays.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sprays.class);
                root.getContext().startActivity(intent);
                navigationView.getMenu().getItem(4).setChecked(true);
            }
        });

        gunbuddy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Gunbuddy.class);
                root.getContext().startActivity(intent);
                navigationView.getMenu().getItem(4).setChecked(true);
            }
        });
        titles.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Titles.class);
                root.getContext().startActivity(intent);
                navigationView.getMenu().getItem(4).setChecked(true);
            }
        });

        return root;
    }
    @Override
    public void onBackPressed() {
        getActivity().getSupportFragmentManager().popBackStack();
    }
}

package com.kalvinkao.guideforvalorant.ui.weapons;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.google.android.material.navigation.NavigationView;
import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.weapons.heavy.Heavy;
import com.kalvinkao.guideforvalorant.ui.weapons.rifles.Rifles;
import com.kalvinkao.guideforvalorant.ui.weapons.shields.Shields;
import com.kalvinkao.guideforvalorant.ui.weapons.shotguns.Shotguns;
import com.kalvinkao.guideforvalorant.ui.weapons.sidearms.Sidearms;
import com.kalvinkao.guideforvalorant.ui.weapons.smgs.SMGS;
import com.kalvinkao.guideforvalorant.ui.weapons.sniper.Sniper;

public class WeaponsFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_weapons, container, false);

        final Button b_sidearm = root.findViewById(R.id.btn_wep_sidearm);
        final Button b_smg = root.findViewById(R.id.btn_wep_smg);
        final Button b_shotgun = root.findViewById(R.id.btn_wep_shotguns);
        final Button b_rifle = root.findViewById(R.id.btn_wep_rifles);
        final Button b_sniper = root.findViewById(R.id.btn_wep_sniper);
        final Button b_heavy = root.findViewById(R.id.btn_wep_heavy);
        final Button b_shield = root.findViewById(R.id.btn_wep_shields);
        final NavigationView navigationView = (NavigationView) getActivity().findViewById(R.id.nav_view);

        b_sidearm.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Sidearms();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sidearms");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        b_smg.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new SMGS();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("SMG");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        b_shotgun.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Shotguns();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Shotguns");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        b_rifle.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Rifles();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Rifles");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        b_sniper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Sniper();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sniper");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        b_heavy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Heavy();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Heavy");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        b_shield.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new Shields();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Shields");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });

        MainActivity.previousTitle = "Home";
        return root;
    }
}

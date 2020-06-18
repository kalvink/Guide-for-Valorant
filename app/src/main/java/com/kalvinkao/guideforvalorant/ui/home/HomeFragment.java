package com.kalvinkao.guideforvalorant.ui.home;

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
import com.kalvinkao.guideforvalorant.ui.agents.AgentsFragment;
import com.kalvinkao.guideforvalorant.ui.info.InfoFragment;
import com.kalvinkao.guideforvalorant.ui.maps.MapsFragment;
import com.kalvinkao.guideforvalorant.ui.collection.CollectionFragment;
import com.kalvinkao.guideforvalorant.ui.spiketimer.SpikeTimer;
import com.kalvinkao.guideforvalorant.ui.weapons.WeaponsFragment;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final Button btn_agents = root.findViewById(R.id.btn_agents);
        final Button btn_weapons = root.findViewById(R.id.btn_weapons);
        final Button btn_maps = root.findViewById(R.id.btn_maps);
        final Button btn_collection = root.findViewById(R.id.btn_collection);
        final Button btn_btimer = root.findViewById(R.id.btn_btimer);
        final Button btn_info = root.findViewById(R.id.btn_info);
        final NavigationView navigationView = getActivity().findViewById(R.id.nav_view);

        btn_agents.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new AgentsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Agents");
                navigationView.getMenu().getItem(1).setChecked(true);
            }
        });
        btn_weapons.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new WeaponsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Weapons");
                navigationView.getMenu().getItem(2).setChecked(true);
            }
        });
        btn_maps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new MapsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Maps");
                navigationView.getMenu().getItem(3).setChecked(true);
            }
        });
        btn_collection.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new CollectionFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Collection");
                navigationView.getMenu().getItem(4).setChecked(true);
            }
        });
        btn_btimer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new SpikeTimer();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Spike Timer");
                navigationView.getMenu().getItem(5).setChecked(true);
            }
        });
        btn_info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new InfoFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Information");
                navigationView.getMenu().getItem(6).setChecked(true);
            }
        });


        return root;
    }
}

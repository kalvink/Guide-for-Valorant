package com.kalvinkao.guideforvalorant.ui.agents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.google.android.material.navigation.NavigationView;
import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;

import java.util.Objects;

public class AgentsFragment extends Fragment {

    private AgentsViewModel agentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agentsViewModel =
                ViewModelProviders.of(this).get(AgentsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_agents, container, false);

        final ImageButton viper = root.findViewById(R.id.btn_viper);
        final ImageButton cypher = root.findViewById(R.id.btn_cypher);
        final ImageButton jett = root.findViewById(R.id.btn_jett);
        final ImageButton sage = root.findViewById(R.id.btn_sage);
        final ImageButton brimstone = root.findViewById(R.id.btn_brimstone);
        final ImageButton phoenix = root.findViewById(R.id.btn_phoenix);
        final ImageButton sova = root.findViewById(R.id.btn_sova);
        final ImageButton omen = root.findViewById(R.id.btn_omen);

        viper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new ViperFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Viper");
            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new CypherFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Cypher");
            }
        });
        jett.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new JettFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Jett");
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new SageFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sage");
            }
        });
        brimstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new BrimstoneFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Brimstone");
            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new PhoenixFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Phoenix");
            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new SovaFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sova");
            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new OmenFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Omen");

            }
        });


        return root;
    }



}

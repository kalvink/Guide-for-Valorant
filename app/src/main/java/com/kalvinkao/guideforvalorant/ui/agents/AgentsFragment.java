package com.kalvinkao.guideforvalorant.ui.agents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.OnBackPressed;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.Viper;
import com.kalvinkao.guideforvalorant.ui.agents.viper.ViperFragment;

public class AgentsFragment extends Fragment implements OnBackPressed {

    private AgentsViewModel agentsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        agentsViewModel =
                ViewModelProviders.of(this).get(AgentsViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_agents, container, false);

        final ImageButton viper = root.findViewById(R.id.btn_viper);
        final ImageButton cypher = root.findViewById(R.id.btn_cypher);
        final ImageButton jett = root.findViewById(R.id.btn_jett);
        final ImageButton sage = root.findViewById(R.id.btn_sage);
        final ImageButton brimstone = root.findViewById(R.id.btn_brimstone);
        final ImageButton phoenix = root.findViewById(R.id.btn_phoenix);
        final ImageButton sova = root.findViewById(R.id.btn_sova);
        final ImageButton omen = root.findViewById(R.id.btn_omen);
        MainActivity.previousTitle = "Home";

        viper.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent intent = new Intent(getActivity(), Viper.class);
                root.getContext().startActivity(intent);



                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Viper");
            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new CypherFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Cypher");
            }
        });
        jett.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new JettFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Jett");
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new SageFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sage");
            }
        });
        brimstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new BrimstoneFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Brimstone");
            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new PhoenixFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Phoenix");
            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new SovaFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Sova");
            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new OmenFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).addToBackStack(null).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Omen");

            }
        });



        return root;
    }


    @Override
    public void onBackPressed(){
        getActivity().getSupportFragmentManager().popBackStack();
    }
}
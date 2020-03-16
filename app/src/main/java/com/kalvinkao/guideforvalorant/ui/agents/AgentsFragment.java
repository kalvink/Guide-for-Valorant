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
import com.kalvinkao.guideforvalorant.ui.agents.brimstone.BrimstoneFragment;
import com.kalvinkao.guideforvalorant.ui.agents.cypher.Cypher;
import com.kalvinkao.guideforvalorant.ui.agents.jett.JettFragment;
import com.kalvinkao.guideforvalorant.ui.agents.omen.OmenFragment;
import com.kalvinkao.guideforvalorant.ui.agents.phoenix.PhoenixFragment;
import com.kalvinkao.guideforvalorant.ui.agents.sage.SageFragment;
import com.kalvinkao.guideforvalorant.ui.agents.sova.SovaFragment;
import com.kalvinkao.guideforvalorant.ui.agents.viper.Viper;

public class AgentsFragment extends Fragment implements OnBackPressed {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

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
            }
        });
        cypher.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cypher.class);
                root.getContext().startActivity(intent);
            }
        });
        jett.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cypher.class);
                root.getContext().startActivity(intent);
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cypher.class);
                root.getContext().startActivity(intent);
            }
        });
        brimstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Cypher.class);
                root.getContext().startActivity(intent);
            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PhoenixFragment.class);
                root.getContext().startActivity(intent);
            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SovaFragment.class);
                root.getContext().startActivity(intent);
            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SovaFragment.class);
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
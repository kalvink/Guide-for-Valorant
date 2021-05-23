package com.kalvinkao.guideforvalorant.ui.agents;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.OnBackPressed;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.agents.breach.Breach;
import com.kalvinkao.guideforvalorant.ui.agents.brimstone.Brimstone;
import com.kalvinkao.guideforvalorant.ui.agents.cypher.Cypher;
import com.kalvinkao.guideforvalorant.ui.agents.jett.Jett;
import com.kalvinkao.guideforvalorant.ui.agents.killjoy.Killjoy;
import com.kalvinkao.guideforvalorant.ui.agents.omen.Omen;
import com.kalvinkao.guideforvalorant.ui.agents.phoenix.Phoenix;
import com.kalvinkao.guideforvalorant.ui.agents.raze.Raze;
import com.kalvinkao.guideforvalorant.ui.agents.reyna.Reyna;
import com.kalvinkao.guideforvalorant.ui.agents.sage.Sage;
import com.kalvinkao.guideforvalorant.ui.agents.sova.Sova;
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
        final ImageButton breach = root.findViewById(R.id.btn_breach);
        final ImageButton raze = root.findViewById(R.id.btn_raze);
        final ImageButton reyna = root.findViewById(R.id.btn_reyna);
        final ImageButton killjoy = root.findViewById(R.id.btn_killjoy);

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
                Intent intent = new Intent(getActivity(), Jett.class);
                root.getContext().startActivity(intent);
            }
        });
        sage.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sage.class);
                root.getContext().startActivity(intent);
            }
        });
        brimstone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Brimstone.class);
                root.getContext().startActivity(intent);
            }
        });
        phoenix.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Phoenix.class);
                root.getContext().startActivity(intent);
            }
        });
        sova.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Sova.class);
                root.getContext().startActivity(intent);
            }
        });
        omen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Omen.class);
                root.getContext().startActivity(intent);
            }
        });
        breach.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Breach.class);
                root.getContext().startActivity(intent);
            }
        });
        raze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Raze.class);
                root.getContext().startActivity(intent);
            }
        });
        reyna.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Reyna.class);
                root.getContext().startActivity(intent);
            }
        });
        killjoy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Killjoy.class);
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

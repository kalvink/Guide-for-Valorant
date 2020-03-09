package com.kalvinkao.guideforvalorant.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;
import com.kalvinkao.guideforvalorant.ui.agents.AgentsFragment;
import com.kalvinkao.guideforvalorant.ui.info.InfoFragment;
import com.kalvinkao.guideforvalorant.ui.maps.MapsFragment;
import com.kalvinkao.guideforvalorant.ui.media.MediaFragment;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        final Button btn_agents = root.findViewById(R.id.btn_agents);
        final Button btn_maps = root.findViewById(R.id.btn_maps);
        final Button btn_media = root.findViewById(R.id.btn_media);
        final Button btn_info = root.findViewById(R.id.btn_info);

        btn_agents.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new AgentsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Agents");
            }
        });
        btn_maps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new MapsFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Maps");
            }
        });
        btn_media.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new MediaFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Media");
            }
        });
        btn_info.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Fragment mFragment = null;
                mFragment = new InfoFragment();
                FragmentManager fragmentManager = getFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.nav_host_fragment, mFragment).commit();
                ((MainActivity) getActivity()).getSupportActionBar().setTitle("Information");
            }
        });
        return root;
    }
}

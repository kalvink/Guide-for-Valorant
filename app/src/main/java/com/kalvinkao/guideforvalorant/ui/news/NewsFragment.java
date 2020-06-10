package com.kalvinkao.guideforvalorant.ui.news;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.kalvinkao.guideforvalorant.MainActivity;
import com.kalvinkao.guideforvalorant.R;

public class NewsFragment extends Fragment {

    private WebView webView = null;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_news, container, false);
        MainActivity.previousTitle = "Home";
        String url = "https://playvalorant.com/en-us/news/game-updates/valorant-patch-notes-1-0/";
        WebView view = (WebView) root.findViewById(R.id.webview);
        view.getSettings().setJavaScriptEnabled(false);
        view.loadUrl(url);

        return root;
    }
}
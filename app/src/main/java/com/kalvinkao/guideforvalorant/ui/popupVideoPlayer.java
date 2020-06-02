package com.kalvinkao.guideforvalorant.ui;

import android.app.Dialog;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.MediaController;
import android.widget.VideoView;

public class popupVideoPlayer extends WebViewClient {
    Dialog mVideoDialog;
    VideoView mVideoFullScreen;
    MediaController controller;

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {

        if (url.contentEquals("file:///android_asset/01")) {
            showVideo(01); //check user click url from webview and pass int
        } else if (url.contentEquals("file:///android_asset/02")) {
            showVideo(02);//pass int to determine which video to play
        } else {
            System.out.println("DDD URL: " + url.toString());
            view.loadUrl(url);
        }
        return true;
    }

    public void showVideo(int i) {
        if (i == 0) {
            mVideoDialog.show();
            mVideoFullScreen.setVideoPath("https://blitz-cdn-videos.blitz.gg/valorant/agents/phoenix/abilities/Phoenix_C.mp4");
            controller.setMediaPlayer(mVideoFullScreen);
            mVideoFullScreen.setMediaController(controller);
            mVideoFullScreen.requestFocus();
            mVideoFullScreen.start();
        } else if (i == 1) {
            mVideoDialog.show();
            mVideoFullScreen.setVideoPath("file:///sdcard/video file name.m4v");
            controller.setMediaPlayer(mVideoFullScreen);
            mVideoFullScreen.setMediaController(controller);
            mVideoFullScreen.requestFocus();
            mVideoFullScreen.start();
        }
    }


}

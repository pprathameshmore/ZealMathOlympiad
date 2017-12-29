package com.prathameshmore.zealmatholympiad;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Videos extends AppCompatActivity {

    private WebView mWebView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mWebView = (WebView) findViewById(R.id.web_view);


        WebSettings myWebSettings = mWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.youtube.com/channel/UCzfVyPDkyEEE4xkLrXYC86g");

        mWebView.setWebViewClient(new WebViewClient());


    }

}

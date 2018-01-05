package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Videos extends AppCompatActivity {

    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        mWebView = (WebView) findViewById(R.id.web_view);


        WebSettings myWebSettings = mWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.youtube.com/channel/UCzfVyPDkyEEE4xkLrXYC86g");

        mWebView.setWebViewClient(new WebViewClient());

    }
}

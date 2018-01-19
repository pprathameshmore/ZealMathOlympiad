package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Videos extends AppCompatActivity {

    private WebView mWebView;
    private FloatingActionButton floatingActionButtonYouTubeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        mWebView = (WebView) findViewById(R.id.web_view);
        floatingActionButtonYouTubeBtn = (FloatingActionButton) findViewById(R.id.fab);


        WebSettings myWebSettings = mWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.youtube.com/channel/UCzfVyPDkyEEE4xkLrXYC86g");

        mWebView.setWebViewClient(new WebViewClient());

        floatingActionButtonYouTubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startInYouTue = new Intent(Intent.ACTION_VIEW);
                startInYouTue.setData(Uri.parse("https://www.youtube.com/channel/UCzfVyPDkyEEE4xkLrXYC86g"));
                startActivity(startInYouTue);
            }
        });

    }
}

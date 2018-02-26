package com.prathameshmore.zealmatholympiad;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Videos extends AppCompatActivity {

    private WebView mWebView;
    private FloatingActionButton floatingActionButtonYouTubeBtn;
    private ProgressBar progressBar;
    private android.support.v7.app.ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);

        mWebView = (WebView) findViewById(R.id.web_view);
        floatingActionButtonYouTubeBtn = (FloatingActionButton) findViewById(R.id.fab);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        actionBar = getSupportActionBar();
        actionBar.setTitle("Videos");
        actionBar.setDisplayHomeAsUpEnabled(true);


        WebSettings myWebSettings = mWebView.getSettings();
        myWebSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://www.youtube.com/channel/UCzfVyPDkyEEE4xkLrXYC86g");

        mWebView.setWebViewClient(new WebViewClient() {

            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                progressBar.setVisibility(View.VISIBLE);
                progressBar.bringToFront();
                super.onPageStarted(view, url, favicon);
            }

            public void onPageFinished(WebView view, String url) {
                progressBar.setVisibility(View.GONE);
                super.onPageFinished(view, url);
            }
        });

        floatingActionButtonYouTubeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startInYouTue = new Intent(Intent.ACTION_VIEW);
                startInYouTue.setData(Uri.parse("https://www.youtube.com/channel/UCzfVyPDkyEEE4xkLrXYC86g"));
                startActivity(startInYouTue);
            }
        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

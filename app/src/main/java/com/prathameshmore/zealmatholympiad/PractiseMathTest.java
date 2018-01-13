package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PractiseMathTest extends AppCompatActivity {


    private WebView praticseMathTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise_math_test);

        praticseMathTest = (WebView) findViewById(R.id.practiseMathTest);


        WebSettings webSettings = praticseMathTest.getSettings();

        webSettings.setJavaScriptEnabled(true);
        praticseMathTest.loadUrl("http://114.143.280.199/secomp/");
        praticseMathTest.setWebViewClient(new WebViewClient());


    }
}

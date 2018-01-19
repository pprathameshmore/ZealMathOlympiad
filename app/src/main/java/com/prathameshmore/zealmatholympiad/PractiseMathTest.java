package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PractiseMathTest extends AppCompatActivity {


    private WebView practiseMathTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise_math_test);

        practiseMathTest = (WebView) findViewById(R.id.practiseMathTest);


        WebSettings webSettings = practiseMathTest.getSettings();
        webSettings.setJavaScriptEnabled(true);
        practiseMathTest.loadUrl("http://114.143.208.199/zmo");
        practiseMathTest.setWebViewClient(new WebViewClient());


    }
}

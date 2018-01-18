package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PractiseChemistryTest extends AppCompatActivity {

    private WebView practiceChemistryTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise_chemistry_test);

        practiceChemistryTest = (WebView) findViewById(R.id.practiseChemistryTest);

        WebSettings webSettings = practiceChemistryTest.getSettings();
        webSettings.setJavaScriptEnabled(true);
        practiceChemistryTest.loadUrl("http://114.143.208.199/secomp/public/code/index.php");
        practiceChemistryTest.setWebViewClient(new WebViewClient());


    }
}

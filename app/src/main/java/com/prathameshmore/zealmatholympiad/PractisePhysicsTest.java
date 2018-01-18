package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PractisePhysicsTest extends AppCompatActivity {

    private WebView practisePhysicsTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practise_physics_test);

        practisePhysicsTest = (WebView) findViewById(R.id.practisePhysicsTest);

        WebSettings webSettings = practisePhysicsTest.getSettings();

        webSettings.setJavaScriptEnabled(true);

        practisePhysicsTest.loadUrl("http://114.143.208.199/secomp/public/code/index.php");
        practisePhysicsTest.setWebViewClient(new WebViewClient());

    }
}

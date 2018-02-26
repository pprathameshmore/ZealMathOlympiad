package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class MathsPDF extends AppCompatActivity {

    private ActionBar actionBar;
    private com.joanzapata.pdfview.PDFView pdfViewMaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_pdf);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Maths PDF");
        actionBar.setDisplayHomeAsUpEnabled(true);

        pdfViewMaths = (com.joanzapata.pdfview.PDFView) findViewById(R.id.mathsPDF);

        pdfViewMaths.fromAsset("maths.pdf").enableSwipe(true).load();

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

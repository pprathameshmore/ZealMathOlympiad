package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class Scholarship extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView pdfViewScholarship;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);

        pdfViewScholarship = (com.joanzapata.pdfview.PDFView) findViewById(R.id.pdf);

        pdfViewScholarship.fromAsset("ScholarshipInfo.pdf").enableSwipe(true).load();
        actionBar = getSupportActionBar();
        actionBar.setTitle("Scholarship");

        actionBar.setDisplayHomeAsUpEnabled(true);

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

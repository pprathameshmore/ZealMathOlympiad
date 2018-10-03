package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class AdmissionInfo extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView admissionPDF;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_info);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Admission Info");

        actionBar.setDisplayHomeAsUpEnabled(true);

        admissionPDF = (com.joanzapata.pdfview.PDFView) findViewById(R.id.admissionPDF);

        admissionPDF.fromAsset("Admission.pdf").enableSwipe(true).load();

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

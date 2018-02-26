package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class ChemistryPDF extends AppCompatActivity {

    //private PDFView pdfViewChemistry;
    private com.joanzapata.pdfview.PDFView pdfView;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_pdf);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Chemistry PDF");
        actionBar.setDisplayHomeAsUpEnabled(true);

        //pdfViewChemistry = (PDFView) findViewById(R.id.chemistryPDF);

        //pdfViewChemistry.fromAsset("chemistry.pdf").load();
        pdfView = (com.joanzapata.pdfview.PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("chemistry.pdf").enableSwipe(true).load();


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

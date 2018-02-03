package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class ChemistryPDF extends AppCompatActivity {

    //private PDFView pdfViewChemistry;
    private com.joanzapata.pdfview.PDFView pdfView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_pdf);

        //pdfViewChemistry = (PDFView) findViewById(R.id.chemistryPDF);

        //pdfViewChemistry.fromAsset("chemistry.pdf").load();
        pdfView = (com.joanzapata.pdfview.PDFView) findViewById(R.id.pdfView);

        pdfView.fromAsset("chemistry.pdf").enableSwipe(true).load();


    }
}

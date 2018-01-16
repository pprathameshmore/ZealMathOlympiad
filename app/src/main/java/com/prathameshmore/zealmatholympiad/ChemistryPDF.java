package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class ChemistryPDF extends AppCompatActivity {

    private PDFView pdfViewChemistry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_pdf);

        pdfViewChemistry = (PDFView) findViewById(R.id.chemistryPDF);

        pdfViewChemistry.fromAsset("chemistry.pdf").load();


    }
}

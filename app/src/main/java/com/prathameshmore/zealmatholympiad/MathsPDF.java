package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class MathsPDF extends AppCompatActivity {

    private PDFView pdfViewMaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_pdf);

        pdfViewMaths = (PDFView) findViewById(R.id.mathsPDF);

        pdfViewMaths.fromAsset("maths.pdf").load();

    }
}

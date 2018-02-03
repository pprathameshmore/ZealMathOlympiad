package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MathsPDF extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView pdfViewMaths;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_pdf);

        pdfViewMaths = (com.joanzapata.pdfview.PDFView) findViewById(R.id.mathsPDF);

        pdfViewMaths.fromAsset("maths.pdf").enableSwipe(true).load();

    }
}

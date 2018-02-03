package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Scholarship extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView pdfViewScholarship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);

        pdfViewScholarship = (com.joanzapata.pdfview.PDFView) findViewById(R.id.pdf);

        pdfViewScholarship.fromAsset("ScholarshipInfo.pdf").enableSwipe(true).load();

    }
}

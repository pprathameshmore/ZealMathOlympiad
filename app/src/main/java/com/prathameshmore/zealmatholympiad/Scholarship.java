package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Scholarship extends AppCompatActivity {

    private PDFView pdfViewScholarship;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scholarship);

        pdfViewScholarship = (PDFView) findViewById(R.id.pdf);

        pdfViewScholarship.fromAsset("ScholarshipInfo.pdf").load();

    }
}

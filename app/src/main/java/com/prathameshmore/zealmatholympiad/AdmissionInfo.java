package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class AdmissionInfo extends AppCompatActivity {

    private PDFView admissionPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_info);

        admissionPDF = (PDFView) findViewById(R.id.admissionPDF);

        admissionPDF.fromAsset("Admission.pdf").load();

    }
}

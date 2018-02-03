package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class AdmissionInfo extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView admissionPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admission_info);

        admissionPDF = (com.joanzapata.pdfview.PDFView) findViewById(R.id.admissionPDF);

        admissionPDF.fromAsset("Admission.pdf").enableSwipe(true).load();

    }
}

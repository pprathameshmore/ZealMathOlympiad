package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class PhysicsPDF extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView pdfViewPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_pdf);

        pdfViewPhysics = (com.joanzapata.pdfview.PDFView) findViewById(R.id.physicsPDF);

        pdfViewPhysics.fromAsset("physics.pdf").enableSwipe(true).load();
        //pdfViewPhysics.fromUri("").load();


    }
}

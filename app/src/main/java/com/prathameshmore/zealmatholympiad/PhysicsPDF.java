package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class PhysicsPDF extends AppCompatActivity {

    private PDFView pdfViewPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_pdf);

        pdfViewPhysics = (PDFView) findViewById(R.id.physicsPDF);

        pdfViewPhysics.fromAsset("physics.pdf").load();
        //pdfViewPhysics.fromUri("").load();


    }
}

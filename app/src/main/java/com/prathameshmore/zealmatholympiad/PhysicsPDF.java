package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


public class PhysicsPDF extends AppCompatActivity {

    private com.joanzapata.pdfview.PDFView pdfViewPhysics;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_pdf);

        pdfViewPhysics = (com.joanzapata.pdfview.PDFView) findViewById(R.id.physicsPDF);

        pdfViewPhysics.fromAsset("physics.pdf").enableSwipe(true).load();
        //pdfViewPhysics.fromUri("").load();

        actionBar = getSupportActionBar();
        actionBar.setTitle("Physics PDF");
        actionBar.setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

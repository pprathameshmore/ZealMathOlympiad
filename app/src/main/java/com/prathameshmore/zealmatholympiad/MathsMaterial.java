package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class MathsMaterial extends AppCompatActivity {

    private TextView textViewMathsPDF;
    private TextView textViewPractiseMathsTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_material);

        textViewMathsPDF = (TextView) findViewById(R.id.pdfMaths);
        textViewPractiseMathsTest = (TextView) findViewById(R.id.practiseMathTest);

        textViewMathsPDF.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startMathsPDFActivity = new Intent(MathsMaterial.this, MathsPDF.class);
                startActivity(startMathsPDFActivity);
            }
        });


        textViewPractiseMathsTest.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                Intent startMathPractiseActivity = new Intent(MathsMaterial.this, PractiseMathTest.class);
                startActivity(startMathPractiseActivity);
            }
        });


    }
}

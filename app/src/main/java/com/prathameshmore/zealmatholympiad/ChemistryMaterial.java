package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ChemistryMaterial extends AppCompatActivity {

    private TextView textViewChemistryPDF;
    private TextView textViewChemistryPractiseTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry_material);

        textViewChemistryPDF = (TextView) findViewById(R.id.pdfChemistry);
        textViewChemistryPractiseTest = (TextView) findViewById(R.id.practiseChemistryTest);

        textViewChemistryPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startChemistryPDFActivity = new Intent(ChemistryMaterial.this,ChemistryPDF.class);
                startActivity(startChemistryPDFActivity);
            }
        });

        textViewChemistryPractiseTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startChemistryPractiseTestActivity = new Intent(ChemistryMaterial.this, PractiseChemistryTest.class);
                startActivity(startChemistryPractiseTestActivity);

            }
        });

    }
}

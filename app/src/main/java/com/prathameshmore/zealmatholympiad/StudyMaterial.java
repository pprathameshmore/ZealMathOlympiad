package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class StudyMaterial extends AppCompatActivity {

    private CardView mathsCardView;
    private CardView physicsCardView;
    private CardView chemistryCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        mathsCardView = (CardView) findViewById(R.id.maths_card_view);
        physicsCardView = (CardView) findViewById(R.id.phy_card_view);
        chemistryCardView = (CardView) findViewById(R.id.chemistry_card_view);


        mathsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startMathsMaterial = new Intent(StudyMaterial.this, MathsMaterial.class);
                startActivity(startMathsMaterial);

            }


        });


        physicsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startPhyMCQ = new Intent(StudyMaterial.this, PhysicsTest.class);

                startActivity(startPhyMCQ);

            }
        });


        //Start Chemistry Test Activity
        chemistryCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startChemistryMCQ = new Intent(StudyMaterial.this, ChemistryTest.class);
                startActivity(startChemistryMCQ);
            }
        });
    }
}

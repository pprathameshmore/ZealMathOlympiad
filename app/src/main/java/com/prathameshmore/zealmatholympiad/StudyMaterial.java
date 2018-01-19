package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class StudyMaterial extends AppCompatActivity {

    private CardView mathsCardView;
    private TextView physicsCardView;
    private CardView chemistryCardView;
    private CardView videosCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        mathsCardView = (CardView) findViewById(R.id.maths_card_view);
        physicsCardView = (TextView) findViewById(R.id.phy_card_view);
        chemistryCardView = (CardView) findViewById(R.id.chemistry_card_view);
        videosCardView = (CardView) findViewById(R.id.videos_card_view);


        mathsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startMathsMaterial = new Intent(StudyMaterial.this, MathsPDF.class);
                startActivity(startMathsMaterial);

            }


        });


        physicsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startPhysicsMaterial = new Intent(StudyMaterial.this,PhysicsPDF.class);
                startActivity(startPhysicsMaterial);
            }
        });

        //Start Chemistry Test Activity
        chemistryCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startChemistryMaterial = new Intent(StudyMaterial.this, ChemistryPDF.class);
                startActivity(startChemistryMaterial);
            }
        });

        videosCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startVideosActivity = new Intent(StudyMaterial.this,Videos.class);
                startActivity(startVideosActivity);
            }
        });
    }
}

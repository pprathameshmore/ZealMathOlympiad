package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class StudyMaterial extends AppCompatActivity {

    private CardView mathsCardView;
    private CardView phyCardView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        mathsCardView = (CardView) findViewById(R.id.maths_card_view);
        phyCardView = (CardView) findViewById(R.id.phy_card_view);






        mathsCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startMathsMCQ = new Intent(StudyMaterial.this,MathTest.class);
                startActivity(startMathsMCQ);

            }


        });


        phyCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startPhyMCQ = new Intent(StudyMaterial.this,PhysicsTest.class);

                startActivity(startPhyMCQ);

            }
        });
    }
}

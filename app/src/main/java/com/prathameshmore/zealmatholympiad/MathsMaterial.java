package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MathsMaterial extends AppCompatActivity {

    private CardView cardViewPractiseMathTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maths_material);

        cardViewPractiseMathTest = (CardView) findViewById(R.id.practiseMathTest);

        cardViewPractiseMathTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startPractiseMathActivity = new Intent(MathsMaterial.this,PractiseMathTest.class);
                startActivity(startPractiseMathActivity);

            }
        });

    }
}

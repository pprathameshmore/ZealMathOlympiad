package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class PhysicsMaterial extends AppCompatActivity {

    private TextView textViewPhysicsPDF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_material);

        textViewPhysicsPDF = (TextView) findViewById(R.id.pdf_physics);



        textViewPhysicsPDF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startPhysicsPDFActivity = new Intent(PhysicsMaterial.this,PhysicsPDF.class);
                startActivity(startPhysicsPDFActivity);
            }
        });

    }
}

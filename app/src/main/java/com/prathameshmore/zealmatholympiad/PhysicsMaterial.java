package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PhysicsMaterial extends AppCompatActivity {

    private TextView textViewPhysicsPDF;
    private TextView textViewPractisePhysicsTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physics_material);

        textViewPhysicsPDF = (TextView) findViewById(R.id.physicsPDF);
        textViewPractisePhysicsTest = (TextView) findViewById(R.id.practisePhysicsTest);



    }
}

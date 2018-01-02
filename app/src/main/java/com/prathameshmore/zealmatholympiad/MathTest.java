package com.prathameshmore.zealmatholympiad;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MathTest extends AppCompatActivity {

    private Button buttonShowResultMath;

    private RadioGroup radioGroupQuestion1;
    private RadioButton radioButton1;
    private RadioButton radioButton2;
    private RadioButton radioButton3;
    private RadioButton radioButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_test);
/*
        radioButton1 = (RadioButton) findViewById(R.id.first_question_option);
        radioButton2 = (RadioButton) findViewById(R.id.two_question_option);
        radioButton3 = (RadioButton) findViewById(R.id.three_question_option);
        radioButton4 = (RadioButton) findViewById(R.id.four_question_option);
*/


    }
}

package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class StudentInfo extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private DatabaseReference databaseReference;

    private Button buttonSaveInfo;
    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextMobileNumber;
    private EditText editTextEmail;
    private EditText editTextAddress;
    private EditText editTextMarksTenth;
    private EditText editTextmarksTwelfth;
    private EditText editTextInterest;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_info);

        firebaseAuth = FirebaseAuth.getInstance();
        databaseReference = FirebaseDatabase.getInstance().getReference();

        buttonSaveInfo = (Button) findViewById(R.id.buttonSubmitInfo);
        editTextFirstName = (EditText) findViewById(R.id.editTextFirstName);
        editTextLastName = (EditText) findViewById(R.id.editTextLastName);
        editTextMobileNumber = (EditText) findViewById(R.id.editTextMobileNumber);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextAddress = (EditText) findViewById(R.id.editTextAddress);
        editTextMarksTenth = (EditText) findViewById(R.id.editTextMarks10);
        editTextmarksTwelfth = (EditText) findViewById(R.id.editTextMarks12);
        editTextInterest = (EditText) findViewById(R.id.editTextInterests);


        buttonSaveInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editTextFirstName.getText().length() == 0 || editTextLastName.getText().length() == 0 || editTextMobileNumber.getText().length() == 0 || editTextEmail.getText().length() == 0 || editTextAddress.getText().length() == 0 || editTextMarksTenth.getText().length() == 0 || editTextmarksTwelfth.getText().length() == 0 || editTextInterest.getText().length() == 0) {

                    Toast.makeText(StudentInfo.this, "Please fill the all information", Toast.LENGTH_LONG).show();

                } else {

                    String firstName = editTextFirstName.getText().toString().trim();
                    String lastName = editTextLastName.getText().toString().trim();
                    String mobileNumber = editTextMobileNumber.getText().toString().trim();
                    String email = editTextEmail.getText().toString().trim();
                    String address = editTextAddress.getText().toString().trim();
                    String tenthMarks = editTextMarksTenth.getText().toString().trim();
                    String twelfthMarks = editTextmarksTwelfth.getText().toString().trim();
                    String interests = editTextInterest.getText().toString().trim();

                    StudentInformation studentInformation = new StudentInformation(firstName, lastName, mobileNumber, address, email, tenthMarks, twelfthMarks, interests);

                    FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                    databaseReference.child(firebaseUser.getPhoneNumber()).setValue(studentInformation);

                    Toast.makeText(StudentInfo.this, "Information Submitted Successfully", Toast.LENGTH_SHORT).show();

                    Intent startMainActivity = new Intent(StudentInfo.this, MainActivity.class);
                    startActivity(startMainActivity);

                }
            }
        });

    }
}

package com.prathameshmore.zealmatholympiad;

import android.app.ActionBar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
    private EditText editStreetName;
    private EditText editCityName;
    private EditText editPinCode;
    private EditText editTextMarksTenth;
    private EditText editTextmarksTwelfth;

    private RadioGroup radioGroupInterests;
    private RadioButton radioButton;

    private android.support.v7.app.ActionBar actionBar;

    //private String interestItem;

    //private Spinner interestSpinner;

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
        editStreetName = (EditText) findViewById(R.id.editStreetAddress);
        editCityName = (EditText) findViewById(R.id.editCityName);
        editPinCode = (EditText) findViewById(R.id.editPinCode);
        editTextMarksTenth = (EditText) findViewById(R.id.editTextMarks10);
        editTextmarksTwelfth = (EditText) findViewById(R.id.editTextMarks12);
        //editTextInterest = (EditText) findViewById(R.id.editTextInterests);

        radioGroupInterests = (RadioGroup) findViewById(R.id.radioGroupInterests);
       /* radioButtonEngineering = (RadioButton) findViewById(R.id.radioButtonEngineering);
        radioButtonMedical = (RadioButton) findViewById(R.id.radioButtonMedical);
        radioButtonBSC = (RadioButton) findViewById(R.id.radioButtonBSc);
        radioButtonBSA = (RadioButton) findViewById(R.id.radioButtonBSA); */

       actionBar = getSupportActionBar();
       actionBar.setTitle("Registration Form");


        buttonSaveInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (editTextFirstName.getText().length() == 0 || editTextLastName.getText().length() == 0 || editTextMobileNumber.getText().length() == 0 || editTextEmail.getText().length() == 0 || editStreetName.getText().length() == 0 || editCityName.getText().length() == 0 || editPinCode.getText().length() == 0 || editTextMarksTenth.getText().length() == 0 || editTextmarksTwelfth.getText().length() == 0) {

                    Toast.makeText(StudentInfo.this, "Please fill the all information", Toast.LENGTH_SHORT).show();

                } else {

                    int selectedButton = radioGroupInterests.getCheckedRadioButtonId();
                    /*
                    radioButtonEngineering = (RadioButton) findViewById(selectedButton);
                    radioButtonMedical = (RadioButton) findViewById(selectedButton);
                    radioButtonBSC = (RadioButton) findViewById(selectedButton);
                    radioButtonBSA = (RadioButton) findViewById(R.id.radioButtonBSA);
*/
                    radioButton = (RadioButton) findViewById(selectedButton);

                    String interests = (String) radioButton.getText();


                    String firstName = editTextFirstName.getText().toString().trim();
                    String lastName = editTextLastName.getText().toString().trim();
                    String mobileNumber = editTextMobileNumber.getText().toString().trim();
                    String email = editTextEmail.getText().toString().trim();
                    String streetName = editStreetName.getText().toString().trim();
                    String cityName = editCityName.getText().toString().trim();
                    String pinCode = editPinCode.getText().toString().trim();
                    String tenthMarks = editTextMarksTenth.getText().toString().trim();
                    String twelfthMarks = editTextmarksTwelfth.getText().toString().trim();
                    //String interests = editTextInterest.getText().toString().trim();


                    StudentInformation studentInformation = new StudentInformation(firstName, lastName, mobileNumber, email, streetName, cityName, pinCode, tenthMarks, twelfthMarks, interests);

                    FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
                    databaseReference.child(firebaseUser.getPhoneNumber()).setValue(studentInformation);

                    Toast.makeText(StudentInfo.this, "Information Submitted Successfully", Toast.LENGTH_LONG).show();

                    Intent startMainActivity = new Intent(StudentInfo.this, MainActivity.class);
                    startActivity(startMainActivity);

                }
            }
        });

    }


}

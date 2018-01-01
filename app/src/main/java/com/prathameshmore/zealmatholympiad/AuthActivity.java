package com.prathameshmore.zealmatholympiad;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.FirebaseTooManyRequestsException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.concurrent.TimeUnit;

public class AuthActivity extends AppCompatActivity {

    private Button mSendBtn;
    private EditText mGetNumber;
    private TextView textViewHelp;

    private PhoneAuthProvider.OnVerificationStateChangedCallbacks mCallbacks;
    private FirebaseAuth mAuth;
    private String mVerificationId;
    private PhoneAuthProvider.ForceResendingToken mResendToken;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        mAuth = FirebaseAuth.getInstance();

        mSendBtn = (Button) findViewById(R.id.btn_confirm_mobile_number);
        mGetNumber = (EditText) findViewById(R.id.get_number);

        textViewHelp = (TextView) findViewById(R.id.help_text_view);

        mSendBtn.isEnabled();

        final ProgressDialog mPrograDialog = new ProgressDialog(AuthActivity.this);


        mSendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String countryCode = "+91";
                String phoneNumber = mGetNumber.getText().toString();


                if (mGetNumber.getText().length() == 0) {

                    mGetNumber.setError("Mobile Number can not be empty");

                } else if (mGetNumber.getText().length() == 10) {


                    PhoneAuthProvider.getInstance().verifyPhoneNumber(
                            countryCode + phoneNumber,
                            60,
                            TimeUnit.SECONDS,
                            AuthActivity.this,
                            mCallbacks
                    );


                    Toast.makeText(AuthActivity.this, "Sending...", Toast.LENGTH_SHORT).show();

                } else {

                    mGetNumber.setError("Enter valid number");

                }


            }
        });

        //Navigate to About Page

        textViewHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent startAboutActivity = new Intent(AuthActivity.this, MainActivity.class);
                startActivity(startAboutActivity);

            }
        });


        mCallbacks = new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
            @Override
            public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {

                signInWithPhoneAuthCredential(phoneAuthCredential);
                Intent startStudentInfoActivity = new Intent(AuthActivity.this, StudentInfo.class);
                startActivity(startStudentInfoActivity);
                Toast.makeText(AuthActivity.this, "Mobile Number Verified", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onVerificationFailed(FirebaseException e) {

                Toast.makeText(AuthActivity.this, "Error while Registration", Toast.LENGTH_SHORT).show();
                Toast.makeText(AuthActivity.this, "Try to contact developers", Toast.LENGTH_LONG).show();

            }

            public void onCodeSent(String verificationId,
                                   PhoneAuthProvider.ForceResendingToken token) {

                // Save verification ID and resending token so we can use them later
                mVerificationId = verificationId;
                mResendToken = token;
                Toast.makeText(AuthActivity.this, "Verification code sent", Toast.LENGTH_SHORT).show();

                // ...
            }
        };

    }


    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information

                            FirebaseUser user = task.getResult().getUser();
                            Intent startMainActivity = new Intent(AuthActivity.this, MainActivity.class);
                            startActivity(startMainActivity);
                            finish();
                            // ...
                        } else {
                            // Sign in failed, display a message and update the UI


                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                // The verification code entered was invalid
                            }
                        }
                    }
                });
    }

}

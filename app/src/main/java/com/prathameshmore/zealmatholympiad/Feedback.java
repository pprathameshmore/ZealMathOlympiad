package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class Feedback extends AppCompatActivity {

    private Button buttonSend;
    private EditText editTextSubject;
    private EditText editTextBody;
    private ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        buttonSend = (Button) findViewById(R.id.button_send);
        editTextSubject = (EditText) findViewById(R.id.edittext_subject);
        editTextBody = (EditText) findViewById(R.id.edittext_feedback);
        actionBar = getSupportActionBar();
        actionBar.setTitle("Feedback");

        actionBar.setDisplayHomeAsUpEnabled(true);


        buttonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (editTextBody.length() == 0 && editTextSubject.length() == 0) {

                    Toast.makeText(Feedback.this, "Please fill the all information", Toast.LENGTH_SHORT).show();

                } else {
                    String sub = editTextSubject.getText().toString();
                    String det = editTextBody.getText().toString();

                    Intent email = new Intent(Intent.ACTION_SEND);
                    email.putExtra(Intent.EXTRA_EMAIL, new String[]{"zcoer@zealeducation.com"});
                    email.putExtra(Intent.EXTRA_SUBJECT, sub);
                    email.putExtra(Intent.EXTRA_TEXT, det);

                    //need this to prompts email client only
                    email.setType("message/rfc822");

                    startActivity(Intent.createChooser(email, "Choose an Email client :"));
                }

            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }

}

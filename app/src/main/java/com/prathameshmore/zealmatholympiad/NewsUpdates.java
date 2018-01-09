package com.prathameshmore.zealmatholympiad;

import android.content.Context;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.CellIdentityGsm;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class NewsUpdates extends AppCompatActivity {


    private FirebaseDatabase message1;
    private FirebaseDatabase message2;
    private FirebaseDatabase message3;
    private FirebaseDatabase message4;
    private FirebaseDatabase message5;
    private TextView message_textview_1;

    private TextView message_textview_2;

    private TextView message_textview_3;

    private TextView message_textview_4;

    private TextView message_textview_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_updates);

        message_textview_1 = (TextView) findViewById(R.id.firebase_textview_1);
        message_textview_2 = (TextView) findViewById(R.id.firebase_textview_2);
        message_textview_3 = (TextView) findViewById(R.id.firebase_textview_3);
        message_textview_4 = (TextView) findViewById(R.id.firebase_textview_4);
        message_textview_5 = (TextView) findViewById(R.id.firebase_textview_5);


        message1 = FirebaseDatabase.getInstance();
        final DatabaseReference message_1 = message1.getReference("message_1");

        message2 = FirebaseDatabase.getInstance();
        DatabaseReference message_2 = message2.getReference("message_2");

        message3 = FirebaseDatabase.getInstance();
        DatabaseReference message_3 = message3.getReference("message_3");


        message4 = FirebaseDatabase.getInstance();
        DatabaseReference message_4 = message4.getReference("message_4");

        message5 = FirebaseDatabase.getInstance();
        DatabaseReference message_5 = message5.getReference("message_5");


        // Picasso.with(this).load(msg).placeholder(R.id.about_zcoer).into(imageView);

        message_1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String message_1 = dataSnapshot.getValue(String.class);
                message_textview_1.setText(message_1);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        message_2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String message_2 = dataSnapshot.getValue(String.class);
                message_textview_2.setText(message_2);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        message_3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String message_3 = dataSnapshot.getValue(String.class);
                message_textview_3.setText(message_3);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        message_4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String message_4 = dataSnapshot.getValue(String.class);
                message_textview_4.setText(message_4);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        message_5.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String message_5 = dataSnapshot.getValue(String.class);
                message_textview_5.setText(message_5);

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }
}

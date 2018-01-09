package com.prathameshmore.zealmatholympiad;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

import org.w3c.dom.Text;

public class NewsUpdates extends AppCompatActivity {


    private FirebaseDatabase mainTextView;
    private TextView textView;
    private ImageView imageView;
    private String msg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_updates);

        textView = (TextView) findViewById(R.id.text_view_firebase);
        imageView = (ImageView) findViewById(R.id.image_view);


        mainTextView = FirebaseDatabase.getInstance();
        final DatabaseReference databaseReference = mainTextView.getReference("message_1");

        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                msg = dataSnapshot.getValue(String.class);
                textView.setText(msg);

                //Picasso.with(NewsUpdates.this).load(msg).into(imageView);


            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


    }
}

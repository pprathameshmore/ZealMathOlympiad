package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class Events extends AppCompatActivity {


    private CardView cardViewNewsUpdates;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        cardViewNewsUpdates = (CardView) findViewById(R.id.news_updates_card_view);

        cardViewNewsUpdates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Events.this,NewsUpdates.class));

            }
        });

    }
}

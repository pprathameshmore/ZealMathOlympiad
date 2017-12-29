package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView _navigation_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        _navigation_view = (NavigationView) findViewById(R.id.navigation_view);


        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        _navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.video_menu:
                        Intent startVideosActivity = new Intent(MainActivity.this, Videos.class);
                        startActivity(startVideosActivity);

                        break;

                    case R.id.share_menu:
                        Intent email = new Intent(Intent.ACTION_SEND);
                        email.putExtra(Intent.EXTRA_EMAIL, new String[]{" "});
                        email.putExtra(Intent.EXTRA_SUBJECT, "Hey, Try this awesome app");
                        email.putExtra(Intent.EXTRA_TEXT, "Download Zeal Math Olympiad Android app, Try here : http://");
                        break;

                    case R.id.about_menu:
                        Intent startAboutActivity = new Intent(MainActivity.this , About.class);
                        startActivity(startAboutActivity);
                        break;


                    case R.id.tests_menu:
                        Intent startStudyActivity = new Intent(MainActivity.this, StudyMaterial.class);
                        startActivity(startStudyActivity);
                        break;
                }


                return false;
            }
        });


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (toggle.onOptionsItemSelected(item)) {

            return true;

        }
        return super.onOptionsItemSelected(item);
    }


    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();

        if (currentUser == null) {

            Intent authIntent = new Intent(MainActivity.this, AuthActivity.class);
            startActivity(authIntent);
            finish();

        }
    }



}

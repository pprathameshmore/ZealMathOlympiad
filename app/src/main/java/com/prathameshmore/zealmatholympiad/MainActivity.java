package com.prathameshmore.zealmatholympiad;

import android.content.Intent;
import android.net.Uri;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle toggle;
    private NavigationView _navigation_view;
    private FirebaseDatabase firebaseDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAuth = FirebaseAuth.getInstance();


        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        toggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        _navigation_view = (NavigationView) findViewById(R.id.navigation_view);

        Toast.makeText(this, "This app under development, some feature will not work properly", Toast.LENGTH_LONG).show();

        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        _navigation_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()) {
                    case R.id.home_menu:
                        mDrawerLayout.closeDrawers();
                        break;


                    case R.id.tests_menu:
                        Intent startStudyActivity = new Intent(MainActivity.this, StudyMaterial.class);
                        startActivity(startStudyActivity);
                        mDrawerLayout.closeDrawers();
                        break;

                    case R.id.video_menu:
                        Intent startVideosActivity = new Intent(MainActivity.this, Videos.class);
                        startActivity(startVideosActivity);
                        mDrawerLayout.closeDrawers();
                        break;


                    case R.id.news_menu:
                        Intent startNewsUpdatesActivity = new Intent(MainActivity.this, Events.class);
                        startActivity(startNewsUpdatesActivity);
                        mDrawerLayout.closeDrawers();
                        break;

                    case R.id.updates_menu:
                        Intent startUpdatesActivity = new Intent(MainActivity.this, NewsUpdates.class);
                        startActivity(startUpdatesActivity);
                        mDrawerLayout.closeDrawers();
                        break;

                    case R.id.zeal_clg_menu:
                        Intent startAboutZCOERActivity = new Intent(MainActivity.this, AboutZCOER.class);
                        startActivity(startAboutZCOERActivity);
                        mDrawerLayout.closeDrawers();
                        break;

                    case R.id.about_menu:
                        Intent startAboutActivity = new Intent(MainActivity.this, About.class);
                        startActivity(startAboutActivity);
                        mDrawerLayout.closeDrawers();
                        break;

                    case R.id.log_out_menu:
                        mAuth.signOut();
                        Intent startSignInActivity = new Intent(MainActivity.this, AuthActivity.class);
                        startActivity(startSignInActivity);
                        Toast.makeText(MainActivity.this, "Log Out Successfully", Toast.LENGTH_SHORT).show();
                        break;


                    case R.id.share_menu:

                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "Download Zeal Math Olympiad Android app : ");
                        sendIntent.setType("text/plain");
                        startActivity(sendIntent);

                        mDrawerLayout.closeDrawers();
                        break;

                    case R.id.feedback_menu:
                        Intent startFeedbackActivity = new Intent(MainActivity.this, Feedback.class);
                        startActivity(startFeedbackActivity);
                        mDrawerLayout.closeDrawers();
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

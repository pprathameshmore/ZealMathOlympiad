package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;

public class About extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.app_logo)
                .setDescription("ZEAL MATH OLYMPIAD Version 1.0")
                .addGroup("Connect with us")
                .addEmail("moreprathameshmore@hotmail.com","Prathamesh More")
                .addEmail("vijapuresantosh@gmail.com","Santosh Vijapure")
                .addWebsite("http://www.about.me/prathameshmore")
                .addFacebook("pprathameshmore","Prathamesh More")
                .addFacebook("santoshkumar.vijapure","Santosh Vijapure")
                .addTwitter("pprathameshmore","Prathamesh More")
                .addTwitter("vijapure_h","Santosh Vijapure")
                .addYoutube("UC48QuhKjplEM1cLIPPK-Myw")
                .addPlayStore("com.ideashower.readitlater.pro")
                .addGitHub("pprathameshmore","Prathamesh More")
                .addGitHub("santosh62","Santosh Vijapure")
                .addInstagram("pprathameshmore","Prathamesh More")
                .addInstagram("santosh622","Santosh Vijapure")
                .create();
        setContentView(aboutPage);

    }
}

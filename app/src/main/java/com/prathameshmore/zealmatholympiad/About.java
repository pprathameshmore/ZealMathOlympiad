package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;

import java.util.Calendar;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.app_logo)
                .setDescription("ZEAL MATH OLYMPIAD Version 2.0")
                .addGroup("Connect with Developers")
                .addEmail("moreprathameshmore@hotmail.com","Prathamesh More")
                .addEmail("vijapuresantosh@gmail.com","Santosh Vijapure")
                .addWebsite("http://www.about.me/prathameshmore")
                .addFacebook("pprathameshmore","Prathamesh More")
                .addFacebook("santoshkumar.vijapure","Santosh Vijapure")
                .addPlayStore("com.prathameshmore.zealmatholympiad")
                .addGitHub("pprathameshmore","Prathamesh More")
                .addGitHub("santosh62","Santosh Vijapure")
                .addGroup("Special Thanks")
                .addItem(specialThanks())
                .addGroup("We are open source")
                .addGitHub("pprathameshmore/ZealMathOlympiad","Fork this project on GitHub")
                .addGroup("Wiki")
                .addWebsite("https://github.com/pprathameshmore/ZealMathOlympiad/wiki","Know used technologies")
                .addWebsite("https://github.com/pprathameshmore/ZealMathOlympiad/blob/master/LICENSE","License")


                .addItem(createCopyright())


                .create();
        setContentView(aboutPage);
    }

    private Element specialThanks() {
        Element thanks = new Element();
        String string = "Lomte Sir and Vikas Patil Sir";
        thanks.setTitle(string);
        thanks.setGravity(Gravity.CENTER);
        return thanks;
    }


    private Element createCopyright() {

        Element copyright = new Element();
        String copyRightString = String.format("Copyright %d by Prathamesh More, Santosh Vijapure (MIT License)", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyRightString);
        copyright.setGravity(Gravity.CENTER);
        return copyright;
    }
}

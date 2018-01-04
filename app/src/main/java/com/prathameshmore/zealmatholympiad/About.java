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
                .setDescription("ZEAL MATH OLYMPIAD Version 1.0")
                .addGroup("Connect with Developers")
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
                .addItem(createCopyright())
                .create();
        setContentView(aboutPage);
    }

    private Element createCopyright() {

        Element copyright = new Element();
        String copyRightString = String.format("Copyright %d by Prathamesh More, Santosh Vijapure", Calendar.getInstance().get(Calendar.YEAR));
        copyright.setTitle(copyRightString);
        copyright.setGravity(Gravity.CENTER);
        return copyright;
    }
}

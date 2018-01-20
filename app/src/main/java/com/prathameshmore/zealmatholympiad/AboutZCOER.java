package com.prathameshmore.zealmatholympiad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class AboutZCOER extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_zcoer);


        View aboutZCOER = new AboutPage(this)
                .isRTL(false)
                .setDescription("To celebrate its 22nd Anniversary in Technical Educational, Zeal Maths Olympiad (ZMO) is an Mathematical Knowledge Test for 12th science students among the Maharashtra. Zeal Maths Olympiad is conducted by Zeal College of  Engineering and Research Pune since 2015. Zeal has taken the responsibility for searching and training the youth today for Engineering career prospect. In 2017-2018 Zeal was able to reach 32000 students from various villages and cities across the Maharashtra . Today Success stories are been shared by state and district level winners of Zeal Maths Olympiad 2017-18\n" +
                        "\n")
                .addGroup("Connect with us")
                .addEmail("zcoer@zealeducation.com")
                .addWebsite("www.zcoer.in")
                .addWebsite("http://zealeducation.com/olympiad/","Zeal Math Olympiad")
                .addFacebook("zealedusoc")
                .addTwitter("zcoerpune")
                .addYoutube("zealedusoc")
                .addPlayStore("com.prathameshmore.zealmatholympiad")
                .addInstagram("zeal_edu_soc")

                .addGroup("The Office")
                .addItem(new Element("(020) 67206000",R.mipmap.ic_call_black_24dp))
                .addItem(new Element("9527473157",R.mipmap.ic_call_black_24dp))
                .addItem(new Element("8793540892",R.mipmap.ic_call_black_24dp))
                .addItem(new Element("800 267 2667",R.mipmap.ic_call_black_24dp))
                .addItem(new Element("S.NO 39, Dhayari Road, Narhe, Pune, Maharashtra 411041, India",R.mipmap.ic_room_black_24dp))
                .create();
        setContentView(aboutZCOER);


    }
}

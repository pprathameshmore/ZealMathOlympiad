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
                .setImage(R.drawable.naac)
                .setDescription("At ZCOER,  we believe that those who challenge the status quo today will do remarkable things tomorrow. If you’re passionate about the possibilities as we are – please contact us.")
                .addGroup("Connect with us")
                .addEmail("zcoer@zealeducation.com")
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

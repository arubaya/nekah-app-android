package com.doomlastudio.nekahapp.profile;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.doomlastudio.nekahapp.R;
import com.thoughtbot.expandablerecyclerview.listeners.GroupExpandCollapseListener;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;

public class ProfileAccount extends AppCompatActivity {
    private ArrayList<ProfileParentItem> parentProfile = new ArrayList<>();
    public final int[] icon = {R.drawable.icon_nameprofile, R.drawable.icon_comment, R.drawable.icon_about};
    public ImageView iconIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_account);

        iconIcon = findViewById(R.id.ic_parentIcon);

        RecyclerView recyclerView = findViewById(R.id.rv_profile);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));
        //


        //  1
        ArrayList<ProfileChildItem> namaProfile = new ArrayList<>();
        namaProfile.add(new ProfileChildItem("First Name","Abdul"));
        namaProfile.add(new ProfileChildItem("Last Name","Qadir"));
        ProfileParentItem name =  new ProfileParentItem("Name",namaProfile);
        parentProfile.add(name);

        //  2
        ArrayList<ProfileChildItem> lahirProfile = new ArrayList<>();
        lahirProfile.add(new ProfileChildItem("Your Birthday","11/12/1992"));
        ProfileParentItem birth =  new ProfileParentItem("Date of Birth",lahirProfile);
        parentProfile.add(birth);

        //  3
        ArrayList<ProfileChildItem> profesiProfile = new ArrayList<>();
        profesiProfile.add(new ProfileChildItem("Your Profession","Teacher"));
        ProfileParentItem profession =  new ProfileParentItem("Profession",profesiProfile);
        parentProfile.add(profession);

        //  4
        ArrayList<ProfileChildItem> hobbiProfile = new ArrayList<>();
        hobbiProfile.add(new ProfileChildItem("Your Hobbies","Horse Riding"));
        ProfileParentItem hobbies =  new ProfileParentItem("Hobbies",hobbiProfile);
        parentProfile.add(hobbies);

        //  5
        ArrayList<ProfileChildItem> genderProfile = new ArrayList<>();
        genderProfile.add(new ProfileChildItem("Your Gender","Male"));
        ProfileParentItem gender =  new ProfileParentItem("Gender",genderProfile);
        parentProfile.add(gender);

        //  6
        ArrayList<ProfileChildItem> tentangProfile = new ArrayList<>();
        tentangProfile.add(new ProfileChildItem("More Description of You","Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Non curabitur gravida arcu ac. Sit amet dictum sit amet justo. Amet luctus venenatis lectus magna."));
        ProfileParentItem about =  new ProfileParentItem("About You",tentangProfile);
        parentProfile.add(about);








        ProfileAccountAdapter profileAccountAdapter = new ProfileAccountAdapter(parentProfile);
        recyclerView.setAdapter(profileAccountAdapter);


    }

}

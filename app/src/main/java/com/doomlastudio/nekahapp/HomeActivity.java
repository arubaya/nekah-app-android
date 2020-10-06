package com.doomlastudio.nekahapp;

import android.content.Intent;
import android.os.Bundle;

import com.doomlastudio.nekahapp.fragment.FeedFragment;
import com.doomlastudio.nekahapp.fragment.MatchFragment;
import com.doomlastudio.nekahapp.profile.ProfileAccount;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener{

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private SectionsPagerAdapter adapter;
    private DrawerLayout drawerLayout;
    private LayoutInflater layoutInflater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        adapter = new SectionsPagerAdapter(getSupportFragmentManager());
        viewPager = (ViewPager) findViewById(R.id.view_pager_home);
        tabLayout = (TabLayout) findViewById(R.id.tabMenu);
        //AddFragment
        adapter.AddFragment(new MatchFragment(),"Match");
        adapter.AddFragment(new FeedFragment(),"Feed");
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setAdapter(adapter);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button mBtnLove = findViewById(R.id.btnLove);
        mBtnLove.setOnClickListener(this);



        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerLayout =findViewById(R.id.drawerlayout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout,toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_open);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        /*<com.google.android.material.navigation.NavigationView
        android:layout_width="wrap_content"
        android:layout_height="match_parent"
        android:id="@+id/nav_view"
        app:headerLayout="@layout/nav_header"
        app:menu="@menu/drawer_menu"/>*/

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){

            case R.id.navProfile:
                Intent profiledata = new Intent(this, ProfileAccount.class);
                startActivity(profiledata);
            case R.id.navMyMatches:
                Toast.makeText(this,"See Love list",Toast.LENGTH_SHORT).show();
                break;
            case R.id.navSetting:
                Toast.makeText(this,"Setting aplication",Toast.LENGTH_SHORT).show();
                break;
            case R.id.navShare:
                Toast.makeText(this,"Share this Aplication",Toast.LENGTH_SHORT).show();
                break;
            case R.id.navAbout:
                Intent about = new Intent(this, AboutApps.class);
                startActivity(about);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLove:
                Toast.makeText(this,"See Love list",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
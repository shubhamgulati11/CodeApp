package com.example.shubh.codeapp;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class AndroidList extends AppCompatActivity
       // implements NavigationView.OnNavigationItemSelectedListener
        {
            ArrayList<Data> dataArrayList=new ArrayList<>();
            RecyclerView rv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_list);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
        rv=findViewById(R.id.rv);
//        dataArrayList.add(new Data("TextView",R.drawable.and1));
        Adapter adapter=new Adapter(dataArrayList,AndroidList.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(AndroidList.this));


            }


       // DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
       // ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        //        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
       // drawer.addDrawerListener(toggle);
       // toggle.syncState();

     //   NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
     //   navigationView.setNavigationItemSelectedListener(this);
   // }

    //@Override
    //public void onBackPressed() {
     //   DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
     //   if (drawer.isDrawerOpen(GravityCompat.START)) {
     //       drawer.closeDrawer(GravityCompat.START);
     //   } else {
     //       super.onBackPressed();
    //    }
   // }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.android_list, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle action bar item clicks here. The action bar will
//        // automatically handle clicks on the Home/Up button, so long
//        // as you specify a parent activity in AndroidManifest.xml.
//        int id = item.getItemId();
//
//        //noinspection SimplifiableIfStatement
//        if (id == R.id.action_search) {
//            Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show();
//        }
//
//        if (id == R.id.action_about) {
//            Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
//        }

//        if (id == R.id.action_exit) {
//
//            finish();
//            System.exit(0);
//        }

//        return super.onOptionsItemSelected(item);
//    }

   // @SuppressWarnings("StatementWithEmptyBody")
   // @Override
  //  public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
  //      int id = item.getItemId();
//
      //  if (id == R.id.nav_camera) {
    //        // Handle the camera action
  //      } else if (id == R.id.nav_gallery) {
//
  //      } else if (id == R.id.nav_slideshow) {
//
//        } else if (id == R.id.nav_manage) {

       // } else if (id == R.id.nav_share) {

     //   } else if (id == R.id.nav_send) {

   //     }

       //DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
       // drawer.closeDrawer(GravityCompat.START);
      //  return true;
    }


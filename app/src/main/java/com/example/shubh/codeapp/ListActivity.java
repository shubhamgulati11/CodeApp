package com.example.shubh.codeapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    ArrayList<Data> dataArrayList=new ArrayList<>();
    RecyclerView rv;
    MaterialSearchView searchView;
    int imgarray[]={R.drawable.and1,R.drawable.and2,R.drawable.and3,R.drawable.and4,R.drawable.and4,R.drawable.and5,R.drawable.and6,R.drawable.and7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        searchView = findViewById(R.id.search_view);
        getSupportActionBar().setCustomView(R.layout.abs_layout);
        rv=findViewById(R.id.rv);
        Random random=new Random();
        dataArrayList.add(new Data("New Project","Creating a new android project",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("Activity LifeCycle","Understanding the lifecycle of an android application",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("TextView","A user interface element that displays text to the user.",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("Button","A user interface element the user can tap or click to perform an action.",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("EditText","A user interface element for entering and modifying text",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("ImageView","A user Interface to display Image files",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("SnackBar","Snackbars show a brief message at the bottom of the mobile screen",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("Basic Calculator","Building a calculator using the components discussed so far ",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("CardView","The CardView API is an easy way to display information inside cards",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("WebView","WebView is a view that display web pages inside an application",imgarray[random.nextInt(7)]));

        //       dataArrayList.add(new Data("TextView","",imgarray[random.nextInt(7)]));
        Adapter adapter=new Adapter(dataArrayList,ListActivity.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(ListActivity.this));
        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {

            }

            @Override
            public void onSearchViewClosed() {
                Adapter adapter=new Adapter(dataArrayList,ListActivity.this);
                rv.setAdapter(adapter);
                rv.setLayoutManager(new LinearLayoutManager(ListActivity.this));
            }
        });

        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                if(query!=null && !query.isEmpty())
                {
                    ArrayList<Data> found = new ArrayList<>();
                    for(Data item:dataArrayList)
                    {
                        if(item.name==query)
                        {
                            found.add(item);
                        }
                    }

                    Adapter adapter=new Adapter(found,ListActivity.this);
                    rv.setAdapter(adapter);
                    rv.setLayoutManager(new LinearLayoutManager(ListActivity.this));
                }
                else{

                    Adapter adapter=new Adapter(dataArrayList,ListActivity.this);
                    rv.setAdapter(adapter);
                    rv.setLayoutManager(new LinearLayoutManager(ListActivity.this));
                }

                return true;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Do some magic
                return false; }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.android_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id==R.id.action_about){
            Intent i = new Intent(ListActivity.this,AboutActivity.class);
            startActivity(i);
        }
        else if(id==R.id.action_profile){
            Intent i = new Intent(ListActivity.this,SignupActivity.class);
            startActivity(i);
        }

        else if(id==R.id.searchIt)
        {

        }


        return super.onOptionsItemSelected(item);
    }


}

package com.example.shubh.codeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    ArrayList<Data> dataArrayList=new ArrayList<>();
    RecyclerView rv;
    int imgarray[]={R.drawable.and1,R.drawable.and2,R.drawable.and3,R.drawable.and4,R.drawable.and4,R.drawable.and5,R.drawable.and6,R.drawable.and7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        rv=findViewById(R.id.rv);
        Random random=new Random();
        dataArrayList.add(new Data("TextView","A user interface element that displays text to the user.",imgarray[random.nextInt(7)]));
        dataArrayList.add(new Data("Button","A user interface element the user can tap or click to perform an action.",imgarray[random.nextInt(7)]));
//        dataArrayList.add(new Data("TextView","",imgarray[random.nextInt(7)]));
        Adapter adapter=new Adapter(dataArrayList,ListActivity.this);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new LinearLayoutManager(ListActivity.this));

    }
}

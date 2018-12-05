package com.example.shubh.codeapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

public class TextViewActivity extends AppCompatActivity {

    TextView tvtitle,tvdesc;
    ImageView ivxml,ivcode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        tvtitle=findViewById(R.id.tvtitle);
        tvdesc=findViewById(R.id.tvdesc);
        ivcode=findViewById(R.id.ivjava);
        ivxml=findViewById(R.id.ivxml);
        Data d = getIntent().getParcelableExtra("textview");
        tvtitle.setText(d.getName());
        tvdesc.setText(d.getDesc());
        Picasso.get().load(R.drawable.textview_xml).into(ivxml);
        Picasso.get().load(R.drawable.textviewjava).into(ivcode);


    }
}

package com.example.shubh.codeapp;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> implements Filterable {
    ArrayList<Data> arrayList;
    ArrayList<Data> arrayListFull;
    Context cxt;

    public Adapter(ArrayList<Data> arrayList, Context cxt) {
        this.arrayList = arrayList;
        arrayListFull = new ArrayList<>(arrayList);
        this.cxt = cxt;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater li =LayoutInflater.from(cxt);
        View view=li.inflate(R.layout.itemrow,viewGroup,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder viewHolder, int i) {

        final Data d=arrayList.get(i);
//        Log.e("TAg",""+d.getInitial());
        viewHolder.topicTitle.setText(d.getName());
        viewHolder.topicDesc.setText(d.getDesc());
        viewHolder.androidInitial.setText(d.getInitial());
//        viewHolder.androidInitial.setText(d.getName());
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(d.getName()=="TextView"){
                   Intent intent= new Intent(cxt,TextViewActivity.class);
                   intent.putExtra("TextView",d);
                   d.progress = true;
                   cxt.startActivity(intent);
                }
                else if(d.getName()=="Button"){
                    Intent intent= new Intent(cxt,ButtonActivity.class);
                    intent.putExtra("Button",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
                else if(d.getName()=="New Project"){
                    Intent intent= new Intent(cxt,NewProjectActivity.class);
                    intent.putExtra("project",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
                else if(d.getName()=="Activity LifeCycle"){
                    Intent intent= new Intent(cxt,LifecycleActivity.class);
                    intent.putExtra("Lifecycle",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
                else if(d.getName()=="ImageView"){
                    Intent intent= new Intent(cxt,ImageviewActivity.class);
                    intent.putExtra("ImageView",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
                else if(d.getName()=="Basic Calculator"){
                    Intent intent= new Intent(cxt,CalculatorActivity.class);
                    intent.putExtra("Calculator",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
                else if(d.getName()=="EditText"){
                    Intent intent= new Intent(cxt,EdittextActivity.class);
                    intent.putExtra("EditText",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
                else if(d.getName()=="WebView"){
                    Intent intent= new Intent(cxt,WebviewActivity.class);
                    intent.putExtra("WebView",d);
                    d.progress = true;
                    cxt.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    @Override
    public Filter getFilter() {
        return listFilter;
    }

   private Filter listFilter = new Filter() {
       @Override
       protected FilterResults performFiltering(CharSequence constraint) {
        ArrayList<Data> found = new ArrayList<>();

        if(constraint == null || constraint.length() == 0) {
            found.addAll(arrayListFull);
        } else {
            String filterPattern = constraint.toString().toLowerCase().trim();

            for (Data item:arrayListFull)
            {
             if(item.name.toLowerCase().trim().contains(filterPattern))
                 found.add(item);
            }
        }
        FilterResults results = new FilterResults();
        results.values = found;
        return results;
       }


       @Override
       protected void publishResults(CharSequence constraint, FilterResults results) {
        arrayList.clear();
        arrayList.addAll((ArrayList) results.values);
        notifyDataSetChanged();
       }
   };

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView topicTitle,topicDesc,androidInitial;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            androidInitial=itemView.findViewById(R.id.itView);
            topicTitle=itemView.findViewById(R.id.topicTitle);
            topicDesc=itemView.findViewById(R.id.topicDesc);
        }
    }
}

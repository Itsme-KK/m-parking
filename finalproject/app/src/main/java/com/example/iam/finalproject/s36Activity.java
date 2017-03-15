package com.example.iam.finalproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class s36Activity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView lv;
    String[] add = {"CBD Belapur HighWay Parking Lot, CBD Belapur, Navi Mumbai, Maharashtra 400614",
            "Railway Station Car Parking, Sector 29, CBD Belapur, Navi Mumbai, Maharashtra 400614",
            "Parking lot, Sector 29, Belapur, Navi Mumbai, 400614"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s36);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lv = (ListView) findViewById(R.id.listView3);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,add);
        lv.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}

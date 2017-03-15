package com.example.iam.finalproject;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class s2_1Activity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView lv;
    String[] add = {"Car Parking, Pedestrain path, sector 9 , Vashi, Navi Mumbai, Maharashtra 400703",
                    "Navi Mumbai Car Scotter parking area, sector 30, navi mumbai, maharashtra 400703"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s2_1);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lv = (ListView) findViewById(R.id.listView2);
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

        /*lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position)
                {
                    case 0:
                        Intent intent = new Intent("com.example.iam.finalproject.");
                        startActivity(intent);
                        break;
                }
            }
        });*/
    }

}

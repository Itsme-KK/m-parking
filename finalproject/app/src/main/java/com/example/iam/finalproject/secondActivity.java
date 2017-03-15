package com.example.iam.finalproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import java.awt.font.TextAttribute;

public class secondActivity extends AppCompatActivity {

    ArrayAdapter<String> adapter;
    ListView lv1;
    SearchView sv;
    String[] Cities = {"Vashi",
            "Sanpada",
            "Rabale",
            "Nerul",
            "MIDC",
            "Belapur",
            "Panvel"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "maps", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent intent = new Intent("com.example.iam.finalproject.MapsActivity");
                startActivity(intent);
            }
        });

        lv1 = (ListView) findViewById(R.id.listView);
        sv = (SearchView) findViewById(R.id.searchview);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,Cities);
        lv1.setAdapter(adapter);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "You selected item  " + lv1.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
                switch (position) {
                    case 0:
                        Intent intent = new Intent("com.example.iam.finalproject.s2_1Activity");
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent("com.example.iam.finalproject.s22Activity");
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent("com.example.iam.finalproject.s23Activity");
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent("com.example.iam.finalproject.s24Activity");
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent("com.example.iam.finalproject.s25Activity");
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent("com.example.iam.finalproject.s26Activity");
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent("com.example.iam.finalproject.s27Activity");
                        startActivity(intent6);
                        break;
                }
            }
        });

        sv.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String text) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String text) {

                adapter.getFilter().filter(text);
                return false;
            }
        });

    }
}

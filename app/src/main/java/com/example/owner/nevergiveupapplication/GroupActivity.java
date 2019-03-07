package com.example.owner.nevergiveupapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SearchView;

public class GroupActivity extends AppCompatActivity {

    private ListView lstvGroup;
    private SearchView search;

    private TaaskAdapter Group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);


        lstvGroup =(ListView) findViewById(R.id.lstvGroup);
        search=(SearchView)findViewById(R.id.search);
        lstvGroup.setAdapter(Group);
    }
}

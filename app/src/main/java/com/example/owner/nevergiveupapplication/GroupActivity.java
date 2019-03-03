package com.example.owner.nevergiveupapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class GroupActivity extends AppCompatActivity {
    private ListView LvTask;
    private TaaskAdapter taskAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);

        LvTask=(ListView)findViewById(R.id.LstvTask);

    }
}

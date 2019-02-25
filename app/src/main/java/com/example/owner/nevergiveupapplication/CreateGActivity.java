package com.example.owner.nevergiveupapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateGActivity extends AppCompatActivity {

    private EditText etGroupName, etParticipantNum, etParticipantAge, etAdminName;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_g);

        etGroupName=(EditText)findViewById(R.id.etGroupName);
        etParticipantNum=(EditText)findViewById(R.id.etParticipantNum);
        etParticipantAge=(EditText)findViewById(R.id.etParticipantAge);
        etAdminName=(EditText)findViewById(R.id.etAdminName);
        btnCreate=(Button)findViewById(R.id.btnCreate);

        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

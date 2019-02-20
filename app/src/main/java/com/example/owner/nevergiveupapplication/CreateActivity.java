package com.example.owner.nevergiveupapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateActivity extends AppCompatActivity {

     private EditText etGroupNumber, etParticipant, etAge, etAdmin;
     private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        etAdmin = (EditText) findViewById(R.id.etAdmin);
        etAge=(EditText)findViewById(R.id.etAge);
        etGroupNumber=(EditText)findViewById(R.id.etGroupNumber);
        etParticipant=(EditText)findViewById(R.id.etParticipant);
        btnCreate=(Button)findViewById(R.id.btnCreate);


        btnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}

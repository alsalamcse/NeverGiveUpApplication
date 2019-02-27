package com.example.owner.nevergiveupapplication;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import javax.security.auth.login.LoginException;

public class signInActivity extends AppCompatActivity {
    private EditText etNickName, etName, etAge, etEmail, etPhone, etPassword;
    private Button btnLogIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        etNickName = (EditText) findViewById(R.id.etNickName);
        etName = (EditText) findViewById(R.id.etName);
        etAge= (EditText) findViewById(R.id.etAge);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etPhone= (EditText)findViewById(R.id.etPhone);
        etPassword=(EditText)findViewById(R.id.etPassword);
        btnLogIn = (Button) findViewById(R.id.btnLogIn);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
        {
            Intent i = new Intent(getApplicationContext(), null);
            startActivity(i);
        }

    });
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dataHandler();
            }
        });

    }
    private void dataHandler()
    {
        String email=etEmail.getText().toString();
        String Age=etAge.getText().toString();
        String NickName=etNickName.getText().toString();
        String Name=etName.getText().toString();
        String Phone=etPhone.getText().toString();
        String Password=etPassword.getText().toString();

    }
}

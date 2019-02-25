package com.example.owner.nevergiveupapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class SignUpActivity extends AppCompatActivity {

    FirebaseAuth auth;//to establish sign in sign up
    FirebaseUser user;//user

    private EditText etNickName, etPassword;
    private Button btnSignIn,btnSignUp, btnCreateGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup3);

        etNickName=(EditText)findViewById(R.id.etNickName);
        etPassword=(EditText)findViewById(R.id.etPassword);
        btnSignIn=(Button)findViewById(R.id.btnSignUp);
        btnSignUp=(Button)findViewById(R.id.btnSignUp);
        btnCreateGroup=(Button)findViewById(R.id.btnCreateGroup);
        auth=FirebaseAuth.getInstance();
        user=auth.getCurrentUser();

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),signInActivity.class);
                startActivity(i);

            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dataHandler();

            }
        });

        btnCreateGroup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(getApplicationContext(), CreateGActivity.class);
                startActivity(i);
            }
        });
    }

    private void dataHandler()
    {
        String NickName=etNickName.getText().toString();
        String Password=etPassword.getText().toString();

    }
}

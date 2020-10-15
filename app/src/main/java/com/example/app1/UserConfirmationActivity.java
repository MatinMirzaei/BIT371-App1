package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class UserConfirmationActivity extends AppCompatActivity {
    private String username = "Matin";
    private String password = "1986";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_confirmation);


        TextView tv = findViewById(R.id.textView);


        String use1 = getIntent().getStringExtra("USERNAME");
        String pass1 = getIntent().getStringExtra("PASSWORD");

        if (username.equals(use1) && password.equals(pass1)) {
                tv.setText("Welcome " + use1);
            } else {
                tv.setText("Username/Password combination is wrong");
            }

        }
    }

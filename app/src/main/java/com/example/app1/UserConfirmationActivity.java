package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class UserConfirmationActivity extends AppCompatActivity {
    private String username = "Matin";
    private String password = "1986";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_confirmation);

        TextView tv = findViewById(R.id.textView);
        String fixUsername = ("Matin");
        String fixPassword = ("1986");


            if (username.equals(fixUsername) && password.equals(fixPassword)) {
                tv.setText("Welcome " + fixUsername);
            } else {
                tv.setText("Username/Password combination is wrong");
            }

        }
    }

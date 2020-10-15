package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Intent activityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void goToActivity(View view) {
        Log.i("INFO","Logging in to " + UserConfirmationActivity.class.getName());
        EditText user = findViewById(R.id.username);
        EditText pass = findViewById(R.id.password);
        String fixusername = user.getText().toString();
        String fixpassword = pass.getText().toString();


        Intent intent = new Intent (getApplicationContext(),UserConfirmationActivity.class);
        intent.putExtra("USERNAME", fixusername);
        intent.putExtra("PASSWORD", fixpassword);
        startActivity(intent);




    }
}



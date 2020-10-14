package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Intent activityIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void goToActivity(View view) {
        Log.i("INFO", "Transitioning to" + Activity2.class.getName());
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        intent.putExtra("msg", "Hello Activity2!");
        //..This will run the second activity
        startActivity(intent);
    }
}
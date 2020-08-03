package com.example.intentextras;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);

        Intent intent = getIntent();

        String lname = intent.getStringExtra("lname");
        String fname = intent.getStringExtra("fname");

        TextView tvView = (TextView) findViewById(R.id.tvView);
        tvView.setText("Your name is: " + fname + " " + lname);
    }
}
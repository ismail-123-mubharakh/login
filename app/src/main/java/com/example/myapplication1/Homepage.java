package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Homepage extends AppCompatActivity {
    TextView user;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        user=(TextView) findViewById(R.id.textView2);
        i=getIntent();
        String usernme=i.getStringExtra("user");
        user.setText("welcome "+usernme);
    }
}
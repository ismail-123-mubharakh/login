package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         Handler obj1=new Handler();
         obj1.postDelayed(new Runnable() {
             @Override
             public void run() {
                 Intent inter= new Intent(MainActivity.this,SplashScreen.class);
                 startActivity(inter);
             }
         },5000);

    }

}
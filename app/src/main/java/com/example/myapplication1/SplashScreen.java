package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
       // Handler obj=new Handler();
        //obj.postDelayed(new Runnable() {
          //  @Override
            //public void run() {
              //  Intent obj2=new Intent(SplashScreen.this,Loginscreen.class);
                //startActivity(obj2);
            //}
        //},5000);
        Thread obj=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
                Intent internt= new Intent(SplashScreen.this,Loginscreen.class);
                startActivity(internt);

            }
        };
        obj.start();
    }
}
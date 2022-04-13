package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Loginscreen extends AppCompatActivity implements View.OnClickListener {
     Button login;
     EditText un,pw;
     TextView labeltext;
     String username="admin";
     String password="123";
      int clickcount=3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginscreen);
       login= (Button)findViewById(R.id.LoginButton);
       labeltext=(TextView)findViewById(R.id.textView) ;
       un=(EditText)findViewById(R.id.editTextTextPersonName2) ;
       pw=(EditText)findViewById(R.id.editTextTextpassword2) ;
       //Button forget=(Button)findViewById(R.id.ForgetPassword);
        //login.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent i= new Intent(getApplicationContext(),Homepage.class);
                //startActivity(i);
          //  }
        //});
        login.setOnClickListener(this);
       //forget.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String uname = un.getText().toString();
        String psswrd = pw.getText().toString();
        if (username.equals(uname) && password.equals(psswrd)) {
            Intent iw = new Intent(getApplicationContext(), Homepage.class);
            iw.putExtra("user",uname);
            startActivity(iw);

            // Intent vw= new Intent(getApplicationContext(),FOrgetoassword.class);
            //startActivity(vw);
        } else {
            Toast.makeText(getApplicationContext(), "Invalid username and password", Toast.LENGTH_LONG).show();
            clickcount--;
            if (clickcount == 0) {
                login.setEnabled(false);
                labeltext.setText("login blocked");
                labeltext.setTextColor(Color.RED);
            }

        }

        // public void login(View view) {
        //   Toast.makeText(getApplicationContext(),"login success",Toast.LENGTH_LONG).show();
        //}
    }

    public void register(View view) {
        Intent iz=new Intent(getApplicationContext(),FOrgetoassword.class);
        startActivity(iz);
    }
}
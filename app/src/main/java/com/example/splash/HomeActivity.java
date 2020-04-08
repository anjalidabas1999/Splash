package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.net.Inet4Address;

public class HomeActivity extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txt= findViewById(R.id.edittext1);
        Intent intent = getIntent();
        String username= intent.getStringExtra("name");
        String password= intent.getStringExtra("passwrd");
        txt.setText("Hello\n "+ "Your username is - " +username +"\n "+ "Your password is - " + password);


    }
}

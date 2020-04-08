package com.example.splash;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button buttonLogin;
    EditText txtuser, txtpswrd;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txtpswrd=findViewById(R.id.textviewusn);
        txtuser=findViewById(R.id.textviewpswrd);

        buttonLogin= findViewById(R.id.btnlogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username= txtuser.getText().toString();
                password= txtpswrd.getText().toString();
                if (username.equals("Anjali") && password.equals("Anjali")){
                    Intent intent= new Intent(LoginActivity.this,HomeActivity.class);
                    intent.putExtra("name", username);
                    intent.putExtra("passwrd", password);
                    intent.putExtra("message", "Hello");
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(LoginActivity.this, "Invalid Details", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

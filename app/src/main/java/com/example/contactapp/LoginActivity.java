package com.example.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText txtUser, txtPass;
    private Button buttonLogin;
    private String username = "admin";
    private String password = "admin";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText txtUser = findViewById(R.id.txtUser);
        EditText txtPass = findViewById(R.id.txtPass);
        Button login = findViewById(R.id.buttonLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtUser.getText().toString().equalsIgnoreCase(username) && txtPass.getText().toString().equalsIgnoreCase(password)){
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                }else{
                    Toast.makeText(LoginActivity.this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
package com.beykentuni.kanbagisuygulamasiv3;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textfield.TextInputEditText;

public class Register extends AppCompatActivity {

    TextInputEditText editTextEmail,editTextPassword,editTextPassword2;
    Button registerButton,gobackButton;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register);



        // XML deki Bileşenleri buraya bağladık
        editTextEmail = findViewById(R.id.editEmail);
        editTextPassword = findViewById(R.id.registerPassword);
        editTextPassword2 = findViewById(R.id.registerPassword2);
        registerButton = findViewById(R.id.registerButton);
        gobackButton=findViewById(R.id.goBackButton);

        // Kullanıcı Oluştur butonuna basma eylemi ekledik
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String email ve password değişkeni oluşturduk
                // bu değişkenleri tasarımda mail ve şifre giriş yerine bağladık
                String email,password;
                email = editTextEmail.getText().toString();
                password =editTextPassword.getText().toString();
            }
        });
        }
    }


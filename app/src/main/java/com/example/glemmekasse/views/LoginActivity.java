package com.example.glemmekasse.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.glemmekasse.MainActivity;
import com.example.glemmekasse.R;

public class LoginActivity extends AppCompatActivity {

    private TextView signup,forget_password;
    private Button login_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        signup=findViewById(R.id.signup);
        forget_password=findViewById(R.id.forget_password);
        login_button=findViewById(R.id.login_button);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup_intent=new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(signup_intent);
            }
        });

        forget_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup_intent=new Intent(LoginActivity.this,forget_password.class);
                startActivity(signup_intent);
            }
        });

        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_intent=new Intent(LoginActivity.this, MainActivity.class);
                login_intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(login_intent);
            }
        });
    }

}
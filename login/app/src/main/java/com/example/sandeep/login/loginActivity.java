package com.example.sandeep.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginActivity extends AppCompatActivity {
    EditText mTextUsername;
    EditText mTextPassword;
    Button mButtonLogin;
    TextView mTextViewRegister;
    database db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        db=new database(this);
        mTextUsername=(EditText)findViewById(R.id.username);
        mTextPassword=(EditText)findViewById(R.id.password);
        mButtonLogin=(Button) findViewById(R.id.btn_login);
        mTextViewRegister=(TextView) findViewById(R.id.register);
        mTextViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerintent=new Intent(loginActivity.this,registerActivity.class);
                startActivity(registerintent);
            }
        });


        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextUsername.getText().toString().trim();
                String pwd = mTextPassword.getText().toString().trim();
                boolean res = db.checkuser(user, pwd);
                if (res == true) {
                    Toast.makeText(loginActivity.this, "LOGIN SUCCESSFULL...!!!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(loginActivity.this, "LOGIN ERROR...!!!", Toast.LENGTH_SHORT).show();

                }
            }
            });
    }
}

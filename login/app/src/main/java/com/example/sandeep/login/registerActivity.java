package com.example.sandeep.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class registerActivity extends AppCompatActivity {
    database db;
    EditText mTextUsername;
    EditText mTextPassword;
    EditText mTextPhno;
    EditText mTextCmfPassword;
    Button mButtonRegister;
    TextView mTextViewlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        db = new database(this);
        setContentView(R.layout.activity_register);
        mTextUsername=(EditText)findViewById(R.id.username);
        mTextPassword=(EditText)findViewById(R.id.password);
        mTextCmfPassword=(EditText)findViewById(R.id.cm_password);
        mButtonRegister=(Button) findViewById(R.id.btn_register);
        mTextViewlogin=(TextView) findViewById(R.id.text_login);
        mTextViewlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(registerActivity.this, loginActivity.class);
                startActivity(loginIntent);
            }
        });
        mButtonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = mTextUsername.getText().toString().trim();
                String phno = mTextPhno.getText().toString().trim();
                String pass = mTextPassword.getText().toString().trim();
                String cmfpass = mTextCmfPassword.getText().toString().trim();

                if (pass.equals(cmfpass)) {
                    long value = db.adduser(user, phno, pass);
                    if (value < 0)
                        Toast.makeText(registerActivity.this, "EMPTY...", Toast.LENGTH_SHORT).show();

                    Toast.makeText(registerActivity.this, "registered SUCCESSFULL...!!!", Toast.LENGTH_SHORT).show();
                    Intent ML = new Intent(registerActivity.this, loginActivity.class);
                    startActivity(ML);
                } else {
                    Toast.makeText(registerActivity.this, "ERROR!!!", Toast.LENGTH_SHORT).show();

                }}
            });
    }
}

package com.example.pradeeps.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
            TextView et1 = (TextView) findViewById(R.id.et1);
            TextView et2 = (TextView) findViewById(R.id.et2);
            TextView et3 = (TextView) findViewById(R.id.et3);
            TextView et4 = (TextView) findViewById(R.id.et4);
            TextView et5 = (TextView) findViewById(R.id.et5);
            TextView et6 = (TextView) findViewById(R.id.et6);
            Button btn3 = (Button) findViewById(R.id.btn3);
            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent start3 = new Intent(getApplicationContext(),MainActivity4.class);
                    startActivity(start3);
                }
            });

        }

    }


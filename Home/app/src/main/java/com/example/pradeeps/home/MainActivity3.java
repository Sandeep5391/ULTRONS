package com.example.pradeeps.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
            TextView et7 = (TextView) findViewById(R.id.et7);
            TextView et8 = (TextView) findViewById(R.id.et8);
            TextView et9 = (TextView) findViewById(R.id.et9);
            Button btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent start4 = new Intent(getApplicationContext(),MainActivity5.class);
                startActivity(start4);
            }
        });
    }
}

package com.example.pradeeps.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity6 extends AppCompatActivity {
    Button click;
    public static TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        click=(Button)findViewById(R.id.btn9);
        data=(TextView)findViewById(R.id.tex2);

    click.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            fetchData process=new  fetchData();
            process.execute();
        }
    });}
}

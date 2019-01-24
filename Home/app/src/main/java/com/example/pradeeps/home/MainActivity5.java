package com.example.pradeeps.home;


import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.jsoup.Jsoup;
import org.w3c.dom.Document;

public class MainActivity5 extends AppCompatActivity {
    TextView texx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    texx=(TextView)findViewById(R.id.tex1);
        Button btn8=(Button)findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new doit().execute();
            }
        });
    }

    public class doit extends AsyncTask<Void, Void, Void> {
        String words;
        @Override
        protected Void doInBackground(Void... voids) {
            try {
                Document doc;
                doc = (Document) Jsoup.connect("https://www.google.com").get();
                words = doc.getTextContent();
                texx.setText("words");

            } catch (Exception e) {
                e.printStackTrace();
            }

                return null;

        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            texx.setText(words);
        }
    }
}

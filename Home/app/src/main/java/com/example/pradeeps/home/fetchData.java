package com.example.pradeeps.home;

import android.os.AsyncTask;
import android.widget.TextView;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<Void,Void,Void>
{
String data="";
    @Override
    protected Void doInBackground(Void... voids) {
        try {
            URL url=new URL("https://api.myjason.com/bins/ykyek");
            HttpURLConnection httpURLconnection=(HttpURLConnection) url.openConnection();
            InputStream inputstream=new BufferedInputStream(httpURLconnection.getInputStream());
            BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputstream));
            String line="";
            while(line!=null){
                line=bufferedReader.readLine();
                data = data + line;
            }
        }catch(MalformedURLException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }
return null;
    }
    @Override
    protected void onPostExecute(Void aVoid){
    super.onPostExecute(aVoid);
    MainActivity6.data.setText(this.data);
    }
}

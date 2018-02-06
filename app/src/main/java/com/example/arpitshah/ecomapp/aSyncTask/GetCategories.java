package com.example.arpitshah.ecomapp.aSyncTask;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by arpitshah on 2/5/18.
 */

public class GetCategories extends AsyncTask<String, Void, String>
{
    public static final String REQUEST_METHOD = "GET";
    public static final int READ_TIMEOUT = 15000;
    public static final int CONNECTION_TIMEOUT = 15000;
    String output;

    @Override
    protected String doInBackground(String[] params){
        String result=null;
        String inputLine;

        try {
            //Create a URL object holding our url
            URL myUrl = new URL("http://skolonetapp.yousoftech.com/api/master/getcollection");
            //Create a connection
            HttpURLConnection connection =(HttpURLConnection)
                    myUrl.openConnection();
            //Set methods and timeouts
            connection.setRequestMethod("GET");


            //Connect to our url
            connection.connect();
            //Create a new InputStreamReader
            InputStreamReader streamReader = new
                    InputStreamReader(connection.getInputStream());
            //Create a new buffered reader and String Builder
            BufferedReader reader = new BufferedReader(streamReader);
            StringBuilder stringBuilder = new StringBuilder();
            //Check if the line we are reading is not null
            while((inputLine = reader.readLine()) != null){
                stringBuilder.append(inputLine);
            }
            //Close our InputStream and Buffered reader
            reader.close();
            streamReader.close();
            //Set our result equal to our stringBuilder
            result = stringBuilder.toString();
            Log.d("asdasd",result+"");

            output=result;
        }catch(IOException e){
            e.printStackTrace();
            result = null;
        }
        return result;
    }
    @Override
    protected void onPostExecute(String result){
        Context context = null;
        super.onPostExecute(result);
         //Toast.makeText(context, output, Toast.LENGTH_LONG);
    }
}

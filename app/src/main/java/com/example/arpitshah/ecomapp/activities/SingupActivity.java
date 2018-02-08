package com.example.arpitshah.ecomapp.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.arpitshah.ecomapp.R;
/**
 * Created by Admin on 08-02-2018.
 */


public class SingupActivity extends AppCompatActivity {

    Button btnmobile;
    Context context;
    EditText edtmobile;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_signup);
        btnmobile=(Button)findViewById( R.id.btnmobile );
        edtmobile=(EditText) findViewById( R.id.edtmobile );

        btnmobile.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent( getApplication(),activity_otp.class );
                intent.putExtra( "type","mobile" );
                startActivity( intent );
            }
        } );

        setTitle("SING UP");

    }
}

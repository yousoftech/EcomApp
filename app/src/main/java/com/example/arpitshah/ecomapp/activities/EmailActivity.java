package com.example.arpitshah.ecomapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.arpitshah.ecomapp.*;

public class EmailActivity extends AppCompatActivity {

    Button btnemail;
    EditText edtemail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_email );
        btnemail=(Button)findViewById( R.id.btnemail );
        edtemail=(EditText) findViewById( R.id.edtemail );
        setTitle( "Email Verification" );
        btnemail.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent( getApplicationContext(),activity_otp.class );
                intent.putExtra( "type", "email");
                startActivity( intent );
            }

        } );

    }

}

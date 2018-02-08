package com.example.arpitshah.ecomapp.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.arpitshah.ecomapp.*;

public class RegistrationActivity extends AppCompatActivity {

    Button btnsubmit;
    EditText edtfname,edtlname,edtpassword,edtrepassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_registration );

        btnsubmit=(Button)findViewById(R.id.btnfinish);
        edtfname=(EditText)findViewById( R.id.edtfname );
        edtlname=(EditText)findViewById( R.id.edtlname );
        edtpassword=(EditText)findViewById( R.id.edtpassword);
        edtrepassword=(EditText)findViewById( R.id.edtrepassword );

        btnsubmit.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent;
                intent=new Intent( getApplicationContext(),LoginActivity.class );
                startActivity( intent );
            }
        } );
    }
}

package com.example.arpitshah.ecomapp.activities;

import android.content.Intent;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.arpitshah.ecomapp.R;

import org.w3c.dom.Text;


public class activity_otp extends AppCompatActivity {

    Button btnotp;
    EditText edtotp;
    TextView txtCatption;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_otp );
        setTitle( "OTP" );

        btnotp = (Button) findViewById( R.id.btnotp );
        edtotp = (EditText) findViewById( R.id.edtotp );
        txtCatption = (TextView)findViewById( R.id.txtOTPCaption );
        String type ;
        Intent intent = getIntent();
        type = intent.getStringExtra("type");

               if(type.equalsIgnoreCase( "email" ))
               {
                   txtCatption.setText( "Enter the code you have received by Email in order to verify your email id" + " ");
               }
               else
               {
                   txtCatption.setText( "Enter the code you have received by SMS in order to verify your mobile number" + " ");
               }


        btnotp.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();
                String strType = intent.getStringExtra("type");

                if(strType.equalsIgnoreCase( "mobile" )) {
                    Intent intentRedirect;
                    intentRedirect = new Intent( getApplicationContext(), EmailActivity.class );
                    startActivity( intentRedirect );
                }

                else if(strType.equalsIgnoreCase( "email" ))

                {
                    Intent intentRedirect1;
                    intentRedirect1 = new Intent( getApplicationContext(), RegistrationActivity.class );
                    startActivity( intentRedirect1 );
                }


            }
        } );

    }
}

package com.example.arpitshah.ecomapp.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.arpitshah.ecomapp.R;
import com.example.arpitshah.ecomapp.Util.ConnectionDetector;

public class SplashActivity extends AppCompatActivity {

    ConnectionDetector detector;
    Button btnretry;
TextView tv;
ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        btnretry = (Button) findViewById(R.id.btnRetry);
        detector = new ConnectionDetector(this);
        iv=(ImageView)findViewById( R.id.iv ) ;
        tv=(TextView)findViewById( R.id.tv);
        @SuppressLint("ResourceType") Animation myAnim = AnimationUtils.loadAnimation( getApplicationContext(),R.transition.mytransition );
        iv.startAnimation( myAnim );
        tv.startAnimation( myAnim );

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    if (detector.isConnectingToInternet()) {
                        btnretry.setVisibility(View.GONE);

                        startActivity(new Intent(SplashActivity.this, MainActivity.class));
                        finish();
                    } else {
                        btnretry.setVisibility(View.VISIBLE);
                        btnretry.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                if (detector.isConnectingToInternet()) {
                                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                                } else {
                                    Toast.makeText(SplashActivity.this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                        Toast.makeText(SplashActivity.this, "Check Your Internet Connection", Toast.LENGTH_SHORT).show();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 4000);
    }
}

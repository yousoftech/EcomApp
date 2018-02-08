package com.example.arpitshah.ecomapp.activities;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.arpitshah.ecomapp.R;
import com.example.arpitshah.ecomapp.fragments.chai;
import com.example.arpitshah.ecomapp.fragments.fragment_cart;
import com.example.arpitshah.ecomapp.fragments.home_fragment;
import com.example.arpitshah.ecomapp.fragments.*;


public class Navigation extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Boolean isFirst=false; TextView txtHeader;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnCart = (Button)findViewById( R.id.btnCart );
         txtHeader = (TextView)findViewById( R.id.heading );
        txtHeader.setText( "Categories" + " ");

        btnCart.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragment_cart cart = new fragment_cart();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.navConent,cart,cart.getTag()).commit();
                setTitle("My Cart");

            }
        } );

      //  home_fragment home_fragment =new home_fragment();
        //FragmentManager fragmentManager=getSupportFragmentManager();
       // fragmentManager.beginTransaction().replace(R.id.nav_view,home_fragment,home_fragment.getTag());
      /*  FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        home_fragment home = new home_fragment();
        FragmentManager fragmentManager1 = getSupportFragmentManager();
        fragmentManager1.beginTransaction().replace(R.id.navConent,home,home.getTag()).commit();
        setTitle("Home");

        isFirst=true;
    }

    @Override
    public void onBackPressed ( ) {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }



    //@Override
 //   public boolean onOptionsItemSelected (MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
   //     int id = item.getItemId();

        //noinspection SimplifiableIfStatement
     //   if (id == R.id.action_settings) {
       //     return true;
       // }

        //return super.onOptionsItemSelected(item);
//    }

    @SuppressLint("ResourceType")
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected (MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cart) {
            // Handle the camera action
            fragment_cart cart = new fragment_cart();
           FragmentManager fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,cart,cart.getTag()).commit();
            setTitle("My Cart");


        }
        else if(id==R.id.nav_home)
        {
            home_fragment home = new home_fragment();
            FragmentManager fragmentManager1 = getSupportFragmentManager();
            fragmentManager1.beginTransaction().replace(R.id.navConent,home,home.getTag()).commit();
            setTitle("Home");


        }
            else if (id == R.id.nav_chai) {

            chai chai_f=new chai();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,chai_f,chai_f.getTag()).commit();
            setTitle("Chai");

        } else if (id == R.id.nav_feedback) {
            FeedbackFragment feedback=new FeedbackFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,feedback,feedback.getTag()).commit();
            setTitle("FeedBack");
            txtHeader.setText( "Categories" + " ");

        } else if (id == R.id.nav_order) {
            orderhistoryFragment order =new orderhistoryFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,order,order.getTag()).commit();
            setTitle("Order History");

        } else if (id == R.id.nav_other) {
            otherFragment other=new otherFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,other,other.getTag()).commit();
            setTitle("Other");


        } else if (id == R.id.nav_profile) {

            profileFragment profile=new profileFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,profile,profile.getTag()).commit();
            setTitle("Profile");

        }
        else if (id == R.id.nav_rajnigandha) {
            rajnigandha_fragment rajni=new rajnigandha_fragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,rajni,rajni.getTag()).commit();
            setTitle("Rajni Gandha");

        }else if (id == R.id.nav_sutta) {
            sutta_fragment sutta=new sutta_fragment();
            FragmentManager fragmentManager=getSupportFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.navConent,sutta,sutta.getTag()).commit();
            setTitle("Sutta Cigarate");

        }
        else if (id == R.id.nav_Track) {
            trackorderFragment track =new trackorderFragment();
            FragmentManager fragmentManager=getSupportFragmentManager();

            fragmentManager.beginTransaction().replace(R.id.navConent,track,track.getTag()).commit();
            setTitle("Track Order");
        }
        else if (id == R.id.nav_logout) {
            Intent i=new Intent(this,LoginActivity.class);
            startActivity(i);

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

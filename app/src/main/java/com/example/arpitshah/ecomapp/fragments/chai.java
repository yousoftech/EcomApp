package com.example.arpitshah.ecomapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arpitshah.ecomapp.R;
import com.example.arpitshah.ecomapp.adapter.mainproductlistadapter;
import com.example.arpitshah.ecomapp.adapter.productAdapter;
import com.example.arpitshah.ecomapp.pojo.product;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class chai extends Fragment {

    RecyclerView recyclerView;
    ArrayList<product> prouctList =  new ArrayList<product>(  );
    mainproductlistadapter adapMainProd;

    public chai ( ) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chai, container, false);

        recyclerView = (RecyclerView)view.findViewById(R.id.productlist);

        databind();




        return view;



    }
    public void databind()
    {
        product p1= new product();
        p1.setProductcategory( "Chai" );
        p1.setProductdescription( "Masala chai is a flavoured tea beverage made by brewing black tea with a mixture of aromatic Indian spices and herbs." );
        p1.setProductid("1");
        p1.setProductprice( "500" );
        p1.setProductname( "Masala Chai" );
        prouctList.add( p1 );
        product p2= new product();
        p2.setProductcategory( "Chai" );
        p2.setProductdescription( "Masala chai is a flavoured tea beverage made by brewing black tea with a mixture of aromatic Indian spices and herbs." );
        p2.setProductid("1");
        p2.setProductprice( "500" );
        p2.setProductname( "Masala Chai" );
        prouctList.add( p2 );

        adapMainProd = new mainproductlistadapter(getContext(), prouctList);
        recyclerView.setAdapter(adapMainProd);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));



    }

}

package com.example.arpitshah.ecomapp.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arpitshah.ecomapp.R;

/**
 * Created by arpitshah on 2/6/18.
 */

public class fragment_cart extends Fragment {


    public fragment_cart ( ) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cart, container, false);
    }
}

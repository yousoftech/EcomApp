package com.example.arpitshah.ecomapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.arpitshah.ecomapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class otherFragment extends Fragment {


    public otherFragment ( ) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_other1, container, false);
    return view;

    }

}

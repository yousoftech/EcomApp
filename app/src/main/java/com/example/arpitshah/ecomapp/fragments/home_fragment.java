package com.example.arpitshah.ecomapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.arpitshah.ecomapp.R;
import com.example.arpitshah.ecomapp.adapter.categoryAdapter;
import com.example.arpitshah.ecomapp.pojo.Category;

import java.util.ArrayList;
import java.util.zip.Inflater;

/**
 * A simple {@link Fragment} subclass.
 */
public class home_fragment extends Fragment {

    RecyclerView recyclerView;
    TextView txtHeader;
    Category  cat = new Category();
    ArrayList<Category> catList = new ArrayList<Category>();
    categoryAdapter adap;
    public home_fragment ( ) {
        // Required empty public constructor
    }


    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container,
                              Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerCategory);
        databind();


        // Inflate the layout for this fragment
        return view;
    }
    public void databind(){

        cat.setCategoryName( "Ice Tea" );
        cat.setCategoryPrice( "Rs 80");
        cat.setCategoryDescription( "Iced tea although a common misconception, ice tea is not actual tea. Though usually served in a glass with ice, it can refer to any tea that has been chilled or cooled. It may or may not be sweetened. Iced tea is also a popular packaged drink." );

        catList.add( cat );
        Category  cat1 = new Category();

        cat1.setCategoryName( "Hot Milk Tea" );
        cat1.setCategoryPrice( "Rs 30");
        cat1.setCategoryDescription( "Milk tea refers to several forms of beverage found in many cultures, containing some combination of tea and milk. ");
                 catList.add(cat1);

        Category  cat3 = new Category();

        cat3.setCategoryName( "Green Tea" );
        cat3.setCategoryPrice( "Rs 50");
        cat3.setCategoryDescription( "Green tea is a type of tea that is made from Camellia sinensis leaves that have not undergone the same withering and oxidation process used to make oolong teas and black teas.");
        catList.add(cat3);


        adap = new categoryAdapter(getContext(), catList);
        recyclerView.setAdapter(adap);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));

    }

}

package com.example.arpitshah.ecomapp.adapter;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.VideoView;

import com.example.arpitshah.ecomapp.R;
import com.example.arpitshah.ecomapp.Util.ConnectionDetector;
import com.example.arpitshah.ecomapp.pojo.*;
import com.hariofspades.incdeclibrary.IncDecCircular;

import java.util.ArrayList;

/**
 * Created by RahulR on 2/19/2018.
 */

public class mainproductlistadapter extends RecyclerView.Adapter<mainproductlistadapter.RecyclerViewHolder> {
    Context context;
    ArrayList<product> event;
    LayoutInflater inflater;


    ArrayList<String> values=new ArrayList<>();


    public  mainproductlistadapter(Context context,ArrayList<product> event) {
        this.event = event;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService( context.LAYOUT_INFLATER_SERVICE );
    }

    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=inflater.inflate (R.layout.mainproductlist_row, parent,false );
        RecyclerViewHolder holder= new RecyclerViewHolder (view);
         return holder;

    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
       values.add( "1" );
        values.add( "2" );
        values.add( "3" );
        values.add( "4" );
        values.add( "5" );
        values.add( "6" );
        values.add( "7" );
        values.add( "8" );
        values.add( "9" );
        values.add( "10" );


        String image=event.get (position).getProductimage ();
        String productname=event.get (position).getProductname ();
        String productid=event.get (position).getProductid ();
        String productcategory=event.get (position).getProductcategory ();
        String productdescription=event.get (position).getProductdescription ();
        String productprice=event.get (position).getProductprice ();
        holder.txtproductdesname.setText (productdescription);
        //holder.productimage.setIm
        holder.txtproductname.setText( productname );
        holder.txtproductprice.setText (productprice);
       holder.incdec.setConfiguration( LinearLayout.HORIZONTAL,IncDecCircular.TYPE_ARRAY,
                IncDecCircular.DECREMENT,IncDecCircular.INCREMENT);
        holder. incdec.setArrayList(values  );
        holder. incdec.setArrayIndexes(0,9,1);
        holder. incdec.enableLongPress(true,true,500);

    }

    @Override
    public int getItemCount() {return event.size();}

    public  class  RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView txtproductname,txtproductprice,txtproductdesname,txtproductquantity;
        Button btnproductaddcart;
        ImageView productimage;
        IncDecCircular incdec;

        public RecyclerViewHolder(View itemView) {
            super (itemView);
            txtproductdesname=(TextView)itemView.findViewById (R.id.txtproductdesname);
            txtproductname=(TextView)itemView.findViewById (R.id.txtproductname);
             incdec=(IncDecCircular)itemView.findViewById(R.id.incdec);

            // txtproductquantity=(TextView)itemView.findViewById (R.id.txtproductquantity);
          //  btnproductaddcart=(Button)itemView.findViewById (R.id.btnproductaddcart);
            productimage=(ImageView)itemView.findViewById (R.id.productimage);
            txtproductprice=(TextView)itemView.findViewById (R.id.txtproductprice);
            ArrayList<String> values=new ArrayList<>();
            values.add("Apple");
            values.add("Ball");
            values.add("Cat");
            values.add("Dog");
            values.add("Elephant");


        }
    }
}

package com.example.arpitshah.ecomapp.adapter;

import android.app.ProgressDialog;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.arpitshah.ecomapp.pojo.Category;
import com.example.arpitshah.ecomapp.R;
import com.example.arpitshah.ecomapp.Util.ConnectionDetector;

import java.util.ArrayList;

/**
 * Created by Admin on 09-02-2018.
 */

public class categoryAdapter  extends RecyclerView.Adapter<categoryAdapter.RecyclerViewHolder> {

    Context context;
    ArrayList<Category> event;
    LayoutInflater inflater;
    ProgressDialog progressDialog;
    ConnectionDetector detector;
    String Id, fId, type;
    String reminderDate;
    float a;

    public categoryAdapter(Context context, ArrayList<Category> event) {
        this.event = event;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService( context.LAYOUT_INFLATER_SERVICE );
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate( R.layout.categoryrecyclerrow, parent, false );
        RecyclerViewHolder holder = new RecyclerViewHolder( view );
        return holder;
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {

        String categoryName = event.get( position ).getCategoryName();
        String categoryImage = event.get( position ).getCategoryImage();
        String categoryPrice = event.get( position ).getCategoryPrice();
        String categoryDescriptiom = event.get( position ).getCategoryDescription();
        holder.txt_CategoryName.setText( categoryName );
        holder.txt_CategoryDescription.setText( categoryDescriptiom );
        holder.txt_CategoryPrice.setText(categoryPrice);
       // holder.CategoryImage.setImageResource(R.drawable.chaiback );
    }


    @Override
    public int getItemCount() {
        return event.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {

        TextView txt_CategoryName, txt_CategoryPrice,txt_CategoryDescription;
        ImageView CategoryImage;


        public RecyclerViewHolder(View itemView) {
            super( itemView );
            txt_CategoryName = (TextView) itemView.findViewById( R.id.txt_Category_Name );
            CategoryImage = (ImageView)itemView.findViewById( R.id.imageCate );
            txt_CategoryPrice = (TextView) itemView.findViewById( R.id.txt_price );
            txt_CategoryDescription =  (TextView) itemView.findViewById( R.id.description );


        }
    }
}
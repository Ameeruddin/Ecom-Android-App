package com.example.demoapp.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.demoapp.Interface.ItemClickListner;
import com.example.demoapp.R;

public class ProductViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView txtProductName,txtProductDescription,txtProductPrice;
    public ImageView imageView;
    public ItemClickListner Listner;

    public ProductViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView=(ImageView)itemView.findViewById(R.id.product_image);
        txtProductName=(TextView)itemView.findViewById(R.id.product_name);
        txtProductPrice=(TextView)itemView.findViewById(R.id.product_price);
        txtProductDescription=(TextView)itemView.findViewById(R.id.product_description);


    }

    public void setItemClickListner(ItemClickListner listner)
    {
        this.Listner=listner;

    }


    @Override
    public void onClick(View view) {
    Listner.onClick(view,getAdapterPosition(),false);
    }
}

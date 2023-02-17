package com.example.retrofit.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.retrofit.R;
import com.example.retrofit.networking.productResult;

import java.util.List;

public class RVRetrofitAdapter extends RecyclerView.Adapter<RVRetrofitAdapter.RVViewHolderRetrofit> {
    Context mContext;
    List<productResult> productResults;


    public RVRetrofitAdapter(Context mContext, List<productResult> productResults) {
        this.mContext = mContext;
        this.productResults = productResults;
    }

    @Override
    public RVRetrofitAdapter.RVViewHolderRetrofit onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.rv_product_item, parent, false);
        return new RVViewHolderRetrofit(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVRetrofitAdapter.RVViewHolderRetrofit holder, int position) {
       holder.rvTitle.setText(productResults.get(position).getTitle());
        Glide.with(mContext).load(productResults.get(position)
                .getProductImage()).placeholder(R.drawable.img).error(R.drawable.ic_launcher_background).into(holder.rvImage);
    }

    @Override
    public int getItemCount() {
        return productResults.size();
    }

    public class RVViewHolderRetrofit extends RecyclerView.ViewHolder {
        TextView rvTitle;
        ImageView rvImage;


        public RVViewHolderRetrofit(@NonNull View itemView) {
            super(itemView);
            rvTitle= itemView.findViewById(R.id.rvTitle);
            rvImage= itemView.findViewById(R.id.rvImage);
        }
    }
}

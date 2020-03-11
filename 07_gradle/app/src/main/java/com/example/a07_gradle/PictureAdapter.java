package com.example.a07_gradle;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class PictureAdapter extends RecyclerView.Adapter<PictureAdapter.ViewHolder> {

    private Context context;

    public  class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public ViewHolder(View v) {
            super(v);
            imageView = v.findViewById(R.id.ivCell);
        }
    }

    public PictureAdapter(Context context){
        this.context = context;
    }

    @Override
    public PictureAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        View v =  LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cell_layout, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String urlToCall = String.format("https://picsum.photos/500/500?image=%d", position);
        Glide.with(context).clear(holder.imageView);
        Glide.with(context).load(urlToCall).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return 50;
    }
}

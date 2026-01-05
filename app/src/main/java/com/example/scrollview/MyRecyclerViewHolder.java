package com.example.scrollview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyRecyclerViewHolder extends RecyclerView.ViewHolder {

    TextView tv1,tv2;
    public MyRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);
        tv1 = itemView.findViewById(R.id.rv_tv_one);
        tv2 = itemView.findViewById(R.id.rv_tv_two);
    }
}

package com.example.scrollview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewHolder> {
    List<String> nameList;
    List<String> castList;

    public MyRecyclerViewAdapter (List<String> nameList,List<String> castList){
        this.nameList = nameList;
        this.castList = castList;
    }


    @NonNull
    @Override
    public MyRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_item,parent,false);
        return new MyRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyRecyclerViewHolder holder, int position) {
        holder.tv1.setText(nameList.get(position));
        holder.tv2.setText(castList.get(position));

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}

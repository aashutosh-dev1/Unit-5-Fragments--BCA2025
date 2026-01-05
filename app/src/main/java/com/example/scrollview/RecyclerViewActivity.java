package com.example.scrollview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView rv;
    MyRecyclerViewAdapter myRvAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recycler_view);
        rv = findViewById(R.id.recyclerView);

//        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setLayoutManager(new GridLayoutManager(this,3));

        List<String> users = new ArrayList<>();
        List<String> cast = new ArrayList<>();

        users.add("Rose");
        users.add("Rose");
        users.add("Rose");
        users.add("Rose");
        users.add("Rose");

        cast.add("1");
        cast.add("2");
        cast.add("3");
        cast.add("5");
        cast.add("50");
        cast.add("50");




        myRvAdapter = new MyRecyclerViewAdapter(users,cast);
        rv.setAdapter(myRvAdapter);

    }
}
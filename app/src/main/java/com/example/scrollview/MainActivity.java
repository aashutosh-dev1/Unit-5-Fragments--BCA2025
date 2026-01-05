package com.example.scrollview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<PersonDataModel> list;
    private MyCustomListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        list = new ArrayList<>();
        list.add(new PersonDataModel("Ipsit", 21, 35000));
        list.add(new PersonDataModel("Alex", 25, 42000));
        list.add(new PersonDataModel("Sam", 30, 50000));
        list.add(new PersonDataModel("Ipsit", 21, 35000));
        list.add(new PersonDataModel("Alex", 25, 42000));
        list.add(new PersonDataModel("Sam", 30, 50000));

        adapter = new MyCustomListViewAdapter(MainActivity.this, list);
        listView.setAdapter(adapter);
    }
}

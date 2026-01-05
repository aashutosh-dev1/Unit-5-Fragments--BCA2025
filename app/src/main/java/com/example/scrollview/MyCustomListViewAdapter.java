package com.example.scrollview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MyCustomListViewAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<PersonDataModel> list;

    public MyCustomListViewAdapter(Context context, ArrayList<PersonDataModel> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = View.inflate(context, android.R.layout.simple_list_item_1, null);
        }

        TextView text = convertView.findViewById(android.R.id.text1);

        PersonDataModel person = list.get(position);
        text.setText(
                person.getName() + " | Age: " + person.getAge() + " | Salary: " + person.getSalary()
        );

        return convertView;
    }
}

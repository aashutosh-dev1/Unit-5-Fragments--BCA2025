package com.example.unit_5_fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_login, container, false);

        EditText emailEditText = v.findViewById(R.id.et_email);
        EditText passwordEditText = v.findViewById(R.id.et_password);
        Button loginButton = v.findViewById(R.id.btn_press);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(v.getContext(), "Email ->" + emailEditText.getText().toString() + "Password->" + passwordEditText.getText().toString() , Toast.LENGTH_SHORT).show();
            }
        });

        return  v;

    }


}
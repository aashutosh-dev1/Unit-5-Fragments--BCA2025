package com.example.unit_5_fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;

public class MainActivity extends AppCompatActivity {



    FragmentManager myFragmentManager;
    LoginFragment loginFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginFragment = new LoginFragment();
        myFragmentManager = getSupportFragmentManager();
        myFragmentManager.beginTransaction().add(R.id.login_fragment_holder,loginFragment). commit();



        Button button = findViewById(R.id.btn_second_screen);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(i);
            }
        });


//        getSupportFragmentManager().beginTransaction().add(R.id.login_fragment_holder,loginFragment).commit();


    }
}
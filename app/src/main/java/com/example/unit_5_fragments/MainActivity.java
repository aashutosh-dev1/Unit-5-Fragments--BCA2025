package com.example.unit_5_fragments;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
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
    Button popupButton, showDialogButton, button,showCustomDialogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(i);
            }
        });
        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
                MenuInflater inflater = popupMenu.getMenuInflater();
                inflater.inflate(R.menu.menu_popup, popupMenu.getMenu());

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        int id = menuItem.getItemId();
                        if (id == R.id.opt1) {
                            Toast.makeText(MainActivity.this, "Options 1 pressed " + menuItem, Toast.LENGTH_SHORT).show();
                            return true;
                        } else if (id == R.id.opt2) {
                            Toast.makeText(MainActivity.this, "Options 2 pressed", Toast.LENGTH_SHORT).show();
                            return true;
                        } else {
                            Toast.makeText(MainActivity.this, "Options 3 pressed", Toast.LENGTH_SHORT).show();
                            return true;
                        }
                    }
                });


                popupMenu.show();


            }
        });
        showDialogMethod();


        //Displaying custom dialog when button is clicked
        showCustomDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyCustomDialog myCustomDialog = new MyCustomDialog(MainActivity.this);
                myCustomDialog.show();
            }
        });

    }
    public void initViews() {
        button = findViewById(R.id.btn_second_screen);
        showDialogButton = findViewById(R.id.show_alert_dialog);
        popupButton = findViewById(R.id.btn_show_popup);
        showCustomDialogButton = findViewById(R.id.show_custom_dialog);
        loginFragment = new LoginFragment();
        myFragmentManager = getSupportFragmentManager();
        myFragmentManager.beginTransaction().add(R.id.login_fragment_holder, loginFragment).commit();
    }
    public void showDialogMethod() {
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder myAlertDialog = new AlertDialog.Builder(MainActivity.this);
                myAlertDialog.setTitle("This is my Alert Dialog");
                myAlertDialog.setIcon(R.mipmap.ic_launcher);
                myAlertDialog.setMessage("This is the description of the alert dialog");

                myAlertDialog.setPositiveButton("Postive", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });

                myAlertDialog.setNegativeButton("Negative", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                myAlertDialog.create();
                myAlertDialog.show();
            }
        });
    }
}
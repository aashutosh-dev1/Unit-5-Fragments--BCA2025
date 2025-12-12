package com.example.unit_5_fragments;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;

public class MyCustomDialog extends Dialog {
    public MyCustomDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.my_custom_dialog);
        EditText et1 = findViewById(R.id.dialog_email);
        EditText et2 = findViewById(R.id.dialog_pwd);
        Button btn1 = findViewById(R.id.btn_dialog);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dismiss();
                Toast.makeText(context, "" + et1.getText() + "" + et2.getText(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}

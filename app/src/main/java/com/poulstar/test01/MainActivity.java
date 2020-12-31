package com.poulstar.test01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, email, phone, message;
    Button click;
    public String var;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.id_name);
        email = findViewById(R.id.id_email);
        phone = findViewById(R.id.id_phone);
        message = findViewById(R.id.id_message);

        click = findViewById(R.id.id_click);
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var = name.getText() + "\n" +
                        email.getText() + "\n" +
                        phone.getText() + "\n" +
                        message.getText() + "\n";
                Toast.makeText(MainActivity.this, var, Toast.LENGTH_SHORT).show();
            }
        });



    }
}
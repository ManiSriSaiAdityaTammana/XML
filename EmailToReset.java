package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EmailToReset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_to_reset);


        EditText emailET=(EditText)findViewById(R.id.editTextText2);


        Button emailB=(Button) findViewById(R.id.button11);
        emailB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mail;
                mail=emailET.getText().toString();
                if (mail.contains("@vitapstudent.ac.in")) {
                    Intent OtpVeri = new Intent(EmailToReset.this, Reset_Page.class);
                    startActivity(OtpVeri);
                }
                else{
                    Toast.makeText(EmailToReset.this,"Wrong Email given",Toast.LENGTH_LONG).show();
                }
            }
            });





    }
}
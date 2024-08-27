package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Password_Reset extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_reset);

        TextView backToLogin=(TextView)findViewById(R.id.textView9) ;

        Button resPass=(Button) findViewById(R.id.button3);
        resPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pred1=(EditText) findViewById(R.id.editTextTextPassword2);
                EditText pred2=(EditText)findViewById(R.id.editTextTextPassword3);
                String newPass1=pred1.getText().toString();
                String newPass2=pred2.getText().toString();
                if((newPass1.equals(newPass2) && !(newPass1.equals("")))){
                    Toast.makeText(Password_Reset.this, "New Password is Reset", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Password_Reset.this,"Passwords are not matching",Toast.LENGTH_SHORT).show();
                }
            }
        });

        backToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backLoginPage=new Intent(Password_Reset.this,MainActivity.class);
                startActivity(backLoginPage);
            }
        });




    }
}
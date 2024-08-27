package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UserDetails extends AppCompatActivity {


    EditText ud1,ud2,ud3,ud4,ud5,ud6;
    VITAPDB DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        ud1=(EditText)findViewById(R.id.ud1);
        ud2=(EditText)findViewById(R.id.ud2);
        ud3=(EditText)findViewById(R.id.ud3);
        ud4=(EditText)findViewById(R.id.ud4);
        ud5=(EditText)findViewById(R.id.ud5);
        ud6=(EditText)findViewById(R.id.ud6);

        DB=new VITAPDB(this);
        Button newcreated=(Button) findViewById(R.id.udbuttton);

        newcreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=ud1.getText().toString();
                String regNo=ud2.getText().toString();
                String branch=ud3.getText().toString();
                String phno=ud4.getText().toString();
                String email=ud5.getText().toString();
                String password=ud6.getText().toString();

                if (name.equals(null) || regNo.equals(null) || branch.equals(null) || phno.equals(null) || email.equals(null) || password.equals(null))
                    Toast.makeText(UserDetails.this, "some fields are empty", Toast.LENGTH_LONG).show();
                else {
                    if (regNo.contains("BCE") || regNo.contains("BEC") || regNo.contains("bce") || regNo.contains("bec")) {
                        Boolean checkuser = DB.checkusername(regNo);
                        if (checkuser == false) {
                            Boolean insert = DB.insertData(name, regNo, branch, phno, email, password);
                            if (insert == true) {
                                Toast.makeText(UserDetails.this, "Registered successfully\n   Please login", Toast.LENGTH_LONG).show();
                                Intent intent2 = new Intent(UserDetails.this, MainActivity.class);
                                startActivity(intent2);
                            } else
                                Toast.makeText(UserDetails.this, "Registration failed", Toast.LENGTH_SHORT).show();
                        }
                        else {
                            Toast.makeText(UserDetails.this, "User already exists! please sign up", Toast.LENGTH_SHORT).show();
                            Intent loginpage = new Intent(UserDetails.this, MainActivity.class);
                            startActivity(loginpage);
                        }
                    }
                    else
                        Toast.makeText(UserDetails.this, "Not a valid Registration number", Toast.LENGTH_SHORT).show();
                }
            }
            });



       /*Button newcreated=(Button) findViewById(R.id.udbuttton);
        newcreated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(UserDetails.this, "    New User created\nPlease Create a Password", Toast.LENGTH_SHORT).show();
                Intent MainActigo=new Intent(UserDetails.this,NewPass.class);
                startActivity(MainActigo);
            }
        });*/




    }
}
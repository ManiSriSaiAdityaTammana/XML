package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class NewPass extends AppCompatActivity {
    VITAPDB DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pass);

        Button resPass=(Button) findViewById(R.id.buttonnew);
        resPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText pred1=(EditText) findViewById(R.id.editTextTextPassword2);
                EditText pred2=(EditText)findViewById(R.id.editTextTextPassword3);
                String newPass1=pred1.getText().toString();
                String newPass2=pred2.getText().toString();
                if((newPass1.equals(newPass2) && !(newPass1.equals("")))){
                   // DB.insertPass(newPass1);
                    Toast.makeText(NewPass.this, "New Account is Created\n    Please login", Toast.LENGTH_SHORT).show();
                    Intent newAcc=new Intent(NewPass.this,MainActivity.class);
                    startActivity(newAcc);
                }
                else{
                    Toast.makeText(NewPass.this,"Passwords are not matching",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
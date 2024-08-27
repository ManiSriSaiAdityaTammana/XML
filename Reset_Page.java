package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reset_Page extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_page);

        EditText red1,red2,red3,red4;
        red1=(EditText)findViewById(R.id.ed1);
        red2=(EditText)findViewById(R.id.ed2);
        red3=(EditText)findViewById(R.id.ed3);
        red4=(EditText)findViewById(R.id.ed4);



        Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String resOTP="";
                resOTP+=red1.getText().toString();
                resOTP+=red2.getText().toString();
                resOTP+=red3.getText().toString();
                resOTP+=red4.getText().toString();
                if((resOTP.equals("1234"))) {
                    Toast.makeText(Reset_Page.this, "Correct OTP", Toast.LENGTH_SHORT).show();
                    Intent resetPass = new Intent(Reset_Page.this,Password_Reset.class);
                    startActivity(resetPass);
                }
                else{
                    Toast.makeText(Reset_Page.this, "Wrong OTP", Toast.LENGTH_SHORT).show();
                }
            }
        });

        

    }
}
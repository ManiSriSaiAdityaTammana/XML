package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Profile extends AppCompatActivity {

    EditText editet1,editet2,editet3,prof1;
    VITAPDB DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        DB=new VITAPDB(this);




        /*prof1=(EditText)findViewById(R.id.prof1);
        prof1.setText();*/
        TextView tvp2=(TextView) findViewById(R.id.textView13);
        editet1=(EditText)findViewById(R.id.editet1);
        editet2=(EditText)findViewById(R.id.editet2);
        editet3=(EditText)findViewById(R.id.editet3);

        TextView tvp1=(TextView) findViewById(R.id.textView11);
        tvp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inEdit=new Intent(Profile.this,EditProfile.class);
                Toast.makeText(Profile.this, "Editable fields are empty", Toast.LENGTH_SHORT).show();
                if (inEdit.resolveActivity(getPackageManager()) != null) {
                    startActivity(inEdit);
                }
                    /*Bundle b1=getIntent().getExtras();
                    editet1.setText(b1.getString("Phno"));
                    editet2.setText(b1.getString("Email"));
                    editet3.setText(b1.getString("Address"));
                    /*tvp2.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent backBu=new Intent(Profile.this, MainPage.class);
                            if (backBu.resolveActivity(getPackageManager()) != null) {
                                startActivity(backBu);

                        }
                    });*/
                }
            });


        tvp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backBu=new Intent(Profile.this, MainPage.class);
                if (backBu.resolveActivity(getPackageManager()) != null) {
                    startActivity(backBu);
                }

            }
        });

    }
}
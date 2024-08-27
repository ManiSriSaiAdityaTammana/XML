package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);



        TextView editTv1=(TextView)findViewById(R.id.textView12);
        editTv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edet1,edet2,edet3;
                edet1=(EditText) findViewById(R.id.edet1);
                edet2=(EditText)findViewById(R.id.edet2);
                edet3=(EditText)findViewById(R.id.edet3);
                String s1=edet1.getText().toString();
                String s2=edet2.getText().toString();
                String s3=edet3.getText().toString();
                Intent editFields=new Intent(EditProfile.this, Profile.class);
                Bundle b1=new Bundle();
                b1.putString("Phno",s1);
                b1.putString("Email",s2);
                b1.putString("Address",s3);
                editFields.putExtras(b1);
                if (editFields.resolveActivity(getPackageManager()) != null) {
                    startActivity(editFields);
                }
            }
        });



        //startActivity(editFields);


    }
}
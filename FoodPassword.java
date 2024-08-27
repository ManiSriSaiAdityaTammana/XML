package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FoodPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_password);

       /* Bundle fp=getIntent().getExtras();
        String uName=fp.getString("UserName");

        TextView YName=(TextView)findViewById(R.id.textView14);
        YName.setText(uName);*/

        Button fb=(Button) findViewById(R.id.button9);

        EditText fbp=(EditText)findViewById(R.id.editTextTextPassword4);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(fbp.getText().toString().equals("1234")){
                    Intent PaySucess= new Intent(FoodPassword.this, Payment_Success.class);
                    startActivity(PaySucess);
                }
                else{
                    Toast.makeText(FoodPassword.this, "Incorrect Password!\nPlease Try again", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
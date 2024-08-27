package com.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    VITAPDB DB;
    static int count=3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed1=(EditText)findViewById(R.id.editTextText);
        EditText ed2=(EditText)findViewById(R.id.editTextTextPassword);
        DB=new VITAPDB(this);

       /*Intent FoodPass=new Intent(MainActivity.this, FoodPassword.class);
        Bundle fp=new Bundle();
        fp.putString("UserName",ed1.getText().toString());
        FoodPass.putExtras(fp);*/

        Button b1=(Button)findViewById(R.id.button);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String regNo=ed1.getText().toString();
                String password=ed2.getText().toString();
                if(regNo.equals("")||password.equals(""))
                    Toast.makeText(MainActivity.this,"Please enter all fields",Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=DB.checkusernamepassword(regNo,password);
                    if(checkuserpass==true){
                        //Toast.makeText(MainActivity.this,"Sign in successful",Toast.LENGTH_SHORT).show();
                        Intent intent2=new Intent(MainActivity.this,MainPage.class);
                        Bundle b=new Bundle();
                        b.putString("UrName",regNo);
                        intent2.putExtras(b);
                        startActivity(intent2);
                    }
                    else {
                        if (count>0) {
                            --count;
                            Toast.makeText(MainActivity.this, "Invalid credentials "+count+" attempts left", Toast.LENGTH_SHORT).show();
                        }
                        else{
                            Toast.makeText(MainActivity.this, "Maximum attmepts reached can't login", Toast.LENGTH_SHORT).show();
                            finishAffinity();
                        }
                    }

                }


                /*if(username.equals("1234")&&password.equals("1234")) {
                    //Toast.makeText(MainActivity.this, "Welcome " + username, Toast.LENGTH_SHORT).show();
                    Intent logIn=new Intent(MainActivity.this, MainPage.class);
                    Bundle b=new Bundle();
                    b.putString("UrName",username);
                    logIn.putExtras(b);
                    startActivity(logIn);



                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_LONG).show();
                }*/

            }
        });

        TextView tv3= (TextView) findViewById(R.id.textView3);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(MainActivity.this,"Check your mail",Toast.LENGTH_SHORT).show();
                Intent resetPage = new Intent(MainActivity.this, EmailToReset.class);
                startActivity(resetPage);

            }
        });

        TextView newuser=(TextView) findViewById(R.id.newuser);
        newuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent newu=new Intent(MainActivity.this,UserDetails.class);
                startActivity(newu);
            }
        });
    }

}
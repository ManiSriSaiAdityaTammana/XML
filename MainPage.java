package com.example.mini_project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.tools.jsc.Main;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        AlertDialog.Builder build;
        build = new AlertDialog.Builder(this);
        TextView t1 = (TextView) findViewById(R.id.textView10);
        Bundle b = getIntent().getExtras();
        String s1 = "WELCOME " + b.getString("UrName");
        t1.setText(s1);

        ImageButton ib = (ImageButton) findViewById(R.id.imageButton);
        ib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent prof = new Intent(MainPage.this, Profile.class);
                startActivity(prof);
            }
        });

        ImageView iv = (ImageView) findViewById(R.id.imageView);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                build.setTitle("VIT-AP APP");
                build.setMessage("Do you want to visit VIT-AP WEBSITE");
                build.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intBrow = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vitap.ac.in/"));
                        startActivity(intBrow);
                    }
                });
                build.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();

            }
        });

        Button b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent TimeTable = new Intent(MainPage.this, TimeTable.class);
                startActivity(TimeTable);

            }
        });

        Button b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calci = new Intent(MainPage.this, Calculator.class);
                startActivity(calci);

            }
        });

        Button b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Vcanteen = new Intent(MainPage.this, FoodBilling.class);
                startActivity(Vcanteen);
            }
        });

        Button b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vtopIn = new Intent(Intent.ACTION_VIEW, Uri.parse("https://vtop2.vitap.ac.in/vtop/initialProcess"));
                startActivity(vtopIn);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

       // if(item.getItemId()==R.id.opt1) {
            if (item.getItemId() == R.id.opt11) {
                Intent email =new Intent(MainPage.this,MailtoUni.class);
                startActivity(email);
                //Toast.makeText(this, "E-mail is sent", Toast.LENGTH_SHORT).show();
            }
            else if(item.getItemId()==R.id.opt12){
                Toast.makeText(this, "Calling University", Toast.LENGTH_SHORT).show();
            }
            else if(item.getItemId()==R.id.opt2){
                this.finishAffinity();

            }
       // }
        return super.onOptionsItemSelected(item);
    }

}
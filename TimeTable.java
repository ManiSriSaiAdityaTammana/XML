package com.example.mini_project;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeTable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_table);
        Button b1,b2,b3,b4,b5,b6;
        AlertDialog.Builder mon,tue,wed,thur,fri,sat;

        mon=new AlertDialog.Builder(this);
        tue=new AlertDialog.Builder(this);
        wed=new AlertDialog.Builder(this);
        thur=new AlertDialog.Builder(this);
        fri=new AlertDialog.Builder(this);
        sat=new AlertDialog.Builder(this);

        b1=(Button) findViewById(R.id.day1);
        b6=(Button) findViewById(R.id.day6);
        b5=(Button) findViewById(R.id.day5);
        b4=(Button) findViewById(R.id.day4);
        b3=(Button) findViewById(R.id.day3);
        b2=(Button) findViewById(R.id.day2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mon.setTitle("MONDAY CLASSES");
                mon.setMessage("9-11 AM : CN LAB - AB1-314\n\n11-1 PM : MAD LAB - AB1-309\n\n2-2:50 : STS3006 - AB1-323\n\n3-3:50 : MAD - AB2-212\n\n4-4:50 : DL - AB1-421\n\n5-5:50 : STS2006 - AB1-406");
                mon.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tue.setTitle("TUESDAY CLASSES");
                tue.setMessage("2-2:50 : CN - AB2-G19\n\n3-3:50 : TOC - AB-G10\n\n4-4:50 : MAD - AB2-212\n\n5-5:50 : STS3006 - AB1-323");
                tue.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wed.setTitle("WEDNESDAY CLASSES");
                wed.setMessage("2-2:50 : STS2006 - AB1-406\n\n3-3:50 : DL - AB1-421\n\n4-4:50 : MAD - AB2-212\n\n5-5:50 : STS3006 - AB1-323");
                wed.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thur.setTitle("THURSDAY CLASSES");
                thur.setMessage("2-2:50 : DL - AB1-421\n\n3-3:50 : STS2006 - AB1-406\n\n4-4:50 : CN - AB2-G19\n\n5-5:50 : TOC - AB1-G10");
                thur.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fri.setTitle("FRIDAY CLASSES");
                fri.setMessage("12-12:50 PM : TOC - AB1-G10\n\n2-2:50 : MAD - AB2-212\n\n3-3:50 : STS3006 - AB1-323\n\n4-4:50 : DL - AB1-421\n\n5-5:50 : STS2006 - AB1-406");
                fri.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sat.setTitle("SATURDAY CLASSES");
                sat.setMessage("2-3:50 : CN - AB2-G19\n\n\n4-5:50 : TOC - AB1-G10");
                sat.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).show();
            }
        });


    }
}
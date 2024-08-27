package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class FoodBilling extends AppCompatActivity {


    Integer totalItems;
    Double totalCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_billing);
        TextView tv1=(TextView) findViewById(R.id.foodtv1);
        SpannableString content=new SpannableString("VIT-AP CANTEEN");
        content.setSpan(new UnderlineSpan(),0,content.length(),0);
        tv1.setText(content);
        Button foodOrder=(Button)findViewById(R.id.foodorderB);
        Button foodBill=(Button)findViewById(R.id.FoodBill);

        Spinner sp1,sp2,sp3,sp4,sp5,sp6;
        sp1=findViewById(R.id.item1);
        sp2=findViewById(R.id.item2);
        sp3=findViewById(R.id.item3);
        sp4=findViewById(R.id.item4);
        sp5=findViewById(R.id.item5);
        sp6=findViewById(R.id.item6);


        EditText ed11,ed21,ed31,ed41,ed51,ed61,ed71,ed72;
        /*ed11=findViewById(R.id.fooded11);
        ed21=findViewById(R.id.fooded21);
        ed31=findViewById(R.id.fooded31);
        ed41=findViewById(R.id.fooded41);
        ed51=findViewById(R.id.fooded51);
        ed61=findViewById(R.id.fooded61);*/
        ed71=findViewById(R.id.fooded71);
        ed72=findViewById(R.id.fooded72);


        Integer[] it1={0,1,2,3,4,5};
        ArrayAdapter ad1= new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,it1);
        sp1.setAdapter(ad1);
        Integer[] it2={0,1,2,3,4,5};
        ArrayAdapter ad2= new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,it2);
        sp2.setAdapter(ad2);
        Integer[] it3={0,1,2,3,4,5};
        ArrayAdapter ad3= new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,it3);
        sp3.setAdapter(ad3);
        Integer[] it4={0,1,2,3,4,5};
        ArrayAdapter ad4= new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,it4);
        sp4.setAdapter(ad4);
        Integer[] it5={0,1,2,3,4,5};
        ArrayAdapter ad5= new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,it5);
        sp5.setAdapter(ad5);
        Integer[] it6={0,1,2,3,4,5};
        ArrayAdapter ad6= new ArrayAdapter<Integer>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,it6);
        sp6.setAdapter(ad6);

        foodBill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                totalItems= Integer.parseInt(sp1.getSelectedItem().toString())+Integer.parseInt(sp2.getSelectedItem().toString())+Integer.parseInt(sp3.getSelectedItem().toString())+Integer.parseInt(sp4.getSelectedItem().toString())+Integer.parseInt(sp5.getSelectedItem().toString())+Integer.parseInt(sp6.getSelectedItem().toString());
                totalCost=Integer.parseInt(sp1.getSelectedItem().toString())*120.0+Integer.parseInt(sp2.getSelectedItem().toString())*70.0+Integer.parseInt(sp3.getSelectedItem().toString())*100.0+Integer.parseInt(sp4.getSelectedItem().toString())*50.0+Integer.parseInt(sp5.getSelectedItem().toString())*20.0+Integer.parseInt(sp6.getSelectedItem().toString())*200.0;
                String ediTextone=totalItems.toString();
                ed71.setText(ediTextone);
                String ediTexttwo=totalCost.toString();
                ed72.setText(ediTexttwo);
            }
        });

        foodOrder.setOnClickListener(new View.OnClickListener() {
            @Override
             public void onClick(View v) {
                totalItems= Integer.parseInt(sp1.getSelectedItem().toString())+Integer.parseInt(sp2.getSelectedItem().toString())+Integer.parseInt(sp3.getSelectedItem().toString())+Integer.parseInt(sp4.getSelectedItem().toString())+Integer.parseInt(sp5.getSelectedItem().toString())+Integer.parseInt(sp6.getSelectedItem().toString());
                totalCost=Integer.parseInt(sp1.getSelectedItem().toString())*120.0+Integer.parseInt(sp2.getSelectedItem().toString())*70.0+Integer.parseInt(sp3.getSelectedItem().toString())*100.0+Integer.parseInt(sp4.getSelectedItem().toString())*50.0+Integer.parseInt(sp5.getSelectedItem().toString())*20.0+Integer.parseInt(sp6.getSelectedItem().toString())*200.0;
                String ediTextone=totalItems.toString();
                ed71.setText(ediTextone);
                String ediTexttwo=totalCost.toString();
                ed72.setText(ediTexttwo);
                if (totalCost > 0.0) {
                    Handler delay=new Handler();
                    delay.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            Intent FoodPass = new Intent(FoodBilling.this, FoodPassword.class);
                            startActivity(FoodPass);
                        }
                    },2000);

                }
                else {
                    Toast.makeText(FoodBilling.this,"Please order to proceed",Toast.LENGTH_LONG).show();
                }



            }
        });


    }
}
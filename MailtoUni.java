package com.example.mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MailtoUni extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mailto_uni);

        Button feedback=(Button)findViewById(R.id.feedbackB);
        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MailtoUni.this, "Feedback is sent", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
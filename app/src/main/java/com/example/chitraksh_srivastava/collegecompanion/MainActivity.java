package com.example.chitraksh_srivastava.collegecompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btncgpa=findViewById(R.id.cgpacalc);
        btncgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(MainActivity.this,calculator_cgpa.class);
                startActivity(in);
            }
        });
        Button btnatt= findViewById(R.id.attedancemanager);
        btnatt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,AttendanceOptions.class);
                startActivity(i);
            }
        });

    }


}


package com.example.chitraksh_srivastava.collegecompanion;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AttendanceOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.attendance_options);
        Button btnsub=findViewById(R.id.addsub);
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in;
                in = new Intent(AttendanceOptions.this,subject_card.class);
                startActivity(in);
            }
        });
        Button btnmanage= findViewById(R.id.attendlog);
        btnmanage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(AttendanceOptions.this,subject_card.class);
                startActivity(i);
            }
        });
    }
}

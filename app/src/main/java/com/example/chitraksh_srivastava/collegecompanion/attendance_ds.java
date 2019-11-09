package com.example.chitraksh_srivastava.collegecompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class attendance_ds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_ds);

        //final ProgressBar p = (ProgressBar) findViewById(R.id.prog);
        //TextView perc = (TextView) findViewById(R.id.percentage);
        TextView estimate = (TextView) findViewById(R.id.estimate);
        TextView ca = (TextView) findViewById(R.id.ca);
        TextView tc = (TextView) findViewById(R.id.tc);

        int class_attended = 26;
        ca.setText(class_attended+"");
        int total_classes = 30;
        tc.setText(total_classes+"");
        double percentage = (double) class_attended / total_classes * 100;
        int pro = (int) percentage;
        //p.setProgress(pro);
        double n = ((85*total_classes)-(100*class_attended))/15;
        int att = (int) Math.round(n);

        estimate.setText("Attend "+att+" more classes to meet criteria!");



        //perc.setText(percentage+"");




    }
}

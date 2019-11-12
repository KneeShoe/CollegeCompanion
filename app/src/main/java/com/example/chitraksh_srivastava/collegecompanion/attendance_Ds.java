package com.example.chitraksh_srivastava.collegecompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class attendance_Ds extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance__ds);
        //Declarations
        ProgressBar prog = (ProgressBar) findViewById(R.id.prog);
        TextView ca = (TextView) findViewById(R.id.classes_attended_num);
        TextView tc = (TextView) findViewById(R.id.total_classes_num);
        TextView est = (TextView) findViewById(R.id.estimate);
        TextView percentage = (TextView) findViewById(R.id.percentage);

        //Results_predefined
        String result_1 = "Congrats! You're on track . Keep up the good work .";
        String result_2 = "Oops! Attend ";

        //Initialization
        double ca_num = 29;
        double tc_num = 30;
        ca.setText(ca_num+"");
        tc.setText(tc_num+"");


        //Calculation
        double att_perc =(ca_num/tc_num)*100;
        double att = ((85*tc_num)-(100*ca_num))/15;
        int round_att_perc = Math.round((int)att_perc);
        prog.setProgress(round_att_perc);
        DecimalFormat df=new DecimalFormat("##.##");

        percentage.setText(df.format(att_perc)+"%");

        if(att<0)
        {
            est.setText(result_1);
        }
        else
        {
            est.setText(result_2+ att +" classes to get back on track");
        }

    }
}

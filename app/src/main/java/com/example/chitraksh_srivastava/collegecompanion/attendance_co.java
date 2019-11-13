package com.example.chitraksh_srivastava.collegecompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.DecimalFormat;

public class attendance_co extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance_co);
        calculate(3);

        Button tick = (Button) findViewById(R.id.tick);
        Button untick = (Button) findViewById(R.id.untick);
        //Button_functions
        tick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(1);
            }
        });

        untick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate(0);
            }
        });

    }

    double ca_num = 19;
    double tc_num = 23;

    public void calculate(int i)
    {

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

        ca.setText(ca_num+"");
        tc.setText(tc_num+"");

        //updation
        if(i==1)
        {
            ca_num = ca_num + 1 ;
            tc_num = tc_num + 1 ;
        }
        if(i==0)
        {
            tc_num = tc_num + 1;
        }
        ca.setText(ca_num+"");
        tc.setText(tc_num+"");

        //Calculation
        double att_perc =(ca_num/tc_num)*100;
        double att = ((85*tc_num)-(100*ca_num))/15;
        int round_att_perc = Math.round((int)att_perc);
        int to_attend = Math.round((int)att);
        prog.setProgress(round_att_perc);
        DecimalFormat df=new DecimalFormat("##.##");

        percentage.setText(df.format(att_perc)+"%");

        if(att<=0)
        {
            est.setText(result_1);
        }
        else
        {
            est.setText(result_2+ to_attend +" classes to get back on track");
        }


    }
}

package com.example.chitraksh_srivastava.collegecompanion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import java.text.DecimalFormat;

public class calculator_cgpa extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_calculator);

        Button calscgpa = (Button) findViewById(R.id.calsgpa);
        calscgpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Retrieve
                //Subjects
                EditText s1 = findViewById(R.id.sub1);
                EditText s2 = findViewById(R.id.sub2);
                EditText s3 = findViewById(R.id.sub3);
                EditText s4 = findViewById(R.id.sub4);
                EditText s5 = findViewById(R.id.sub5);
                //Credits
                EditText c1 = findViewById(R.id.cred1);
                EditText c2 = findViewById(R.id.cred2);
                EditText c3 = findViewById(R.id.cred3);
                EditText c4 = findViewById(R.id.cred4);
                EditText c5 = findViewById(R.id.cred5);
                //Scores
                EditText sc1 = findViewById(R.id.avg1);
                EditText sc2 = findViewById(R.id.avg2);
                EditText sc3 = findViewById(R.id.avg3);
                EditText sc4 = findViewById(R.id.avg4);
                EditText sc5 = findViewById(R.id.avg5);
                //Values
                //subject_names
                String sub1 = (String) (s1.getText().toString());
                String sub2 = (String) (s2.getText().toString());
                String sub3 = (String) (s3.getText().toString());
                String sub4 = (String) (s4.getText().toString());
                String sub5 = (String) (s5.getText().toString());
                //credits_value
                int cred1 = (Integer) Integer.parseInt(c1.getText().toString());
                int cred2 = (Integer) Integer.parseInt(c2.getText().toString());
                int cred3 = (Integer) Integer.parseInt(c3.getText().toString());
                int cred4 = (Integer) Integer.parseInt(c4.getText().toString());
                int cred5 = (Integer) Integer.parseInt(c5.getText().toString());
                //score_values
                int a1 = (Integer) Integer.parseInt(sc1.getText().toString());
                int a2 = (Integer) Integer.parseInt(sc2.getText().toString());
                int a3 = (Integer) Integer.parseInt(sc3.getText().toString());
                int a4 = (Integer) Integer.parseInt(sc4.getText().toString());
                int a5 = (Integer) Integer.parseInt(sc5.getText().toString());
                //Calculations
                String a = "Fill all fields correctly !";
                if(cred1==0||cred2==0||cred3==0||cred4==0||cred5==0)
                {
                    Toast.makeText(getApplicationContext(),a,Toast.LENGTH_LONG).show();
                }

                int tc = cred1 + cred2 + cred3 + cred4 + cred5;
                double sgpa = (((a1 / 5.0) * cred1) + ((a2 / 5.0) * cred2) + ((a3 / 5.0) * cred3) + ((a4 / 5.0) * cred4) + ((a5 / 5.0) * cred5)) / tc;
                TextView ans = findViewById(R.id.sgpa);
                DecimalFormat d = new DecimalFormat("##.##");

                ans.setText(d.format(sgpa));
            }
        });
    }
}

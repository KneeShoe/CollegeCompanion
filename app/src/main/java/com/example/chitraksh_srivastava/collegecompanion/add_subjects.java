package com.example.chitraksh_srivastava.collegecompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class add_subjects extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_subjects);

        final EditText ca = (EditText) findViewById(R.id.ca);
        final EditText ta = (EditText) findViewById(R.id.ta);
        final TextView estimate = (TextView) findViewById(R.id.estimate);
        Button b = (Button) findViewById(R.id.button);
        Spinner subs = (Spinner) findViewById(R.id.subs);
        String[] items = new String[]{"DS","DMS","IWT","OJ","LD","CO"};

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(add_subjects.this,attendance_iwt.class);
                int classes_attended = Integer.parseInt(ca.getText().toString());
                i.putExtra("classes_attended",classes_attended);
                int total_attended = Integer.parseInt(ta.getText().toString());
                i.putExtra("total_attended",total_attended);
                 int toatt = ((85*total_attended)-(100*classes_attended))/15;
                 int att = (int) Math.round(toatt);
                 String s1="Congrats you're on track!";
                 String s2="You're lagging behind!"+"You need to attend "+att+" classes to be on track";

                 if(att<0)
                     estimate.setText(s1);
                 else
                     estimate.setText(s2);




            }
        });






    }
}

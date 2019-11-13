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







    }
}

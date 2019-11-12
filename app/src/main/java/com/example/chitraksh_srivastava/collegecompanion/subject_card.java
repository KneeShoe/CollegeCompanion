package com.example.chitraksh_srivastava.collegecompanion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class subject_card extends AppCompatActivity implements View.OnClickListener{
    private CardView subDS,subIWT,subDMS,subOJ,subCO,subLD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_card);
        //defining_all_cards
        subDS = (CardView) findViewById(R.id.DS);
        subIWT = (CardView) findViewById(R.id.IWT);
        subDMS = (CardView) findViewById(R.id.DMS);
        subCO = (CardView) findViewById(R.id.CO);
        subOJ = (CardView) findViewById(R.id.OJ);
        subLD = (CardView) findViewById(R.id.LD);
        //setting_onclickListener_to_all_cards
        subOJ.setOnClickListener(this);
        subCO.setOnClickListener(this);
        subDS.setOnClickListener(this);
        subDMS.setOnClickListener(this);
        subIWT.setOnClickListener(this);
        subLD.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent i;
        switch(view.getId())
        {
            case R.id.DS : i = new Intent(this,attendance_Ds.class);
                startActivity(i);
                break;
            case R.id.IWT : i = new Intent(this,attendance_iwt.class);
                startActivity(i);
                break;
            case R.id.DMS : i = new Intent(this,attendance_dms.class);
                startActivity(i);
                break;
            case R.id.OJ : i = new Intent(this,attendance_oj.class);
                startActivity(i);
                break;
            case R.id.CO : i = new Intent(this,attendance_co.class);
                startActivity(i);
                break;
            case R.id.LD : i = new Intent(this,attendance_ld.class);
                startActivity(i);
                break;
            default: break;
        }


    }
}

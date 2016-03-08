package com.jonny.gamehelper;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class RiskHelper extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner mySpin;
    Spinner mySpinDef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_risk_helper);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        mySpin = (Spinner) findViewById(R.id.mySpinspn);
        mySpinDef = (Spinner) findViewById(R.id.mySpinForDef);

        ArrayAdapter myArrayAdpt = ArrayAdapter.createFromResource(
                this, R.array.NoOfAttspn, R.layout.spinner_item);

        ArrayAdapter myArrayAdptDef = ArrayAdapter.createFromResource(
                this, R.array.NoOfDefspn, R.layout.spinner_item);

        mySpin.setAdapter(myArrayAdpt);
        mySpin.setOnItemSelectedListener(this);

        mySpinDef.setAdapter(myArrayAdptDef);
        mySpinDef.setOnItemSelectedListener(this);

    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myTxtspn = (TextView)view;

        Toast.makeText(this,"Selected " + myTxtspn.getText(),Toast.LENGTH_LONG).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}



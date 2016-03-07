package com.jonny.gamehelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GamesMenu extends AppCompatActivity {

    ImageButton button_risk, button_die, button_monopoly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_menu);
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

        OnClickToRisk();
        OnClickToDie();
        OnClickToMonopoly();
    }

    public void OnClickToRisk(){
        button_risk = (ImageButton)findViewById(R.id.imgBtnRisk);
        button_risk.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent riskIntent = new Intent("com.jonny.gamehelper.RiskHelper");
                        startActivity(riskIntent);
                    }
                }
        );
    }

    public void OnClickToDie(){
        button_die = (ImageButton)findViewById(R.id.imgBtnDie);
        button_die.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent dieIntent = new Intent("com.jonny.gamehelper.DiceHelper");
                        startActivity(dieIntent);
                    }
                }
        );
    }

    public void OnClickToMonopoly(){
        button_monopoly = (ImageButton)findViewById(R.id.imgBtnMonopoly);
        button_monopoly.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent monoIntent = new Intent("com.jonny.gamehelper.MonopolyHelper");
                        startActivity(monoIntent);
                    }
                }
        );
    }


}

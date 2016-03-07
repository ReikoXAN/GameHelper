package com.jonny.gamehelper;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Hub extends AppCompatActivity {

    private static ImageButton button_gamesmenu;
    private static ImageButton button_instructmenu;
    private static ImageButton button_stats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);
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

        onClickToGames();
        onClikcToInstructions();
        onClickToStats();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickToGames(){
        button_gamesmenu = (ImageButton)findViewById(R.id.imgBtnGames);
        button_gamesmenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent gameMenuIntent = new Intent("com.jonny.gamehelper.GamesMenu");
                        startActivity(gameMenuIntent);
                    }
                }
        );
    }

    public void onClikcToInstructions(){
        button_instructmenu = (ImageButton)findViewById(R.id.imgBtnInstructions);
        button_instructmenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent instructIntent = new Intent("com.jonny.gamehelper.InstructionsMenu");
                        startActivity(instructIntent);
                    }
                }
        );

    }

    public void onClickToStats(){
        button_stats = (ImageButton)findViewById(R.id.imgBtnProfile);
        button_stats.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent statsIntent = new Intent("com.jonny.gamehelper.Stats");
                        startActivity(statsIntent);
                    }
                }
        );
    }
}

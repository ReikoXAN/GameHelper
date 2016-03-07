package com.jonny.gamehelper;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static Button button_tologin;
    private static Button button_toregister;
    private static Button button_guesttohub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
        onClickToLogin();
        onClickViaRegister();
        onClickGuestPass();
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

    public void onClickToLogin(){
        button_tologin = (Button)findViewById(R.id.btnViaLogin);
        button_tologin.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent toLoginIntent = new Intent("com.jonny.gamehelper.Login");
                        startActivity(toLoginIntent);
                    }
                }
        );

    }

    public void onClickViaRegister(){
        button_toregister = (Button)findViewById(R.id.btnViaRegister);
        button_toregister.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent toRegIntent = new Intent("com.jonny.gamehelper.Register");
                        startActivity(toRegIntent);
                    }
                }
        );
    }

    public void onClickGuestPass(){
        button_guesttohub = (Button)findViewById(R.id.btnGuest);
        button_guesttohub.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent guestIntent = new Intent("com.jonny.gamehelper.Hub");
                        startActivity(guestIntent);
                    }
                }
        );
    }
}

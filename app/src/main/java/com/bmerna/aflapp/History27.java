package com.bmerna.aflapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class History27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history27);
    }
    public void goMain(View v){
        Intent i = new Intent(this,Main27.class);
        startActivity(i);
    }
    public void goStandings(View v){
        Intent i = new Intent(this,Standings27.class);
        startActivity(i);
    }
    public void goCoaches(View v){
        Intent i = new Intent(this,Coaches27.class);
        startActivity(i);
    }
    public void goSchedule(View v){
        Intent i = new Intent(this,Schedule27.class);
        startActivity(i);
    }
    public void goRules(View v){
        Intent i = new Intent(this,Rules27.class);
        startActivity(i);
    }
    public void goArchive(View v){
        Intent i = new Intent(this,Archive27.class);
        startActivity(i);
    }
    public void goHistory(View v){
        Intent i = new Intent(this,History27.class);
        startActivity(i);
    }
}

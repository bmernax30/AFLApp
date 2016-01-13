package com.bmerna.aflapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class Schedule27 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule27);

        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter=ArrayAdapter.createFromResource(this,R.array.coaches,android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
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

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

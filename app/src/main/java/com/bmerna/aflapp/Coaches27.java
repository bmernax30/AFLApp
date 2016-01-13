package com.bmerna.aflapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.content.res.AssetManager;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Coaches27 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaches27);
        //Spinner Stuff
        Spinner spinner = (Spinner) findViewById(R.id.spinnerCoach);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.coaches, android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void goMain(View v) {
        Intent i = new Intent(this, Main27.class);
        startActivity(i);
    }

    public void goStandings(View v) {
        Intent i = new Intent(this, Standings27.class);
        startActivity(i);
    }

    public void goCoaches(View v) {
        Intent i = new Intent(this, Coaches27.class);
        startActivity(i);
    }

    public void goSchedule(View v) {
        Intent i = new Intent(this, Schedule27.class);
        startActivity(i);
    }

    public void goRules(View v) {
        Intent i = new Intent(this, Rules27.class);
        startActivity(i);
    }

    public void goArchive(View v) {
        Intent i = new Intent(this, Archive27.class);
        startActivity(i);
    }

    public void goHistory(View v) {
        Intent i = new Intent(this, History27.class);
        startActivity(i);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String coach;
        TextView spinnerText = (TextView) view;

        coach = (String) spinnerText.getText();
        readText(coach);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public void readText(String coach) {
        TextView profileText = (TextView) findViewById(R.id.profileText);
        AssetManager assetManager = getAssets();

        //To load txt file
        InputStream input;
        profileText.setText("");
        try {
            input = assetManager.open(selectProfile(coach));
            int size = input.available();
            byte[] buffer = new byte[size];
            input.read(buffer);
            input.close();

            //byte buffer into a string
            String text = new String(buffer);
            profileText.setText(text);
        } catch (IOException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public String selectProfile(String coach) {
        String path = "path";
        ImageView profileImage = (ImageView) findViewById(R.id.profileImage);
        ImageView coachImage =(ImageView) findViewById(R.id.coachImage);
        TextView coachText = (TextView) findViewById(R.id.coachText);
        coachText.setText(coach);
        profileImage.setImageResource(0);
        coachImage.setImageResource(0);

        switch (coach) {
            case "BLSmooth":
                path = "CoachProfilesSeason27/BLSmoothProfile";
                coachImage.setImageResource((R.drawable.blsmooth));
                break;
            case "Caine":
                coachImage.setImageResource((R.drawable.caine));
                path = "CoachProfilesSeason27/CaineProfile";
                break;
            case "Grungy":
                coachImage.setImageResource((R.drawable.grungy));
                path = "CoachProfilesSeason27/GrungyProfile";
                break;
            case "Dirty Randy":
                coachImage.setImageResource((R.drawable.dirtyrandy));
                path = "CoachProfilesSeason27/DirtyRandyProfile";
                break;
            case "T-Bone":
                coachImage.setImageResource((R.drawable.tbone));
                path = "CoachProfilesSeason27/TBoneProfile";
                break;
            case "Gags":
                coachImage.setImageResource((R.drawable.gags));
                path = "CoachProfilesSeason27/GagsProfile";
                break;
            case "Thadd":
                coachImage.setImageResource((R.drawable.thadd));
                path = "CoachProfilesSeason27/ThaddProfile";
                break;
            case "Delaney":
                coachImage.setImageResource((R.drawable.delaney));
                profileImage.setImageResource(R.drawable.delaneyprofile);
                break;
            case "Supreme":
                coachImage.setImageResource((R.drawable.supreme));
                path = "CoachProfilesSeason27/SupremeProfile";
                break;
            case "BFH":
                coachImage.setImageResource((R.drawable.bfhprofpic));
                path = "CoachProfilesSeason27/BFHProfile";
                break;
            case "AFLKyle":
                coachImage.setImageResource((R.drawable.aflkyle));
                path = "CoachProfilesSeason27/AFLKyleProfile";
                break;
            case "Captain":
                coachImage.setImageResource((R.drawable.captain));
                path = "CoachProfilesSeason27/CaptainProfile";
                break;
            case "Paul":
                coachImage.setImageResource((R.drawable.paul));
                path = "CoachProfilesSeason27/PaulProfile";
                break;
            case "Coach Z":
                coachImage.setImageResource((R.drawable.coachz));
                path = "CoachProfilesSeason27/CoachZProfile";
                break;
            case "Rico":
                coachImage.setImageResource((R.drawable.rico));
                path = "CoachProfilesSeason27/RicoProfile";
                break;
        }
        return path;
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Coaches27 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.bmerna.aflapp/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Coaches27 Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app deep link URI is correct.
                Uri.parse("android-app://com.bmerna.aflapp/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}

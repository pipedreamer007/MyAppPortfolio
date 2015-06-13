package com.example.james.appportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class AppPortfolio extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_app_portfolio, menu);
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

    // Function fires when user clicks the "Spotify Streamer" button
    public void saySpotify(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Spotify app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);
        toast.show();
    }

    // Function fires when user clicks the "Scores App" button
    public void sayScores(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Scores app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);
        toast.show();
    }

    // Function fires when user clicks the "Library App" button
    public void sayLibrary(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Library app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);
        toast.show();
    }

    // Function fires when user clicks the "Build It Bigger" button
    public void sayBuildItBigger(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Build It Bigger app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);
        toast.show();
    }

    // Function fires when user clicks the "XYZ Reader" button
    public void sayXYZReader(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my XYZ Reader app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);
        toast.show();
    }

    // Function fires when user clicks the "Capstone" button
    public void sayCapstone(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my Capstone app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER, 0, 0);
        toast.show();
    }

}

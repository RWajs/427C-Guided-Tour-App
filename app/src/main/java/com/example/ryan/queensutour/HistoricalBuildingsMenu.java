package com.example.ryan.queensutour;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class HistoricalBuildingsMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_buildings_menu);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Button button = (Button) findViewById(R.id.Benidickson);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),BenidicksonBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button1 = (Button) findViewById(R.id.Grant);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GrantHallBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button2 = (Button) findViewById(R.id.Nicol);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),NicolHallBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button3 = (Button) findViewById(R.id.Kingston);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),KingstonHallBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button4 = (Button) findViewById(R.id.Summerhill);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),SummerhillBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button5 = (Button) findViewById(R.id.Theological);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TheologicalHallBldg.class);
                startActivityForResult(intent,0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_historical_buildings_menu, menu);
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
}

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


public class EngineeringBuildingsMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering_buildings_menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Button button = (Button) findViewById(R.id.Chernoff);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ChernoffHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button1 = (Button) findViewById(R.id.Clark);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ClarkHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button2 = (Button) findViewById(R.id.Dupuis);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DupuisHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button3 = (Button) findViewById(R.id.Ellis);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),EllisHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button4 = (Button) findViewById(R.id.Goodwin);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GoodwinHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button5 = (Button) findViewById(R.id.ILC);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ILCBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button6 = (Button) findViewById(R.id.IC);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),InnovationCommonsBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button7 = (Button) findViewById(R.id.Mclaughlin);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MclaughlinHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button8 = (Button) findViewById(R.id.Miller);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MillerHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button9 = (Button) findViewById(R.id.Stirling);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),StirlingHallBuilding.class);
                startActivityForResult(intent,0);
            }
        });
        Button button10 = (Button) findViewById(R.id.Walter);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),WalterLightBuilding.class);
                startActivityForResult(intent,0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_engineering_buildings_menu, menu);
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

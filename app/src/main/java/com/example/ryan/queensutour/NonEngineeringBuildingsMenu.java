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


public class NonEngineeringBuildingsMenu extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_non_engineering_buildings_menu);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setRequestedOrientation (ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Button button = (Button) findViewById(R.id.Arc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ARCBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button1 = (Button) findViewById(R.id.Douglas);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),DouglasBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button2 = (Button) findViewById(R.id.Gordon);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),GordonBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button3 = (Button) findViewById(R.id.JDUC);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),JDUCBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button4 = (Button) findViewById(R.id.MCor);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),MacCorryBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button5 = (Button) findViewById(R.id.Nixon);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),NixonFieldBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button6 = (Button) findViewById(R.id.Stauff);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),StaufferBldg.class);
                startActivityForResult(intent,0);
            }
        });
        Button button7 = (Button) findViewById(R.id.Tindall);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),TindallBldg.class);
                startActivityForResult(intent,0);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_non_engineering_buildings_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent = new Intent(NonEngineeringBuildingsMenu.this,About.class);
            startActivityForResult(intent,0);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

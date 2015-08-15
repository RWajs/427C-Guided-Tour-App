package com.example.ryan.queensutour;

import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class ProTips extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro_tips);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        Button t1 = (Button) findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip1);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t2 = (Button) findViewById(R.id.t2);
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip2);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t3 = (Button) findViewById(R.id.t3);
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip3);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t4 = (Button) findViewById(R.id.t4);
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip4);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t5 = (Button) findViewById(R.id.t5);
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip5);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t6 = (Button) findViewById(R.id.t6);
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip6);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t7 = (Button) findViewById(R.id.t7);
        t7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip7);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t8 = (Button) findViewById(R.id.t8);
        t8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip8);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t9 = (Button) findViewById(R.id.t9);
        t9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip9);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t10 = (Button) findViewById(R.id.t10);
        t10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip10);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t11 = (Button) findViewById(R.id.t11);
        t11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip11);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button t12 = (Button) findViewById(R.id.t12);
        t12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) ProTips.this.findViewById(R.id.tip12);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
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

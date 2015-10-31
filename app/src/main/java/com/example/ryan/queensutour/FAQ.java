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


public class FAQ extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        Button q1 = (Button) findViewById(R.id.Question1);
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A1FAQPage);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q2 = (Button) findViewById(R.id.Q2);
        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A2);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q3 = (Button) findViewById(R.id.Q3);
        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A3);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q4 = (Button) findViewById(R.id.Q4);
        q4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A4);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q5 = (Button) findViewById(R.id.Q5);
        q5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A5);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q6 = (Button) findViewById(R.id.Q6);
        q6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A6);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q7 = (Button) findViewById(R.id.Q7);
        q7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A7);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q8 = (Button) findViewById(R.id.Q8);
        q8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A8);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q9 = (Button) findViewById(R.id.Q9);
        q9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A9);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q10 = (Button) findViewById(R.id.Q10);
        q10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A10);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q11 = (Button) findViewById(R.id.Q11);
        q11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A11);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q12 = (Button) findViewById(R.id.Q12);
        q12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A12);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q13 = (Button) findViewById(R.id.Q13);
        q13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A13);
                if (a.getVisibility() == View.GONE)
                    a.setVisibility(View.VISIBLE);
                else if (a.getVisibility() == View.VISIBLE)
                    a.setVisibility(View.GONE);
            }
        });

        Button q14 = (Button) findViewById(R.id.Q14);
        q14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView a = (TextView) FAQ.this.findViewById(R.id.A14);
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
        getMenuInflater().inflate(R.menu.menu_faq, menu);
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

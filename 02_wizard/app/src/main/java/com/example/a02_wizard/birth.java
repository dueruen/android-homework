package com.example.a02_wizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;

import java.util.Date;


public class birth extends AppCompatActivity {
    public static final String BIRTH = "com.example.myfirstapp.MESSAGE3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birth);

        ((Button) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        CalendarView cal = (CalendarView) findViewById(R.id.calendarView);
        cal.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                getIntent().putExtra(BIRTH, dayOfMonth +" / " + (month+1) + " / " + year);

            }
        });
    }

    public void sendMessage(View view) {
        getIntent().setClass(this, end.class);
        startActivity(getIntent());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "BirthActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "BirthActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "BirthActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "BirthActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "BirthActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "BirthActivity onRestart");
    }
}

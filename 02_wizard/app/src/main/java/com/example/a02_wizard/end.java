package com.example.a02_wizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);

        Intent intent = getIntent();

        String nameMessage = intent.getStringExtra(MainActivity.NAME);
        TextView textView = findViewById(R.id.name);
        textView.setText(nameMessage);

        String addressMessage = intent.getStringExtra(address.ADDRESS);
        TextView textAdd = findViewById(R.id.address);
        textAdd.setText(addressMessage);

        String birthMessage = intent.getStringExtra(birth.BIRTH);
        TextView textBirth = findViewById(R.id.birth);
        textBirth.setText(birthMessage);

        ((Button) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "SumActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "SumActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "SumActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "SumActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "SumActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "SumActivity onRestart");
    }
}

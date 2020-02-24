package com.example.a02_wizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class address extends AppCompatActivity {
    public static final String ADDRESS = "com.example.myfirstapp.MESSAGE2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);

        ((Button) findViewById(R.id.back)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void sendMessage(View view) {
        getIntent().setClass(this, birth.class);
        EditText editText = (EditText) findViewById(R.id.textAddress);

        String name = getIntent().getStringExtra(MainActivity.NAME);
        String message = editText.getText().toString();
        getIntent().putExtra(ADDRESS, message);
        startActivity(getIntent());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "AddressActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "AddressActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "AddressActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "AddressActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "AddressActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "AddressActivity onRestart");
    }
}

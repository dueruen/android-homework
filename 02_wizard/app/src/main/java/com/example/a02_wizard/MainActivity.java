package com.example.a02_wizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    public static final String NAME = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, address.class);
        EditText editText = (EditText) findViewById(R.id.textName);
        String message = editText.getText().toString();
        intent.putExtra(NAME, message);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("TAG", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("TAG", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("TAG", "MainActivity onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("TAG", "MainActivity onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("TAG", "MainActivity onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("TAG", "MainActivity onRestart");
    }
}

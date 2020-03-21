package com.example.a09_threads_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.TextSwitcher;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread t = new Thread(new changeText());
        t.start();
    }

    class changeText implements Runnable {

        @Override
        public void run() {
            while(true) {
                handler.post(new Runnable() {
                    TextView textview = (TextView) findViewById(R.id.text);
                    @Override
                    public void run() {
                        textview.setText(random());
                    }
                });
                try {
                    Thread.sleep(2500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        private String random() {
            int MAX_LENGTH = 100;
            Random generator = new Random();
            StringBuilder randomStringBuilder = new StringBuilder();
            int randomLength = generator.nextInt(MAX_LENGTH);
            char tempChar;
            for (int i = 0; i < randomLength; i++){
                tempChar = (char) (generator.nextInt(96) + 32);
                randomStringBuilder.append(tempChar);
            }
            return randomStringBuilder.toString();
        }
    }
}

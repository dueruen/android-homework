package com.example.a06_fragment_01;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void updateFragment(Fragment currentFragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment, currentFragment).addToBackStack(null).commit();
    }

    public void whiteClick(View view) {
        updateFragment(new WhiteFragment());
    }
    public void redClick(View view) {
        updateFragment(new RedFragment());
    }
    public void greenClick(View view) {
        updateFragment(new GreenFragment());
    }
    public void blueClick(View view) {
        updateFragment(new BlueFragment());
    }
}

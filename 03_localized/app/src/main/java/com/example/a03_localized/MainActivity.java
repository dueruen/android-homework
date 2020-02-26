package com.example.a03_localized;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Bitmap> images = new ArrayList<>();
    private ImageView mImageView;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        images.add(BitmapFactory.decodeResource(getResources(), R.drawable.gopher01));
        images.add(BitmapFactory.decodeResource(getResources(), R.drawable.gopher02));
        mImageView = findViewById(R.id.imageView);

        setImage();
    }

    public void setImage() {
        mImageView.setImageBitmap(images.get(index));
    }

    public void nextClick(View view) {
        if (index >= images.size()-1) {
            index = 0;
        } else {
            index++;
        }
        setImage();
    }

    public void previousClick(View view) {
        if (index <= 0) {
            index = images.size() - 1;
        } else {
            index--;
        }
        setImage();
    }
}

package com.asusoftware.bottleflip;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    int angle = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rotate(View view) {
        ImageView iv = (ImageView)findViewById(R.id.bottleImage);
        int randomNumber = (int)(Math.random()*24) * 30;
        angle = 360 + randomNumber;
        if(angle == 800) {
            iv.animate().setDuration(500).rotation(angle - 360).start();
        } else {
            iv.animate().setDuration(500).rotation(angle).start();
        }

    }
}
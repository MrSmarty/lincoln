package com.example.lincoln.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    background(255, 255, 255);
    mouseDragged = function() {
        fill(mouseX, mouseX/10 + mouseY/15, mouseY); //sets color to random
        ellipse(mouseX, mouseY, 10, 10);
    };
}





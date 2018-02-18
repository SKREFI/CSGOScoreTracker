package com.skrefi.csgoscoretracker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int ctScore=0;
    int tScore=0;

    public void addPointCT(View view) {
        if(ctScore>=0)
            ctScore++;
        displayCTPoints(ctScore);
    }

    public void addPointT(View view) {
        if(tScore>=0)
            tScore++;
        displayTPoints(tScore);
    }

    private void displayCTPoints(int number) {
        TextView ctPointsTextView = findViewById(R.id.ctScoreTextView);
        ctPointsTextView.setText("" + number);
    }

    private void displayTPoints(int number) {
        TextView tPointsTextView = findViewById(R.id.tScoreTextView);
        tPointsTextView.setText("" + number);
    }
}


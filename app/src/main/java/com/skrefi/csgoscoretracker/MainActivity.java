package com.skrefi.csgoscoretracker;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean someoneWon = false;
    int duration = Toast.LENGTH_SHORT;
    int ctScore = 0;
    int tScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addPointCT(View view) {
        if (someoneWon == false) {
            Context context = getApplicationContext();
            Toast toastCT = Toast.makeText(context, "CT Won", duration);
            if (ctScore >= 0 && ctScore < 16)
                ctScore++;
            if (ctScore == 16) {
                toastCT.show();
                someoneWon = true;
            }
            displayCTPoints(ctScore);
        }
    }

    public void addPointT(View view) {
        if (someoneWon == false) {
            Context context = getApplicationContext();
            Toast toastT = Toast.makeText(context, "T Won", duration);
            if (tScore >= 0 && tScore < 16)
                tScore++;
            if (tScore == 16) {
                toastT.show();
                someoneWon = true;
            }
            displayTPoints(tScore);
        }
    }

    public void resetScore(View view) {
        tScore = 0;
        ctScore = 0;
        displayTPoints(tScore);
        displayCTPoints(ctScore);
        someoneWon = false;
    }

    private void displayTPoints(int number) {
        TextView ctPointsTextView = findViewById(R.id.ctScoreTextView);
        ctPointsTextView.setText("" + number);
    }

    private void displayCTPoints(int number) {
        TextView tPointsTextView = findViewById(R.id.tScoreTextView);
        tPointsTextView.setText("" + number);
    }
}


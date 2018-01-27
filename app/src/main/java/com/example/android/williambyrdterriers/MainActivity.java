package com.example.android.williambyrdterriers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TRACKS SCORE FOR PATRIOTS

    int scorePatriots = 0;

    //TRACKS SCORE FOR EAGLES
    int scoreEagles = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayScorePatriots(0);
        displayScoreEagles(0);

    }


    /**
     * INCREASE THE SCORE FOR PATRIOTS BY 6 FOR TOUCHDOWN
     */
    public void touchdownPatriots(View v) {
        scorePatriots = scorePatriots + 6;
        displayScorePatriots(scorePatriots);
    }

    public void fieldGoalPatriots(View v) {
        scorePatriots = scorePatriots + 1;
        displayScorePatriots(scorePatriots);
    }

    public void conversionPatriots(View v) {
        scorePatriots = scorePatriots + 2;
        displayScorePatriots(scorePatriots);
    }

    public void safetyEagles(View v) {
        scorePatriots = scorePatriots + 2;
        displayScorePatriots(scorePatriots);
    }


    public void displayScorePatriots(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scorepatroits);
        scoreView.setText(String.valueOf(score));
    }

    //******************************************************************************

    /**
     * INCREASE THE SCORE FOR EAGLES BY 6 FOR TOUCHDOWN
     */
    public void touchdownEagles(View v) {
        scoreEagles = scoreEagles + 6;
        displayScoreEagles(scoreEagles);
    }

    public void fieldGoalEagles(View v) {
        scoreEagles = scoreEagles + 1;
        displayScoreEagles(scoreEagles);
    }

    public void conversionEagles(View v) {
        scoreEagles = scoreEagles + 2;
        displayScoreEagles(scoreEagles);
    }

    public void safetyPatriots(View v) {
        scoreEagles = scoreEagles + 2;
        displayScoreEagles(scoreEagles);
    }

    public void displayScoreEagles(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreeagles);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the score for Team B by 3 points.
     */
    public void reset(View v) {
        scorePatriots = 0;
        scoreEagles = 0;
        displayScorePatriots(scorePatriots);
        displayScoreEagles(scoreEagles);
    }


}

package com.example.android.courtcounter2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // keeps track of Team A score
    int scoreTeamA = 0;
    // keeps track of Team B score
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // add 3 pts to Team A score
    public void add3PointsTeamA(View view) {
        scoreTeamA += 3;
        displayScoreTeamA(scoreTeamA);
    }

    // add 2 pts to Team A score
    public void add2PointsTeamA(View view) {
        scoreTeamA += 2;
        displayScoreTeamA(scoreTeamA);
    }

    // add 1 pt to Team A score
    public void add1PointTeamA(View view) {
        scoreTeamA += 1;
        displayScoreTeamA(scoreTeamA);
    }

    // display Team A score
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText("" + score);
    }

    // add 3 pts to Team B score
    public void add3PointsTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB(scoreTeamB);
    }

    // add 2 pts to Team B score
    public void add2PointsTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB(scoreTeamB);
    }

    // add 1 pt to Team B score
    public void add1PointTeamB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB(scoreTeamB);
    }

    // display team B score
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText("" + score);
    }


    // reset scores to 0, re-display scores
    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
    }
}

package com.pradumnasaraf.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void one_teamA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    public void two_teamA (View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void three_teamA (View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void one_teamB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    public void two_teamB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void three_teamB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA =0;
        scoreTeamB =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
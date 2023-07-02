package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity<view> extends AppCompatActivity
{
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForTeamA(View v)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeForTeamA(View v)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    private void displayForTeamA(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id._0_text_view);
        scoreView.setText(String.valueOf(score));
    }


    public void addOneForTeamB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForTeamB(View view)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeForTeamB(View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void displayForTeamB(int score)
    {
        TextView scoreView = (TextView) findViewById(R.id.y_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void Reset(View view)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

}
package com.example.edu.audiomediaplayeractivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//안돼.xml이 문제
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    MediaPlayer mediaPlayer;
    Button play, stop;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play=(Button)findViewById(R.id.buttonPlay);
        play.setOnClickListener(this);
        stop=(Button)findViewById(R.id.buttonStop);
        stop.setOnClickListener(this);
        mediaPlayer=MediaPlayer.create(this, R.raw.thunder_rain);
    }

    @Override
    public void onClick(View v) {
        mediaPlayer.start();
        stop.setEnabled(true);
        play.setEnabled(false);

        mediaPlayer.pause();
        stop.setEnabled(false);
        play.setEnabled(true);
    }
}

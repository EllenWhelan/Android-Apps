package com.example.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this, R.raw.rick);
    }

    public void playSong(View view){
        mp.start();

    }
    public void pauseSong(View view){
        mp.pause();
    }
    public void stopSong(View view){
        mp.stop();
        mp=MediaPlayer.create(this, R.raw.rick);
    }


}
package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vid ;
    MediaController mc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vid = (VideoView)findViewById(R.id.videoView);
    }
    public void playVideo(View v){
        mc= new MediaController(this);
        String path = "src/main/res/raw/beach.mp4";
        Uri u = Uri.parse(path);
        vid.setVideoURI(u);
        vid.start();

    }
}
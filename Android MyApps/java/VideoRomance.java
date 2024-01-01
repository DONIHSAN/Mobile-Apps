package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoRomance extends AppCompatActivity {

    VideoView videoRomance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_romance);

        videoRomance = (VideoView) findViewById(R.id.videoRomance);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoRomance);
        videoRomance.setMediaController(mediaController);
        videoRomance.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.crazylove));
    }
}

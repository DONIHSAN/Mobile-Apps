package com.example.sayhello;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoComedy extends AppCompatActivity {

    VideoView videoComedy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_comedy);

        videoComedy = (VideoView) findViewById(R.id.videoComedy);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoComedy);
        videoComedy.setMediaController(mediaController);
        videoComedy.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.jumanji));
    }
}

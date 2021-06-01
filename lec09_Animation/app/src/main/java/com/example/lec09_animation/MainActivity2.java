package com.example.lec09_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        
        VideoView videoView=findViewById(R.id.videoView);

        String videoPath=("android.resource: //" + getPackageName()+ "/" + R.raw.vedio);
        Uri uri=Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mC=new MediaController(this);
        mC.setAnchorView(videoView);
        videoView.setMediaController(mC);
        videoView.start();
    }
}
package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class C extends AppCompatActivity {
MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        ImageView imageView=findViewById(R.id.imageView3);
        imageView.animate().scaleX(1.5f).scaleY(1.5f).setDuration(4000);
        imageView.animate().scaleX(-1.5f).setDuration(4000);
        mp= MediaPlayer.create(this, R.raw.b);
    }

    public void creataAudioC(View view) {
        mp.start();
    }
}
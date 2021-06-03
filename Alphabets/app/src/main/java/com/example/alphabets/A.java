package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class A extends AppCompatActivity {
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        ImageView imageView=findViewById(R.id.imageView);
        imageView.animate().scaleX(2.0f).scaleY(1.5f).setDuration(4000);
        imageView.animate().scaleX(-2.0f).setDuration(4000);
        mp=MediaPlayer.create(this, R.raw.a);

    }

    public void creatAudio(View view) {
        mp.start();
    }
}
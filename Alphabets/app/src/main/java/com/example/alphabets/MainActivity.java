package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView=findViewById(R.id.image);
        imageView.animate().scaleX(2.0f).scaleY(2.0f).setDuration(4000);

    }

    public void moveActivity(View view) {
        Intent intent= new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}
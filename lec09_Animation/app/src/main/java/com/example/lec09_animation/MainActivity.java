package com.example.lec09_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Animation(View view) {

        ImageView imgView=findViewById(R.id.imageView);
       // imgView.animate().alpha(0).setDuration(1000);   // to disapear image in 2seconds
       // imgView.animate().translationYBy(2000).setDuration(1000); //to slide image to Y-axis in 4sec

      // imgView.animate().rotation(180).setDuration(1000); //to rotate the image by 180 degrees
       // imgView.animate().rotation(180).alpha(0);       //first rotate immage and disappear
        //imgView.animate().scaleX(0.5f);     //scale to X-axis by 0.5float
        imgView.animate().scaleX(0.5f).scaleY(0.5f).rotation(360).setDuration(4000);



    }

}
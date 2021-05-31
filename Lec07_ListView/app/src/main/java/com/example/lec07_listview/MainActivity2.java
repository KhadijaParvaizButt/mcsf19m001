package com.example.lec07_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView txt= findViewById(R.id.textView);
        Intent intent=getIntent();
        Log.d("Checking", intent.getStringExtra("Frnd Name"));

       // txt.setText(intent.getStringExtra("Frnd Name"));



    }
}
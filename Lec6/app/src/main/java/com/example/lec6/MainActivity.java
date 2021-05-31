package com.example.lec6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        //Implicit Intents
    public void Call(View view) {
        Uri uri=Uri.parse("tel: +923090057273");
        Intent intent= new Intent(Intent.ACTION_DIAL,uri); //Action_Dial is used to open dialer in phone with that number
        startActivity(intent);
    }

    public void Openweb(View view) {
        Uri uri=Uri.parse("https://online.pucit.edu.pk/index.php/welcome");
        Intent intent= new Intent(Intent.ACTION_VIEW,uri); //Action_VIEW is used to open website
        startActivity(intent);
    }
}
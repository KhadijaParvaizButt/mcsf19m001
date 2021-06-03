package com.example.alphabets;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

     public void moveToA(View view) {
         final Intent intent= new Intent(this, A.class);
          startActivity(intent);
      }

    public void moveToB(View view) {
        final Intent intent = new Intent(this, B.class);
        startActivity(intent);

    }

    public void moveToC(View view) {
        final Intent intent = new Intent(this, C.class);
        startActivity(intent);
    }
}